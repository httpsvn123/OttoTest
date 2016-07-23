package com.example.a24260.ottotest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.squareup.otto.Subscribe;

public class MainActivity extends AppCompatActivity {
TextView tv;
    Button bn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
tv= (TextView) findViewById(R.id.tv);
        bn1= (Button) findViewById(R.id.bn1);
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Keep.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        AppBus.getInstance().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        AppBus.getInstance().unregister(this);
    }

    @Subscribe
    public  void  settext(BusData  busData){
        System.out.print("执行了");

        tv.setText(busData.getData());
    }
}
