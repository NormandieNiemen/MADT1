package com.example.madt1artsemhalkin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textBuyCrypto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.textBuyCrypto = findViewById(R.id.textBuyCrypto);
    }

    public void buyCryptoClick(View view) {
        this.textBuyCrypto.setText("You have successfully bought 25DOT!");
    }
}