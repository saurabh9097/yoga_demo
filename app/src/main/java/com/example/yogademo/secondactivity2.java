package com.example.yogademo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class secondactivity2 extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        androidx.appcompat.widget.Toolbar ToolBar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbarSecond);
        ToolBar.setTitle("Yoga App");

        setSupportActionBar(ToolBar);
        final ActionBar bar = getSupportActionBar();
        if (bar != null) {
            bar.setDisplayHomeAsUpEnabled(true);

        }
        ToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        newArray= new int[]{

                R.id.bow_pose,R.id.bridge_pose,R.id.chair_pose,R.id.child_pose,R.id.cobbler_pose,R.id.cow_pose,R.id.playji_pose,R.id.pauseji_pose,R.id.plank_pose,R.id.situp_pose,
                R.id.crunches_pose,R.id.rotation_pose,R.id.twisht_pose,R.id.windmill_pose,R.id.legup_pose,



        };

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




    public void imagebuttonclicked(View view) {


        for(int i=0;i< newArray.length;i++){

            if(view.getId()==newArray[i]){
                int value= i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent =new Intent(secondactivity2.this,Thirdactivity2.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}