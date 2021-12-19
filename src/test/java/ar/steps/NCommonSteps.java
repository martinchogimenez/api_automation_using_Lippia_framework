package ar.steps;

import ar.validator.HourValidator;
import ar.validator.PostHValidator;
import ar.validator.PutHValidator;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.BaseService;
import services.HourService;

public class NCommonSteps extends PageSteps {


    @And("expected response is obtained.")
    public void expectedResponseIsObtained() {
        HourValidator.TimeValidator();

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
