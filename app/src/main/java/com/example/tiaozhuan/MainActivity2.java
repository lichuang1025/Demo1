package com.example.tiaozhuan;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        Log.d("lichuang2", "onStart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lichuang2", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lichuang2", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lichuang2", "onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lichuang2", "onStop");
        //startActivity(new Intent(this,MainActivity2.class));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lichuang2", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lichuang2", "onRestart");
    }


    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        return false;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return false;
    }

}