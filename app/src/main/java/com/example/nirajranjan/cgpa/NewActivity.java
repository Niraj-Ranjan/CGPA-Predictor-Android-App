package com.example.nirajranjan.cgpa;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Arrays;
import java.util.Formatter;

import java.text.DecimalFormat;


public class NewActivity extends Activity {
    private LinearLayout mainLinear;
    private int textcount=1, edittextcount =1;


    int sub4=0;
    int sub3=0;
    int sub2=0;
    int sub1=0;


    EditText  ed1[] = new EditText[10];
    EditText ed2[] = new EditText[10];
    EditText ed3[] = new EditText[10];
    EditText ed4[] = new EditText[10];

    String th4;
    String th3;
    String th2;
    String th1;


    double cgpa;

    Dialog mydailog,cgpadialog;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_new);

        mydailog=new Dialog(this);
        cgpadialog=new Dialog(this);

        mainLinear = (LinearLayout) findViewById(R.id.HolderLayout);

        Intent intent=getIntent();
        Bundle bundle = intent.getExtras();

        th4=bundle.getString("credit4");
        th3=bundle.getString("credit3");
        th2=bundle.getString("credit2");
        th1=bundle.getString("credit1");
        //Toast.makeText(getApplicationContext(),th4,Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(),th3,Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(),th2,Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(),th1,Toast.LENGTH_LONG).show();



        showdailog();
        strinttointeger();

