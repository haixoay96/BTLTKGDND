package com.example.haixo.chatwithme.activity;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;

import com.example.haixo.chatwithme.Data.User;
import com.example.haixo.chatwithme.R;
import com.example.haixo.chatwithme.adapter.AdapterListUser;
import com.example.haixo.chatwithme.support.DividerItemDecoration;

import java.util.ArrayList;

import static android.R.id.primary;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<User> list;
    private Toolbar toolbar;
    private CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controlView();
        controllEvent();
        setToolbar();
        run();
    }

    private void run() {
        list = new ArrayList<User>();
        for (int i = 0; i < 500; i++) {
            list.add(new User(1, "Duc Linh " + i));
        }
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        AdapterListUser adapterListUser = new AdapterListUser(list);
        recyclerView.setAdapter(adapterListUser);
        //ViewCompat.setTransitionName(toolbar,"Big");
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle("Chat !");
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.transparent));
        collapsingToolbarLayout.setContentScrimColor(android.R.color.transparent);
        collapsingToolbarLayout.setStatusBarScrimColor(android.R.color.transparent);

    }

    private void setToolbar() {
        setSupportActionBar(toolbar);
    }
    private void controlView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        recyclerView = (RecyclerView) findViewById(R.id.recycle);
    }

    private void controllEvent() {
    }


}
