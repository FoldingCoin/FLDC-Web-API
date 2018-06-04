package net.foldingcoin.api.v1.controllers;

import org.rapidoid.annotation.Controller;
import org.rapidoid.annotation.GET;

import net.foldingcoin.api.LaunchApp;

@Controller(value = "/v1/coins/")
public class Coins {

    @GET("/")
    public String getUserLeaderboard () {

        return LaunchApp.getTempMessage();
    }

    @GET("/{date}")
    public String getCoins (String date) {

        return LaunchApp.getTempMessage(date);
    }

    @GET("/{date}/{coin}")
    public String getSpecificCoin (String date, String coin) {

        return LaunchApp.getTempMessage(date, coin);
    }
}