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
import org.apache.commons.lang.StringUtils;
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

    @And("guardo id del time entry")
    public void guardoIdDelTimeEntry() {
        Hour response = (Hour) APIManager.getLastResponse().getResponse();
        String x = response.getId();
        BaseService.ID_TIME_ENTRY.set(x);
    }

    @And("expected response is obtained.")
    public void expectedResponseIsObtained() {
        GetValidator.TimeValidator();

    }

    @Given("Mi cuenta creada en clockify y mi X-Api-Key generada")
    public void miCuentaCreadaEnClockifyYMiXApiKeyGenerada() {

        BaseService.API_KEY.set("MmNiMjU0NWYtOTAwZi00NGRjLTlmNTUtODc5MTM5ZDRlZGIw");
        BaseService.BASE_URL.set("https://api.clockify.me/api/v1");
    }

    @And("un id workspace valido")
    public void unIdWorkspaceValido() {
        BaseService.ID_WORKSPACE.set("617475360be7933405e795fb");
    }

    @And("^un nombre de proyecto (.*)$")
    public void unNombreDeProyectoName(String name) {
        BaseService.NAME.set(name);
    }

    @Then("Valido que haya cambiado el valor de la propiedad billable")
    public void validoQueHayaCambiadoElValorDeLaPropiedadBillable() {
        PutHValidator.validate();
    }

    @Then("Valido los datos obtenidos sean correctos.")
    public void validoLosDatosObtenidosSeanCorrectos() {
        PostHValidator.validate();
    }

    @And("un id project valido")
    public void unIdProjectValido() {
        BaseService.ID_PROJECT.set("61780c853d249a5ebc6dce67");
    }

    @And("un id de usuario valido")
    public void unIdDeUsuarioValido() {
        BaseService.ID_USER.set("616f3f8c99d16c30b318e495");
    }

}
