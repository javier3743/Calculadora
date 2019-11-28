package com.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AutoresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autores);

        Intent intent = getIntent();
        String mensaje = intent.getStringExtra(Intent.EXTRA_TEXT);

        TextView textView = (TextView) findViewById(R.id.valorCalculado);
        textView.setText(mensaje);
    }
}
