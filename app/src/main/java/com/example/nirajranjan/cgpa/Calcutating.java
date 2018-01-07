package com.example.nirajranjan.cgpa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Calcutating extends Activity {


    EditText e1;
    Button b;
    TextView t1,t2;
    String cgpa;
    String sgpa;

   Double f1,f2,f3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcutating);

        e1=(EditText) findViewById(R.id.editText2);
        b=(Button) findViewById(R.id.button);
        t1=(TextView)findViewById(R.id.textView1);
        t2=(TextView)findViewById(R.id.textView2);


        Intent intent=getIntent();
        Bundle bundle = intent.getExtras();

        sgpa=bundle.getString("sgpavalue");




    }



    public void cgpacal(View view)
    {

        //cgpa=e1.getText().toString();


        try {
            cgpa=e1.getText().toString();


            f1=Double.parseDouble(sgpa);
            f2=Double.parseDouble(cgpa);
            f3=(f1+f2)/2;
            String str = String.format("%1.2f", f1);
            f1 = Double.valueOf(str);

            String str1 = String.format("%1.2f", f3);
            f3 = Double.valueOf(str1);




            t1.setText(Double.toString(f3));

            t2.setText(Double.toString(f1));



        }catch (Exception e)
        {Toast.makeText(getApplicationContext(),"You have entered wrong input",Toast.LENGTH_LONG).show();

        }


    }
}
