package com.example.nirajranjan.cgpa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText e1, e2, e3,e4;// and e3 for credit 2
    Button b;
    ImageButton img,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.editText);//4
        e2 = (EditText) findViewById(R.id.edittext2);//3
        e4 = (EditText) findViewById(R.id.editText3);//e4 for credit 2
        e3=  (EditText)findViewById(R.id.editText4); //credit 1
        img=(ImageButton) findViewById(R.id.imageButton);
        img2=(ImageButton) findViewById(R.id.imageButton2);
    }
    public void send1(View v) {

        String forcredit4 = e1.getText().toString();
        String forcredit3 = e2.getText().toString();
        String forcredit2 = e4.getText().toString();
        String forcredit1 = e3.getText().toString();


if(forcredit4.length()==0 )
{
    e1.setError("Field can not be empty");
}

else
{
    Intent intent = new Intent(MainActivity.this,NewActivity.class);

    intent.putExtra("credit4", forcredit4);
    intent.putExtra("credit3", forcredit3);
    intent.putExtra("credit2", forcredit2);
    intent.putExtra("credit1", forcredit1);
    startActivity(intent);
}
    }
   public void clear(View view)
    {
        e1.setText("");
        e2.setText("");
        e3.setText("");
        e4.setText("");
    }

}