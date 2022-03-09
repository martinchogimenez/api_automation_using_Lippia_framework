package ar.steps;

import api.config.EntityConfiguration;
import api.model.Hour;
import ar.validator.GetValidator;
import ar.validator.PostHValidator;
import ar.validator.PutHValidator;

import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import com.google.api.client.repackaged.com.google.common.base.Splitter;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;



import org.apache.commons.lang.StringUtils;
import org.testng.Assert;
import services.BaseService;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class Steps extends PageSteps {

    @When("^I perform a '(.*)' to '(.*)' endpoint with the '(.*)' and '(.*)'$")
    public void doRequest(String methodName, String entity, String jsonName, String jsonReplacementValues)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException,
            SecurityException {
        Class entityService = EntityConfiguration.valueOf(entity).getEntityService();
        Map<String, String> parameters = getParameters(jsonReplacementValues);
        String jsonPath = "request/".concat(jsonName);
        if (parameters == null) {
            entityService.getMethod(methodName.toLowerCase(), String.class).invoke("", jsonPath);
        } else {
            entityService.getMethod(methodName.toLowerCase(), String.class, Map.class).invoke("", jsonPath, parameters);
        }
    }

    private Map<String, String> getParameters(String jsonReplacementValues) {
        Map<String, String> parameters = null;
        if (!StringUtils.isEmpty(jsonReplacementValues)) {
            parameters = Splitter.on(",").withKeyValueSeparator(":").split(jsonReplacementValues);
        }
        return parameters;
    }



    @And("expected response is obtained.")
    public void expectedResponseIsObtained() {
        GetValidator.TimeValidator();

    }




    @Given("My clockify created account and my generated X-Api-Key")
    public void myClockifyCreatedAccountAndMyGeneratedXApiKey() {
        BaseService.API_KEY.set("MmNiMjU0NWYtOTAwZi00NGRjLTlmNTUtODc5MTM5ZDRlZGIw");
        BaseService.BASE_URL.set("https://api.clockify.me/api/v1");
    }

    @And("a valid workspace id")
    public void aValidWorkspaceId() {
        BaseService.ID_WORKSPACE.set("617475360be7933405e795fb");
    }

    @And("a valid project id")
    public void aValidProjectId() {
        BaseService.ID_PROJECT.set("61780c853d249a5ebc6dce67");
        
    }

    @And("a valid user id")
    public void aValidUserId() {
        BaseService.ID_USER.set("616f3f8c99d16c30b318e495");
    }





    @Then("I validate that the obtained data is correct")
    public void iValidateThatTheObtainedDataIsCorrect() {
        PostHValidator.validate();
    }

    @And("I store the time entry id")
    public void iStoreTheTimeEntryId() {
        Hour response = (Hour) APIManager.getLastResponse().getResponse();
        String x = response.getId();
        BaseService.ID_TIME_ENTRY.set(x);
    }



    @Then("I validate billable property status has changed")
    public void iValidateBillablePropertyStatusHasChanged() {
        PutHValidator.validate();
    }

    @And("a project name {string}")
    public void aProjectNameName(String name) {
        BaseService.NAME.set(name);
    }

    @And("I obtain the status code {string}")
    public void iObtainTheStatusCodeStatus(String expStatusCode) {
        int actualStatusCode = APIManager.getLastResponse().getStatusCode();
        Assert.assertEquals(Integer.parseInt(expStatusCode), actualStatusCode, "The status code are not equals");
    }
}
