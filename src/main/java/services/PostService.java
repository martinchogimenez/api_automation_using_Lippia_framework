package services;


import api.model.Hour;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;


public class PostService extends BaseService {




    public static Response post(String jsonName) {
        return post(jsonName, Hour.class,setParams());
    }



    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();

        params.put("base_url", BASE_URL.get());
        params.put("api_key",API_KEY.get());
        params.put("id_workspace",ID_WORKSPACE.get());
        params.put("name",NAME.get());
        return params;
    }
}


