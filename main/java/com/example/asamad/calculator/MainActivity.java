package com.example.asamad.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String v1 = "",v2 = "",op = "",total = "";
    public TextView edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit = (TextView) findViewById(R.id.textview);
    }
    public   void numbers(View v){

        Button b = (Button)v;
        v2 += b.getText();
        edit.setText(v2);
    }
    public void action(View v){
        v1 = v2;
        Button b = (Button) v;
        op = b.getText().toString();
        edit.setText("");
    }
  /*  protected void equal(){

        double a,b;
        if(action == "+")
            {
                a = Double.valueOf(v1);
                b = Double.valueOf(v2);
                a=a+b;
                total = Double.toString(a);
                edit.setText(total);
            }
        else if(action == "-")
        {
            a = Double.valueOf(v1);
            b = Double.valueOf(v2);
            a=a-b;
            total = Double.toString(a);
            edit.setText(total);
        }
        else if(action == "x")
        {
            a = Double.valueOf(v1);
            b = Double.valueOf(v2);
            a=a*b;
            total = Double.toString(a);
            edit.setText(total);
        }
        else if(action == "/")
        {
            a = Double.valueOf(v1);
            b = Double.valueOf(v2);
            a=a/b;
            total = Double.toString(a);
            edit.setText(total);

    }

} */
}
