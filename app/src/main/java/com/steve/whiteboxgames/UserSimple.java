package com.steve.whiteboxgames;

import com.google.gson.Gson;

public class UserSimple {
    String name;
    String email;
    int age;
    boolean isDeveloper;

    public UserSimple(String name, String email, int age, boolean isDeveloper) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isDeveloper = isDeveloper;
    }

    UserSimple userObject = new UserSimple(
            "Steve",
            "stevebotella@hotmail.fr",
            32,
            true
    );

    Gson gson = new Gson();


}
