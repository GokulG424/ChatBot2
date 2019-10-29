package com.hariofspades.chatbot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class context extends AppCompatActivity {

    private Spinner spinner1;
    private Button btnChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context);


        addListenerOnButton();

    }

    // get the selected dropdown list value
    public void addListenerOnButton() {


        spinner1 = (Spinner) findViewById(R.id.spinner2);
        btnChat = (Button) findViewById(R.id.btnChat);
        btnChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(String.valueOf(spinner1.getSelectedItem()).equals("Regular Bot"))
                {
                    Intent myintent =new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(myintent);
                }
                else
                {
                    Intent myintent =new Intent(getApplicationContext(), interviewbot.class);
                    startActivity(myintent);
                }
            }
        });


    }





}
