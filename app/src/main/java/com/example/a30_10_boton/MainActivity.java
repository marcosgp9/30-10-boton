package com.example.a30_10_boton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button botonHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonHora = (Button)findViewById(R.id.button);
        botonHora.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        botonHora.setText(new Date().toString());
        
    }
}
