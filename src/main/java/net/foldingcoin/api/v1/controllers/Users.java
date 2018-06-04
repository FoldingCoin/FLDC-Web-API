package net.foldingcoin.api.v1.controllers;

import org.rapidoid.annotation.Controller;
import org.rapidoid.annotation.GET;

import net.foldingcoin.api.LaunchApp;

@Controller(value = "/v1/users/")
public class Users {

    @GET("/")
    public String getCurrentUsers () {

        return LaunchApp.getTempMessage();
    }

    @GET("/{date}")
    public String getHistorisUsers (String date) {

        return LaunchApp.getTempMessage(date);
    }

    @GET("/{date}/{name}")
    public String getSpecificUser (String date, String name) {

        return LaunchApp.getTempMessage(date, name);
    }
}