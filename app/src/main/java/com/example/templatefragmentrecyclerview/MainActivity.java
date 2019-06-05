package com.example.templatefragmentrecyclerview;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.templatefragmentrecyclerview.TemplateFragmentRecyclerView.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment mainFragment = new MainFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction unfragmentTransaction = fragmentManager.beginTransaction();
        unfragmentTransaction.add(R.id.mainFragment, mainFragment);
        unfragmentTransaction.commit();
    }
            }
