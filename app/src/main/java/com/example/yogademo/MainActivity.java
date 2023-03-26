package com.example.yogademo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Button button1,button2;
    ImageView ivNutrition;
    LinearLayout llNutrition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        androidx.appcompat.widget.Toolbar toolbar =findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        androidx.appcompat.widget.Toolbar ToolBar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar);
        ToolBar.setTitle("Yoga App");

        setSupportActionBar(ToolBar);
        final ActionBar bar = getSupportActionBar();
        if (bar != null) {
            bar.setDisplayHomeAsUpEnabled(true);

        }
        button1 = findViewById(R.id.startyoga1);
        button2 = findViewById(R.id.startyoga2);
        ivNutrition = findViewById(R.id.ivNutrition);
        llNutrition = findViewById(R.id.llNutrition);
        ivNutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, foodactivity.class);
                startActivity(intent);
            }
        });
        llNutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, foodactivity.class);
                startActivity(intent);
            }
        });
        button1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, secondactivity.class);
            startActivity(intent);

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, secondactivity2.class);
                startActivity(intent);
            }
        });
    }
    public void beforeage18(View view) {
        Intent intent= new Intent(MainActivity.this,secondactivity.class);
        startActivity(intent);
    }

    public void afterage18(View view) {
        Intent intent= new Intent(MainActivity.this,secondactivity2.class);
        startActivity(intent);
    }

    public void food(View view) {
        Intent intent= new Intent(MainActivity.this,foodactivity.class);
        startActivity(intent);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        int id= item.getItemId();
        if(id== R.id.id_privacy){

            return true;
        }
        if(id== R.id.id_term){

            return true;
        }
        if(id== R.id.rate){

            return true;
        }
        if(id== R.id.more){

            return true;
        }
        if(id== R.id.share){

            return true;
        }
        return true;
    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Alert");
        dialog.setMessage("Are you sure want to exit!");
        dialog.setPositiveButton("Ok",new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
                finish();
            }
        });
        dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }




}