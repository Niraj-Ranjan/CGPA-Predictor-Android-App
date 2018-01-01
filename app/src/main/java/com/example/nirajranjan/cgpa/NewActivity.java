package com.example.nirajranjan.cgpa;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;



public class NewActivity extends Activity {
    private LinearLayout mainLinear;
    private int textcount=1, edittextcount =1;

    int sub1,sub2;
    int j,k;
    EditText ed[] = new EditText[10];
    EditText ed2[] = new EditText[10];
    int theory=1;
    int practical=1;
    String first;
    String second;
    String third;
    double cgpa;

    Dialog mydailog,cgpadialog;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_new);

        mydailog=new Dialog(this);
        cgpadialog=new Dialog(this);

        mainLinear = (LinearLayout) findViewById(R.id.HolderLayout);

        Intent i2=getIntent();
        Bundle b = i2.getExtras();
        first=b.getString("step1");
        second=b.getString("step2");
        third=b.getString("step3");

        strinttointeger();
        showdailog();


        for(int i=0;i<theory;i++)
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
            surveytitle.setText("Enter Marks For Theory paper");
            mainLinear.addView(surveytitle);
        }
//FOR THEROY PAPER

for(j=0;j<sub1;j++)
{
    ed[j] = new EditText(NewActivity.this);
    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
    // param.setMargins(int left,int top , int right,int bottom)
    params.setMargins(20, 10, 20, 10);
    //  params.weight = 1.0f;
    params.gravity = Gravity.CENTER_HORIZONTAL;  /// this is layout gravity of textview
    ed[j].setLayoutParams(params);
    ed[j].setBackgroundColor(Color.parseColor("#FFFFFF"));
    ed[j].setGravity(View.TEXT_ALIGNMENT_GRAVITY);
    ed[j].setTextColor(Color.parseColor("#000000"));
    ed[j].setTypeface(null, Typeface.BOLD);
    ed[j].setTextSize(18);
    ed[j].setHint("Theory  "+ edittextcount);
    ed[j].setMaxWidth(240);

    edittextcount = edittextcount+1;
    mainLinear.addView(ed[j]);
}





        for(int i=0;i<practical;i++)
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
            surveytitle.setText("Enter Marks For Practical Paper");


            mainLinear.addView(surveytitle);
        }



//FOR PRACTICAL PAPER

        for(k=0;k<sub2;k++)
        {
            ed2[k] = new EditText(NewActivity.this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            // param.setMargins(int left,int top , int right,int bottom)
            params.setMargins(20, 10, 20, 10);
            //  params.weight = 1.0f;
            params.gravity = Gravity.CENTER_HORIZONTAL;  /// this is layout gravity of textview
            ed2[k].setLayoutParams(params);
            ed2[k].setBackgroundColor(Color.parseColor("#FFFFFF"));
            ed2[k].setGravity(View.TEXT_ALIGNMENT_GRAVITY);
            ed2[k].setTextColor(Color.parseColor("#000000"));
            ed2[k].setTypeface(null, Typeface.BOLD);
            ed2[k].setTextSize(18);
            ed2[k].setHint("Practical  "+ textcount);
            ed2[k].setMinimumWidth(140);
            textcount= textcount+1;
            mainLinear.addView(ed2[k]);
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
            double totalcreadit=0;
            double creditearnedth = 0;
            double creditearnedprac=0;
            double creditearned=0;



            String theory1[]=new String[sub1];
            int arr1[]=new int[sub1];


            String practical1[]=new String[sub2];
            int arr2[]=new int[sub2];

            for(int p=0;p<sub1;p++)
            {
                theory1[p]=ed[p].getText().toString();
                count1++;


            }



            for(int q=0;q<sub1;q++)
            {
                arr1[q]=Integer.parseInt(theory1[q]);



            }



            for(int r=0;r<sub2;r++)
            {
                practical1[r]=ed2[r].getText().toString();

                count2++;

            }


            for(int s=0;s<sub2;s++)
            {

                arr2[s]=Integer.parseInt(practical1[s]);

            }



            totalcreadit=(4*count1)+(1*count2);
            for(int t=0;t<sub1;t++)
            {
                creditearnedth=(4*arr1[t])+creditearnedth;
            }

            for(int u=0;u<sub2;u++)
            {
                creditearnedprac=(1*arr2[u])+creditearnedprac;
            }


            creditearned=creditearnedth+creditearnedprac;
            cgpa=creditearned/totalcreadit;

            //Toast.makeText(getApplicationContext(), "Your SGPA IS " + cgpa, Toast.LENGTH_LONG).show();
            getresult();









        }
    });





}

    private void strinttointeger() {
        sub1=Integer.parseInt(first);
        sub2=Integer.parseInt(third);





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

    public void cal(View view)

{


        double count1=0;
        double count2=0;
        double totalcreadit=0;
        double creditearnedth = 0;
        double creditearnedprac=0;
        double creditearned=0;



        String theory1[]=new String[sub1];
        int arr1[]=new int[sub1];


        String practical1[]=new String[sub2];
        int arr2[]=new int[sub2];

        for(int p=0;p<sub1;p++)
        {
            theory1[p]=ed[p].getText().toString();
            count1++;


        }



        for(int q=0;q<sub1;q++)
        {
            arr1[q]=Integer.parseInt(theory1[q]);



        }



        for(int r=0;r<sub2;r++)
        {
            practical1[r]=ed2[r].getText().toString();

            count2++;

        }


        for(int s=0;s<sub2;s++)
        {

            arr2[s]=Integer.parseInt(practical1[s]);

        }



        totalcreadit=(4*count1)+(1*count2);
        for(int t=0;t<sub1;t++)
        {
            creditearnedth=(4*arr1[t])+creditearnedth;
        }

        for(int u=0;u<sub2;u++)
        {
            creditearnedprac=(1*arr2[u])+creditearnedprac;
        }


        creditearned=creditearnedth+creditearnedprac;
        cgpa=creditearned/totalcreadit;

        //Toast.makeText(getApplicationContext(), "Your SGPA IS " + cgpa, Toast.LENGTH_LONG).show();
        getresult();



        }

        private void getresult()
        {

                TextView get,result;

            cgpadialog.setContentView(R.layout.pupresult);
                get=(TextView)cgpadialog.findViewById(R.id.txtclose);
            result=(TextView)cgpadialog.findViewById(R.id.cgpatext);

                get.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cgpadialog.dismiss();

                    }
                });
            cgpadialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            cgpadialog.show();
            String r;
           r = Double.toString(cgpa);
            result.setText(r);










        }


    }






