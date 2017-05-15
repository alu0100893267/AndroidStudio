package com.example.airam.controlynotificacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editTextPass1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setEditText1((EditText) findViewById(R.id.editText1));
        setEditTextPass1((EditText) findViewById(R.id.editTextPass1));
    }

    public void verificar(View v) {
        if (getEditTextPass1().getText().toString().length()==0) {
            Toast notificacion = Toast.makeText(this, "La clave no puede quedar vacía", Toast.LENGTH_LONG);
            notificacion.show();
        }
        else{
            Intent intento = new Intent(MainActivity.this, Verificado.class);
            Bundle bundle = new Bundle();
            bundle.putString("name", getEditText1().getText().toString());
            intento.putExtras(bundle);
            startActivity(intento);
        }
    }

    public EditText getEditText1() {
        return editText1;
    }

    public void setEditText1(EditText editText1) {
        this.editText1 = editText1;
    }

    public EditText getEditTextPass1() {
        return editTextPass1;
    }

    public void setEditTextPass1(EditText editTextPass1) {
        this.editTextPass1 = editTextPass1;
    }
}
