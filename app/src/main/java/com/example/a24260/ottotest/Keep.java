package com.example.a24260.ottotest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.squareup.otto.Subscribe;

public class Keep extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keep);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppBus.getInstance().post(new BusData("somebody alive"));
                Intent intent= new Intent(Keep.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    }
