package com.thejoeunit.www.bluetoothpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

//    주변의 블루투스 기기를 탐색

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {

    }
}
