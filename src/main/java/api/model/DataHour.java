package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DataHour {

    @JsonProperty("data")
    private Hour data;

    public Hour getData() {
        return data;
    }

    public void setData(Hour data) {
        this.data = data;
    }


}