//FOR credit 4
        for(int i=0;i<1;i++)
        {
            TextView surveytitle = new TextView(NewActivity.this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            // param.setMargins(int left,int top , int right,int bottom)
            params.setMargins(20, 10, 20, 10);
            //  params.weight = 1.0f;
            params.gravity = Gravity.CENTER_HORIZONTAL;  /// this is layout gravity of textview
            surveytitle.setLayoutParams(params);
           // surveytitle.setBackgroundColor(Color.parseColor("#3F51B5"));
            surveytitle.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
            surveytitle.setTextColor(Color.parseColor("#ffffff"));
            surveytitle.setTypeface(null, Typeface.BOLD);
            surveytitle.setTextSize(18);
            surveytitle.setText("Enter Grade For Credit=4");
            mainLinear.addView(surveytitle);
        }


for(int j=0;j<sub4;j++)
{
    ed4[j] = new EditText(NewActivity.this);
    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
    // param.setMargins(int left,int top , int right,int bottom)
    params.setMargins(40, 10, 40, 10);
    //  params.weight = 1.0f;
    params.gravity = Gravity.CENTER_HORIZONTAL;  /// this is layout gravity of textview
    ed4[j].setLayoutParams(params);
    ed4[j].setBackgroundColor(Color.parseColor("#FFFFFF"));
    ed4[j].setGravity(View.TEXT_ALIGNMENT_GRAVITY);
    ed4[j].setTextColor(Color.parseColor("#000000"));
    ed4[j].setTypeface(null, Typeface.BOLD);
    ed4[j].setTextSize(18);
    ed4[j].setHint("Subject "+ edittextcount);
    ed4[j].setMaxWidth(240);


    edittextcount = edittextcount+1;
    mainLinear.addView(ed4[j]);
}


//FOR credit 3




        for(int k=0;k<1;k++)
        {
            TextView surveytitle = new TextView(NewActivity.this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            // param.setMargins(int left,int top , int right,int bottom)
            params.setMargins(20, 10, 20, 10);
            //  params.weight = 1.0f;
            params.gravity = Gravity.CENTER_HORIZONTAL;  /// this is layout gravity of textview
            surveytitle.setLayoutParams(params);
            // surveytitle.setBackgroundColor(Color.parseColor("#3F51B5"));
            surveytitle.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
            surveytitle.setTextColor(Color.parseColor("#ffffff"));
            surveytitle.setTypeface(null, Typeface.BOLD);
            surveytitle.setTextSize(18);
            surveytitle.setText("Enter Grade For Credit=3");
            mainLinear.addView(surveytitle);
        }


        for(int l=0;l<sub3;l++)
        {
            ed3[l] = new EditText(NewActivity.this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            // param.setMargins(int left,int top , int right,int bottom)
            params.setMargins(20, 10, 20, 10);
            //  params.weight = 1.0f;
            params.gravity = Gravity.CENTER_HORIZONTAL;  /// this is layout gravity of textview
            ed3[l].setLayoutParams(params);
            ed3[l].setBackgroundColor(Color.parseColor("#FFFFFF"));
            ed3[l].setGravity(View.TEXT_ALIGNMENT_GRAVITY);
            ed3[l].setTextColor(Color.parseColor("#000000"));
            ed3[l].setTypeface(null, Typeface.BOLD);
            ed3[l].setTextSize(18);
            ed3[l].setHint("Subject"+ edittextcount);
            ed3[l].setMaxWidth(240);

            edittextcount = edittextcount+1;
            mainLinear.addView(ed3[l]);
        }





//FOR credit 2



        for(int m=0;m<1;m++)
        {
            TextView surveytitle = new TextView(NewActivity.this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            // param.setMargins(int left,int top , int right,int bottom)
            params.setMargins(20, 10, 20, 10);
            //  params.weight = 1.0f;
            params.gravity = Gravity.CENTER_HORIZONTAL;  /// this is layout gravity of textview
            surveytitle.setLayoutParams(params);
            // surveytitle.setBackgroundColor(Color.parseColor("#3F51B5"));
            surveytitle.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
            surveytitle.setTextColor(Color.parseColor("#ffffff"));
            surveytitle.setTypeface(null, Typeface.BOLD);
            surveytitle.setTextSize(18);
            surveytitle.setText("Enter Grade For Credit=2");
            mainLinear.addView(surveytitle);
        }


        for(int n=0;n<sub2;n++)
        {
            ed2[n] = new EditText(NewActivity.this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            // param.setMargins(int left,int top , int right,int bottom)
            params.setMargins(20, 10, 20, 10);
            //  params.weight = 1.0f;
            params.gravity = Gravity.CENTER_HORIZONTAL;  /// this is layout gravity of textview
            ed2[n].setLayoutParams(params);
            ed2[n].setBackgroundColor(Color.parseColor("#FFFFFF"));
            ed2[n].setGravity(View.TEXT_ALIGNMENT_GRAVITY);
            ed2[n].setTextColor(Color.parseColor("#000000"));
            ed2[n].setTypeface(null, Typeface.BOLD);
            ed2[n].setTextSize(18);
            ed2[n].setHint("Subject"+ edittextcount);
            ed2[n].setMaxWidth(240);

            edittextcount = edittextcount+1;
            mainLinear.addView(ed2[n]);
        }


//FOR CREDIT 1

        for(int o=0;o<1;o++)
        {
            TextView surveytitle = new TextView(NewActivity.this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            // param.setMargins(int left,int top , int right,int bottom)
            params.setMargins(20, 10, 20, 10);
            //  params.weight = 1.0f;
            params.gravity = Gravity.CENTER_HORIZONTAL;  /// this is layout gravity of textview
            surveytitle.setLayoutParams(params);
            //surveytitle.setBackgroundColor(Color.parseColor("#3F51B5"));
            surveytitle.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
            surveytitle.setTextColor(Color.parseColor("#ffffff"));
            surveytitle.setTypeface(null, Typeface.BOLD);
            surveytitle.setTextSize(18);
            surveytitle.setText("Enter Grade For Credit=1");


            mainLinear.addView(surveytitle);
        }




        for(int p=0;p<sub1;p++)
        {
            ed1[p] = new EditText(NewActivity.this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            // param.setMargins(int left,int top , int right,int bottom)
            params.setMargins(20, 10, 20, 10);
            //  params.weight = 1.0f;
            params.gravity = Gravity.CENTER_HORIZONTAL;  /// this is layout gravity of textview
            ed1[p].setLayoutParams(params);
            ed1[p].setBackgroundColor(Color.parseColor("#FFFFFF"));
            ed1[p].setGravity(View.TEXT_ALIGNMENT_GRAVITY);
            ed1[p].setTextColor(Color.parseColor("#000000"));
            ed1[p].setTypeface(null, Typeface.BOLD);
            ed1[p].setTextSize(18);
            ed1[p].setHint("Subject  "+ edittextcount);
            ed1[p].setMinimumWidth(140);
            textcount= textcount+1;
            mainLinear.addView(ed1[p]);
        }
createbutton();



    }

public void createbutton()
{


    Button b=new Button(this);
    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
    // param.setMargins(int left,int top , int right,int bottom)
    params.setMargins(20, 10, 20, 10);
    //  params.weight = 1.0f;
    params.gravity = Gravity.CENTER_HORIZONTAL;
    b.setText("Calculate");
    b.setBackgroundColor(Color.parseColor("#FFFFFF"));
    b.setTextColor(Color.parseColor("#000000"));
    mainLinear.addView(b);




    b.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {


            double count1=0;

            double count2=0;
            double count3=0;
            double count4=0;
            double totalcreadit=0;


            double creditearned4 = 0;
            double creditearned3=0;
            double creditearned2=0;
            double creditearned1=0;



            double creditearned=0;



            String theory4[]=new String[sub4];
            int arr4[]=new int[sub4];


            String theory3[]=new String[sub3];
            int arr3[]=new int[sub3];

            String theory2[]=new String[sub2];
            int arr2[]=new int[sub2];

            String theory1[]=new String[sub1];
            int arr1[]=new int[sub1];




            for(int p=0;p<sub4;p++)
            {
                theory4[p]=ed4[p].getText().toString();
                count1++;


            }
            for(int q=0;q<sub4;q++)
            {
                arr4[q]=Integer.parseInt(theory4[q]);
            }





           for(int r=0;r<sub3;r++)
            {
                theory3[r]=ed3[r].getText().toString();

                count2++;

            }


            for(int s=0;s<sub3;s++)
            {

                arr3[s]=Integer.parseInt(theory3[s]);

            }




            for(int t=0;t<sub2;t++)
            {
                theory2[t]=ed2[t].getText().toString();

                count3++;

            }


            for(int u=0;u<sub2;u++)
            {

                arr2[u]=Integer.parseInt(theory2[u]);

            }




            for(int v=0;v<sub1;v++)
            {
                theory1[v]=ed1[v].getText().toString();

                count4++;

            }


            for(int w=0;w<sub1;w++)
            {

                arr1[w]=Integer.parseInt(theory1[w]);

            }











            totalcreadit=(4*count1)+(3*count2)+(2*count3)+(1*count4);


            for(int x=0;x<sub4;x++)
            {
                creditearned4=(4*arr4[x])+creditearned4;
            }

            for(int z=0;z<sub3;z++)
            {
                creditearned3=(3*arr3[z])+creditearned3;
            }


            for(int a=0;a<sub2;a++)
            {
                creditearned2=(2*arr2[a])+creditearned2;
            }

            for(int b=0;b<sub1;b++)
            {
                creditearned1=(1*arr1[b])+creditearned1;
            }




            creditearned=creditearned1+creditearned2+creditearned3+creditearned4;


            cgpa=creditearned/totalcreadit;


            String str = String.format("%1.2f", cgpa);
            cgpa = Double.valueOf(str);
            getresult();
     }
    });





}


    private void strinttointeger() {



        try
        {

            //Toast.makeText(getApplicationContext(),th4,Toast.LENGTH_LONG).show();
            if(!TextUtils.isEmpty(th4)){
                sub4 = Integer.parseInt(th4);
            }


            if(!TextUtils.isEmpty(th3)){
                sub3 = Integer.parseInt(th3);
            }

            if(!TextUtils.isEmpty(th2)){
                sub2 = Integer.parseInt(th2);

            }if(!TextUtils.isEmpty(th1)){
            sub1 = Integer.parseInt(th1);
        }

        }
        catch(NumberFormatException e)
        {
            Toast.makeText(getApplicationContext(),"Unable to convert string to intger",Toast.LENGTH_LONG).show();
        }

    }
































    private void showdailog()
{
    TextView txtxlose;
    mydailog.setContentView(R.layout.custompopup);
    txtxlose=(TextView)mydailog.findViewById(R.id.close);

    txtxlose.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mydailog.dismiss();

        }
    });
    mydailog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    mydailog.show();

}



        private void getresult() {

            TextView get, result;
            Button b10;
            final String r;


            cgpadialog.setContentView(R.layout.pupresult);
            get = (TextView) cgpadialog.findViewById(R.id.txtclose);
            result = (TextView) cgpadialog.findViewById(R.id.cgpatext);
            b10 = (Button) cgpadialog.findViewById(R.id.btnfollow);

            get.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cgpadialog.dismiss();

                }
            });
            cgpadialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            cgpadialog.show();

            r = Double.toString(cgpa);
                result.setText(r);




            b10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(NewActivity.this,Calcutating.class);



                    intent.putExtra("sgpavalue",r);
                    startActivity(intent);

                }
            });




        }
    }








