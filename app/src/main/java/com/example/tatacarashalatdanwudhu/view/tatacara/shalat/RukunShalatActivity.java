package com.example.tatacarashalatdanwudhu.view.tatacara.shalat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.tatacarashalatdanwudhu.R;

public class RukunShalatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rukun_shalat);
    }

    public void btn_BackRukunShalat(View view) {
        onBackPressed();
    }
}