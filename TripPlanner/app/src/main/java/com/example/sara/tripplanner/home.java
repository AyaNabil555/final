package com.example.sara.tripplanner;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import android.widget.Toolbar;

import java.lang.annotation.Annotation;

public class home extends AppCompatActivity {

    FloatingActionButton fab,fab1,fab2;
    Animation fabOpen;
    Animation fabClose;
    Animation rotateForward;
    Animation rotatebackward;
    boolean isOpen= false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);

      //  setSupportActionBar(toolbar);
        fab=(FloatingActionButton)findViewById(R.id.fab);
        fab1=(FloatingActionButton)findViewById(R.id.fab1);
        fab2=(FloatingActionButton)findViewById(R.id.fab2);

        fabOpen= AnimationUtils.loadAnimation(this,R.anim.fab_open);
        fabClose= AnimationUtils.loadAnimation(this,R.anim.fab_close);
        rotateForward= AnimationUtils.loadAnimation(this,R.anim.rotate_forward);
        rotatebackward= AnimationUtils.loadAnimation(this,R.anim.rotate_backward);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                animateFab();
            }
        });

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(home.this,"car",Toast.LENGTH_LONG).show();
            }
        });


        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(home.this,"swip",Toast.LENGTH_LONG).show();
            }
        });
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

    private void animateFab(){

        if(isOpen){

         fab.startAnimation(rotateForward);
         fab1.startAnimation(fabClose);
         fab2.startAnimation(fabClose);
         fab1.setClickable(false);
         fab2.setClickable(false);
         isOpen=false;


        }else {

            fab.startAnimation(rotatebackward);
            fab1.startAnimation(fabOpen);
            fab2.startAnimation(fabOpen);
            fab1.setClickable(true);
            fab2.setClickable(true);
            isOpen=true;
        }
    }

}
