package com.example.yogademo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class foodactivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodactivity);
        androidx.appcompat.widget.Toolbar ToolBar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.ToolBar);
        ToolBar.setTitle("Tips & Diet");

        setSupportActionBar(ToolBar);
        final ActionBar bar = getSupportActionBar();
        if (bar != null) {
            bar.setDisplayHomeAsUpEnabled(true);

        }

        String[] tstory = getResources().getStringArray(R.array.title_story);
        final String[] dstory = getResources().getStringArray((R.array.details_story));


        listView = findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.row, R.id.rowtxt, tstory);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String t = dstory[position];
                Intent intent = new Intent(foodactivity.this, FoodActivityDetails.class);
                intent.putExtra("story", t);
                startActivity(intent);
            }
        });

    }
    public void foodgoback(View view) {

        Intent intent= new Intent(foodactivity.this,MainActivity.class);
        startActivity(intent);
        finish();

        }


    @Override
    public void onBackPressed() {
        Intent intent= new Intent(foodactivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
