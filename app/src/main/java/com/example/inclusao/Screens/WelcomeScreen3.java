package com.example.inclusao.Screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.inclusao.R;

public class WelcomeScreen3 extends AppCompatActivity {

    private TextView proximo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen3);

        IniciarComponentes();
        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeScreen3.this, Prota.class);
                startActivity(intent);
            }
        });
    }

    private void IniciarComponentes(){ proximo = findViewById(R.id.Próximo);

    }
}