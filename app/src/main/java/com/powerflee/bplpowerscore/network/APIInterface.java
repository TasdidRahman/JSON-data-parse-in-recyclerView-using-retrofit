package com.powerflee.bplpowerscore.network;

import com.powerflee.bplpowerscore.model.MyTeam;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {

    @GET("csa")
    Call<List<MyTeam>> getTeamData();
}
