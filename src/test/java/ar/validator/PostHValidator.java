package ar.validator;

import api.model.Hour;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;
/*
In this method we validate that the Hour id returned in the POST method is not null
*/

public class PostHValidator {

    public static void validate() {
        Hour response = (Hour) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response.getId(), "No se cargó el nuevo time entry");

    }
}
