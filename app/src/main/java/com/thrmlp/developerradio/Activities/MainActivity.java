package com.thrmlp.developerradio.Activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.thrmlp.developerradio.R;
import com.thrmlp.developerradio.fragments.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment) fragmentManager.findFragmentById(R.id.container_main);

        if(mainFragment == null){
            mainFragment = MainFragment.newInstance("thrmlp","taksmlp");
            fragmentManager.beginTransaction().add(R.id.container_main, mainFragment).commit();
        }
    }
}
