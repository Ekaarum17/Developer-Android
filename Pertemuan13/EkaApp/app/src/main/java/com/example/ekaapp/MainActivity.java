package com.example.ekaapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @SuppressLint("NonConstantResourceId")


    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mi_input_control_activity:
                startActivity(new Intent(this, InputControlActivity.class));
                break;
            case R.id.mi_listview_activity:
                startActivity(new Intent(this, ListViewActivity.class));
                break;
            case R.id.mi_recycleview_activity:
                startActivity(new Intent(this, RecycleViewActivity.class));
                break;
            case R.id.mi_quit:
                finish();
                break;
        }
        return false;
    }
}