package com.steve.whiteboxgames;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void serializeUserSimple() {

        UserSimple user = new UserSimple(
                "Steve",
                "stevebotella@hotmail.fr",
                27,
                true
                );

        Gson gson = new Gson();
        String json = gson.toJson(user);

    }

}
