package net.foldingcoin.api.v1.controllers;

import org.rapidoid.annotation.Controller;
import org.rapidoid.annotation.GET;

import net.foldingcoin.api.LaunchApp;

@Controller(value = "/v1/global/")
public class Global {

    @GET("/")
    public String getCurrentGlobal () {

        return LaunchApp.getTempMessage();
    }

    @GET("/{date}")
    public String getHistoricGlobal (String date) {

        return LaunchApp.getTempMessage(date);
    }
}