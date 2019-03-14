package com.example.test.spring.model.oreder.header;

import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;

@JsonSerializableSchema 
public class OrderHeader {

    public Result result;

    public OrderHeader(){
        result = new Result();
    }
}