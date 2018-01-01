package com.example.nirajranjan.cgpa;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FourthActivity extends Activity {


    private LinearLayout mainLinear;
    private Button createTextview, createEdittext;
    private int textcount=1, edittextcount =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);









        mainLinear = (LinearLayout) findViewById(R.id.HolderLayout);
        createTextview = (Button) findViewById(R.id.CreateTextView);
        createEdittext = (Button) findViewById(R.id.CreateEdittext);

        Intent i2=getIntent();
        Bundle b = i2.getExtras();
        String first=b.getString("step1");
        String second=b.getString("step2");
        String third=b.getString("step3");



;

        createTextview.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Starting a new Intent

                for(int i=0;i<4;i++)
                {
                    TextView surveytitle = new TextView(FourthActivity.this);
                    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                    // param.setMargins(int left,int top , int right,int bottom)
                    params.setMargins(20, 10, 20, 10);
                    //  params.weight = 1.0f;
                    params.gravity = Gravity.CENTER_HORIZONTAL;  /// this is layout gravity of textview
                    surveytitle.setLayoutParams(params);
                    surveytitle.setBackgroundColor(Color.parseColor("#3F51B5"));
                    surveytitle.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                    surveytitle.setTextColor(Color.parseColor("#ffffff"));
                    surveytitle.setTypeface(null, Typeface.BOLD);
                    surveytitle.setTextSize(18);
                    surveytitle.setText("TextView "+ textcount);
                    textcount= textcount+1;
                    mainLinear.addView(surveytitle);
                }



            }
        });


        createEdittext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Starting a new Intent
                EditText editTextbox = new EditText(FourthActivity.this);
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                // param.setMargins(int left,int top , int right,int bottom)
                params.setMargins(20, 10, 20, 10);
                //  params.weight = 1.0f;
                params.gravity = Gravity.CENTER_HORIZONTAL;  /// this is layout gravity of textview
                editTextbox.setLayoutParams(params);
                editTextbox.setBackgroundColor(Color.parseColor("#3F51B5"));
                editTextbox.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                editTextbox.setTextColor(Color.parseColor("#ffffff"));
                editTextbox.setTypeface(null, Typeface.BOLD);
                editTextbox.setTextSize(18);
                editTextbox.setHint("Edittext "+ edittextcount);
                editTextbox.setMinimumWidth(140);
                edittextcount = edittextcount+1;
                mainLinear.addView(editTextbox);


            }
        });








    }

}
