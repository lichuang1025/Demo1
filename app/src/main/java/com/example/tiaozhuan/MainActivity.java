package com.example.tiaozhuan;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Log.d("lichuang1","onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lichuang1","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lichuang1","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lichuang1","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lichuang1","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lichuang1","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lichuang1","onRestart");
    }
}