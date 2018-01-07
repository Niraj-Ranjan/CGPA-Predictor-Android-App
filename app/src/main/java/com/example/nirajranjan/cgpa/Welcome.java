package com.example.nirajranjan.cgpa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Welcome extends Activity {

    private TextView t;
            ImageView i;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.welcome);




        t=(TextView)findViewById(R.id.textView);
        i=(ImageView)findViewById(R.id.imageView);

        Animation a= AnimationUtils.loadAnimation(this,R.anim.animation);
        t.startAnimation(a);
        i.startAnimation(a);

        final Intent i= new Intent(this,MainActivity.class);
        Thread t=new Thread()
        {
           public void run()
           {
               try {
                   sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               finally {
                 startActivity(i);
                 finish();
               }
           }


        };
        t.start();



    }



}
