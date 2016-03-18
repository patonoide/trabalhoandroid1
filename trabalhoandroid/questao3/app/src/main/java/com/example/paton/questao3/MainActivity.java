package com.example.paton.questao3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    public void startActivity(Intent intent, Bundle options) {
        super.startActivity(new Intent(this, SecondActivity.class));
    }
}
