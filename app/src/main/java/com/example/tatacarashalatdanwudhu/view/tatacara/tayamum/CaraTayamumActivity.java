package com.example.tatacarashalatdanwudhu.view.tatacara.tayamum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.tatacarashalatdanwudhu.R;

public class CaraTayamumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara_tayamum);
    }

    public void btn_BackCaraTayamum(View view) {

        onBackPressed();
    }
}