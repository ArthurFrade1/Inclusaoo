package com.example.inclusao.Screens;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.inclusao.Data.FormLogin;
import com.example.inclusao.R;

public class FormChoice extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_choice);

        AppCompatButton Button1 = findViewById(R.id.Button1);
        AppCompatButton Button2 = findViewById(R.id.Button2);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (FormChoice.this, FormLogin.class);
                startActivity(intent);
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( FormChoice.this, WelcomeScreen1.class);
                startActivity(intent);
            }
        });

    }

}