package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ToJson {

    public void myNameToJson(String name, String lastname) {
        Person myName = new Person(name, lastname);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(myName);
        System.out.println(json);
    }

}
