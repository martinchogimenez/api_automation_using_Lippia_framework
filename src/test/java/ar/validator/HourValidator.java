package ar.validator;

import api.model.DataHour;
import api.model.Hour;
import com.crowdar.api.rest.APIManager;
import com.crowdar.api.rest.Response;
import org.testng.Assert;

public class HourValidator {



    public static void TimeValidator() {


        Hour[] response = (Hour[]) APIManager.getLastResponse().getResponse();
        for (Hour Hour: response) {
            String id = Hour.getId();
            Assert.assertNotNull(id,"El campo ID es nulo");
        }




    }
}
