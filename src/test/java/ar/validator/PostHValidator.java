package ar.validator;

import api.model.Hour;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;
public class PostHValidator {


    public static void validate(){
        Hour response = (Hour) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response.getId(),"No se cargó el nuevo time entry");

    }
}
