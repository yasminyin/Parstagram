package com.example.parstagram;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

import static com.parse.ParseObject.registerSubclass;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("OqQ0VCAlN6APMfFWxEftX8H2VX8KZsXBnfoq57ok")
                .clientKey("m505vAGuR40sYRaiqeRj8I66PZhD9B6uIIEmHw1g")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
