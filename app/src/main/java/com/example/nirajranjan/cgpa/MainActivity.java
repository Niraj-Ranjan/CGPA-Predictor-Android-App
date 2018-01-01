package com.example.nirajranjan.cgpa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    EditText e1, e2, e3;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        e3 = (EditText) findViewById(R.id.editText3);
        b = (Button) findViewById(R.id.button);

    }


    public void send(View v) {

        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        String s3 = e3.getText().toString();

if(s1.length()==0 )
{
    e1.setError("Field can not be empty");
}

else if(s3.length()==0)
{
    e3.setError("Field can not be empty");
}
else
{


    Intent i2 = new Intent(MainActivity.this, NewActivity.class);

    i2.putExtra("step1", s1);
    i2.putExtra("step2", s2);
    i2.putExtra("step3", s3);




    startActivity(i2);
}



    }

}