package com.example.tatacarashalatdanwudhu.view.tatacara.berwudhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.tatacarashalatdanwudhu.R;

public class SyaratBerwudhuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syarat_berwudhu);
    }

    public void btn_BackSyaratberwudhu(View view) {

        onBackPressed();
    }
}