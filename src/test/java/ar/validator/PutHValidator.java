package ar.validator;

import api.model.Hour;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;
/*
In this method we validate that the billable value is true
*/

public class PutHValidator {

    public static void validate() {
        Hour response = (Hour) APIManager.getLastResponse().getResponse();
        Assert.assertTrue(response.getBillable(), "No se realizó la actualización");
    }
}
