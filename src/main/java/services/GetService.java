package services;
import api.model.Hour;
import com.crowdar.api.rest.Response;
import java.util.HashMap;
import java.util.Map;

/* 
Get Service class
*/

public class GetService extends BaseService {

    public static Response get(String jsonName) {
        return get(jsonName, Hour[].class, setParams());
    }

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base_url", BASE_URL.get());
        params.put("api_key", API_KEY.get());
        params.put("id_workspace", ID_WORKSPACE.get());
        params.put("id_project", ID_PROJECT.get());
        params.put("id_user", ID_USER.get());
        return params;
    }
}
