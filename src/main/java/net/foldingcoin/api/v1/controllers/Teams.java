package net.foldingcoin.api.v1.controllers;

import org.rapidoid.annotation.Controller;
import org.rapidoid.annotation.GET;

import net.foldingcoin.api.LaunchApp;

@Controller(value = "/v1/teams/")
public class Teams {

    @GET("/")
    public String getCurrentTeams () {

        return LaunchApp.getTempMessage();
    }

    @GET("/{date}")
    public String getHistorisTeams (String date) {

        return LaunchApp.getTempMessage(date);
    }

    @GET("/{date}/{teamId}")
    public String getSpecificTeam (String date, String teamId) {

        return LaunchApp.getTempMessage(date, teamId);
    }

    @GET("/getName/{teamId}")
    public String getTeamName (String teamId) {

        return LaunchApp.getTempMessage(teamId);
    }
}