package com.example.vishalkumar.mathematics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashingActivity extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashing);
        tv=findViewById(R.id.textView);
    }
        @Override
        protected void onResume() {
            super.onResume();
            Thread t=new Thread()
            {
                public void run()
                {
                    try {
                        Thread.sleep(3000);
                        Intent a=new Intent(SplashingActivity.this,ButtonActivity.class);
                        startActivity(a);
                        finish();//use to finish splashing
                    }
                    catch (Exception e)
                    {}
                    }

            };t.start();
            Animation animation= AnimationUtils.loadAnimation(SplashingActivity.this,R.anim.move);
            tv.startAnimation(animation);

        }
    }
