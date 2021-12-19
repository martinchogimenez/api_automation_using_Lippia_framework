package services;


import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;


public class DelService extends BaseService {



    public static Response delete(String jsonName) {
        return delete(jsonName,null,setParams());
    }


    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base_url", BASE_URL.get());
        params.put("api_key",API_KEY.get());
        params.put("id_workspace",ID_WORKSPACE.get());
        params.put("id_time_entry",ID_TIME_ENTRY.get());
        params.put("name",NAME.get());
        return params;
    }
}


