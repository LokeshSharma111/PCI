package com.example.pci;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends Activity {
    Button b2,b3,b4,b5,b6;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        b2=(Button)findViewById(R.id.tcs);
        b3=(Button)findViewById(R.id.wipro);
        b4=(Button)findViewById(R.id.infosys);
        b5=(Button)findViewById(R.id.dell);
        b6=(Button)findViewById(R.id.hcl);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in2=new Intent(Login.this,tcs.class);
                startActivity(in2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in3=new Intent(Login.this,wipro.class);
                startActivity(in3);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in4=new Intent(Login.this,infosys.class);
                startActivity(in4);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in5=new Intent(Login.this,dell.class);
                startActivity(in5);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in6=new Intent(Login.this,hcl.class);
                startActivity(in6);
            }
        });
    }
}
