package com.mobiquity.support.geckoboard.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

public class Series {
    @JsonProperty("data")
    private List<List<Object>> data = new ArrayList<List<Object>>();
    private String name;
    
        
    public Series(){}
    
    public Series(String name,List<List<Object>> data){
        
        this.name = name;
        this.data = data;
        
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("data")
    public List<List<Object>> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<List<Object>> data) {
        this.data = data;
    }
}
