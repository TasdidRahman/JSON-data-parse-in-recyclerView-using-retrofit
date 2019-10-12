package com.powerflee.bplpowerscore.presenter;

import com.powerflee.bplpowerscore.model.MyTeam;


import java.util.List;

public interface MainView {
    void onDataReady(List<MyTeam> teamsList);
    void onDataFailed(String message);

}
