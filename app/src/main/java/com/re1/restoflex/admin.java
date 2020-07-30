package com.re1.restoflex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;


public class admin extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        final Animation anime = AnimationUtils.loadAnimation(this, R.anim.fade);

        final ImageView imageView10 = (ImageView) findViewById(R.id.imageView10);
        final ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        final ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        final ImageView imageView9 = (ImageView) findViewById(R.id.imageView9);
        final ImageView imageView13 = (ImageView) findViewById(R.id.imageView13);
        final ImageView imageView11 = (ImageView) findViewById(R.id.imageView11);
        final ImageView imageView14 = (ImageView) findViewById(R.id.imageView14);
        final ImageView imageView12 = (ImageView) findViewById(R.id.imageView12);

        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView10.startAnimation(anime);
            }
        });
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView11.startAnimation(anime);
            }
        });
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView12.startAnimation(anime);
                startActivity(new Intent(admin.this,OverviewActivity.class));
            }
        });
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView13.startAnimation(anime);
                startActivity(new Intent(admin.this,StandardCal.class));
            }
        });
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView14.startAnimation(anime);
                startActivity(new Intent(admin.this,menuadmin.class));
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView7.startAnimation(anime);
            }
        });
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView8.startAnimation(anime);
            }
        });
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView9.startAnimation(anime);
            }
        });
    }


}

