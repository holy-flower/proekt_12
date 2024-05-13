package com.example.proekt_12;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class JsonManager {
    public void parseJsonUsingGson() {
        String jsonStr = "{\"name\":\"John\", \"age\":30, \"email\":\"john@example.com\"}";
        Gson gson = new Gson();

        User user = gson.fromJson(jsonStr, User.class);

        System.out.println("Name: " + user.name);
        System.out.println("Age: " + user.age);
        System.out.println("Email: " + user.email);
    }

    public String createJsonUsingGson() {
        User user = new User();
        user.name = "Alice";
        user.age = 25;
        user.email = "alice@example.com";

        Gson gson = new Gson();
        return gson.toJson(user);
    }
}
