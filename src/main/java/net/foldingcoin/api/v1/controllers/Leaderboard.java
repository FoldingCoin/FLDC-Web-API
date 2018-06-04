package net.foldingcoin.api.v1.controllers;

import org.rapidoid.annotation.Controller;
import org.rapidoid.annotation.GET;

import net.foldingcoin.api.LaunchApp;

@Controller(value = "/v1/leaderboard/")
public class Leaderboard {

    @GET("/users/{criteria}/{date}/{amount}")
    public String getUserLeaderboard (String criteria, String date, String amount) {

        return LaunchApp.getTempMessage(criteria, date, amount);
    }

    @GET("/teams/{criteria}/{date}/{amount}")
    public String getTeamLeaderboard (String criteria, String date, String amount) {

        return LaunchApp.getTempMessage(criteria, date, amount);
    }
}