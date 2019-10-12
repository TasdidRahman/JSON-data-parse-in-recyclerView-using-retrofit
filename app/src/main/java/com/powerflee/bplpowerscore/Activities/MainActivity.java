package com.powerflee.bplpowerscore.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.powerflee.bplpowerscore.R;

import com.powerflee.bplpowerscore.adapters.RecyclerViewAdapter;
import com.powerflee.bplpowerscore.model.MyTeam;
import com.powerflee.bplpowerscore.presenter.MainPresenter;
import com.powerflee.bplpowerscore.presenter.MainView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {


    private RecyclerView recyclerView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        // jsonrequest();
        MainPresenter mainPresenter = new MainPresenter(this);
        mainPresenter.getTeamlist();
    }


    @Override
    public void onDataReady(List<MyTeam> teamsList) {
//        Toast.makeText(this, ""+teamsList.get(0).getId(), Toast.LENGTH_SHORT).show();

        RecyclerViewAdapter myadapter = new RecyclerViewAdapter(getApplicationContext(),teamsList) ;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myadapter);
    }

    @Override
    public void onDataFailed(String message) {
        Toast.makeText(this, ""+message, Toast.LENGTH_SHORT).show();

    }
}
