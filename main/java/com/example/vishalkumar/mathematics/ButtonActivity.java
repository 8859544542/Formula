package com.example.vishalkumar.mathematics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class ButtonActivity extends AppCompatActivity {
  Button algebra,trigno,areavolume,inversetrigno,diffrential,intigration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        algebra=findViewById(R.id.button2);
        trigno=findViewById(R.id.button3);
        areavolume=findViewById(R.id.button4);
        inversetrigno=findViewById(R.id.button5);
        diffrential=findViewById(R.id.button6);
        intigration=findViewById(R.id.button7);

        algebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ButtonActivity.this,AlgebraActivity.class);
                startActivity(i);
            }
        });
        trigno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ButtonActivity.this,TrignoActivity.class);
                startActivity(i);
            }
        }); areavolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ButtonActivity.this,AreaVolumeActivity.class);
                startActivity(i);
            }
        });
        inversetrigno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ButtonActivity.this,InversetrignoActivity.class);
                startActivity(i);
            }
        });
        diffrential.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ButtonActivity.this,DiffrentialActivity.class);
                startActivity(i);
            }
        });
        intigration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ButtonActivity.this,IntigrationActivity.class);
                startActivity(i);
            }
        });




    }/*@Override
    protected void onResume() {
        super.onResume();
        Animation animation= AnimationUtils.loadAnimation(ButtonActivity.this,R.anim.blink);
        intigration.startAnimation(animation);
    }*/
}
