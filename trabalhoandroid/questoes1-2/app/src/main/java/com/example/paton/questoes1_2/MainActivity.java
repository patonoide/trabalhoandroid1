package com.example.paton.questoes1_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
//1.1) 03-09 23:04:14.408 31732-31732/com.example.patonoide.testizinhopcgrande I/MainActivity: activity criada
//03-09 23:04:14.408 31732-31732/com.example.patonoide.testizinhopcgrande I/MainActivity: activity vai ser visivel
  //      03-09 23:04:14.408 31732-31732/com.example.patonoide.testizinhopcgrande I/MainActivity: activity esta visivel

    //    1.2)03-09 23:06:23.000 31732-31732/com.example.patonoide.testizinhopcgrande I/MainActivity: activity vai ser pausada
      //  03-09 23:06:23.448 31732-31732/com.example.patonoide.testizinhopcgrande I/MainActivity: activity foi parada
       // 03-09 23:06:23.448 31732-31732/com.example.patonoide.testizinhopcgrande I/MainActivity: activity foi destruida

       // 1.3)03-09 23:07:39.156 31732-31732/com.example.patonoide.testizinhopcgrande I/MainActivity: activity criada
       // 03-09 23:07:39.156 31732-31732/com.example.patonoide.testizinhopcgrande I/MainActivity: activity vai ser visivel
        //03-09 23:07:39.156 31732-31732/com.example.patonoide.testizinhopcgrande I/MainActivity: activity esta visivel

        //1.4)03-09 23:15:28.020 31732-31732/com.example.patonoide.testizinhopcgrande I/MainActivity: activity vai ser pausada
        //03-09 23:15:28.596 31732-31732/com.example.patonoide.testizinhopcgrande I/MainActivity: activity foi parada

        //1.5)03-09 23:16:33.080 31732-31732/com.example.patonoide.testizinhopcgrande I/MainActivity: activity vai ser visivel
        //03-09 23:16:33.080 31732-31732/com.example.patonoide.testizinhopcgrande I/MainActivity: activity esta visivel

        //2.1)

        //2.2)03-09 23:24:57.856 31732-31732/com.example.patonoide.testizinhopcgrande I/MainActivity: activity vai ser pausada
        //03-09 23:24:57.856 31732-31732/com.example.patonoide.testizinhopcgrande I/MainActivity: activity foi parada
        //03-09 23:24:57.856 31732-31732/com.example.patonoide.testizinhopcgrande I/MainActivity: activity foi destruida
        //03-09 23:24:57.896 31732-31732/com.example.patonoide.testizinhopcgrande I/MainActivity: activity criada
        //03-09 23:24:57.904 31732-31732/com.example.patonoide.testizinhopcgrande I/MainActivity: activity vai ser visivel
        //03-09 23:24:57.904 31732-31732/com.example.patonoide.testizinhopcgrande I/MainActivity: activity esta visivel

        //2.3) ele ia começar o jogo de novo resetando o progresso.

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("MainActivity", "a activity foi criada");

    }
    @Override
    protected void onStart() {
        super.onStart();
        // The activity is about to become visible.
        Log.i("MainActivity", "a activity vai ser visivel");
    }
    @Override
    protected void onResume() {
        super.onResume();
        // The activity has become visible (it is now "resumed").
        Log.i("MainActivity", "a activity esta visivel");
    }
    @Override
    protected void onPause() {
        super.onPause();
        // Another activity is taking focus (this activity is about to be "paused").
        Log.i("MainActivity", "essa activity vai ser pausada");
    }
    @Override
    protected void onStop() {
        super.onStop();
        // The activity is no longer visible (it is now "stopped")
        Log.i("MainActivity", "a activity foi parada");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // The activity is about to be destroyed.
        Log.i("MainActivity", "a activity foi destruida");
    }


}
