package com.powerflee.bplpowerscore.presenter;

import com.powerflee.bplpowerscore.model.MyTeam;
import com.powerflee.bplpowerscore.network.APIInterface;
import com.powerflee.bplpowerscore.network.ApiClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter {
    MainView mainView;
    APIInterface apiInterface;


    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
        if (apiInterface==null){
            apiInterface = ApiClient.getRetrofit().create(APIInterface.class);
        }
    }


    public void getTeamlist(){
        apiInterface.getTeamData().enqueue(new Callback<List<MyTeam>>() {
            @Override
            public void onResponse(Call<List<MyTeam>> call, Response<List<MyTeam>> response) {
                if (response.isSuccessful()){
                    List<MyTeam> myTeam = response.body();
                    mainView.onDataReady(myTeam);
                }else {
                    mainView.onDataFailed(response.message());
                }

            }

            @Override
            public void onFailure(Call<List<MyTeam>> call, Throwable t) {

                mainView.onDataFailed(t.getMessage());
            }
        });
    }
}
