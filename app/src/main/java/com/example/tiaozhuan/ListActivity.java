package com.example.tiaozhuan;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StringAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.list_activity);
        Log.d("lichuang2", "onStart");
        recyclerView = findViewById(R.id.recyclerview);
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            arrayList.add("他将是全球史上最有钱的囚犯"+i);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        adapter = new StringAdapter(arrayList);
        recyclerView.setAdapter(adapter);
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


//    @Override
//    public boolean dispatchKeyEvent(KeyEvent event) {
//        return false;
//    }
//
//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        return false;
//    }

}