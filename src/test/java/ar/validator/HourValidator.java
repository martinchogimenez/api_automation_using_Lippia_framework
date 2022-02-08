package ar.validator;

import api.model.Hour;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class HourValidator {

    public static void TimeValidator() {

        Hour[] response = (Hour[]) APIManager.getLastResponse().getResponse();
        for (Hour Hour : response) {
            String id = Hour.getId();
            Assert.assertNotNull(id, "ID field is null");
        }

    }
}
