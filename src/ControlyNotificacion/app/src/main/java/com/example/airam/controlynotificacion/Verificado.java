package com.example.airam.controlynotificacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Verificado extends AppCompatActivity {

    private TextView textViewVerificado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verificado);

        setTextViewVerificado((TextView) findViewById(R.id.textViewVerificado));
        Bundle bundle = this.getIntent().getExtras();
        getTextViewVerificado().setText("Bienvenido " + bundle.getString("name"));
    }

    public void setTextViewVerificado(TextView textViewVerificado) {
        this.textViewVerificado = textViewVerificado;
    }

    public TextView getTextViewVerificado() {
        return textViewVerificado;
    }
}
