package ar.validator;

import api.model.Hour;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;
/*
In this method we validate that the Hour id returned in the GET method is not null
*/

public class GetValidator {

    public static void TimeValidator() {

        Hour[] response = (Hour[]) APIManager.getLastResponse().getResponse();
        for (Hour Hour : response) {
            String id = Hour.getId();
            Assert.assertNotNull(id, "ID field is null");
        }

    }
}
