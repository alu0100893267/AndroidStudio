package com.example.airam.sumanumeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setEt1((EditText)findViewById(R.id.et1));
        setEt2((EditText)findViewById(R.id.et2));
        setTv1((TextView)findViewById(R.id.tv1));
    }

    public void sumar(View view){
        int num1 = Integer.parseInt(getEt1().getText().toString());
        int num2 = Integer.parseInt(getEt2().getText().toString());
        String resu = String.valueOf((num1 + num2));
        getTv1().setText(resu);
    }

    public EditText getEt1() {
        return et1;
    }

    public void setEt1(EditText et1) {
        this.et1 = et1;
    }

    public EditText getEt2() {
        return et2;
    }

    public void setEt2(EditText et2) {
        this.et2 = et2;
    }

    public TextView getTv1() {
        return tv1;
    }

    public void setTv1(TextView tv1) {
        this.tv1 = tv1;
    }
}
