package com.example.airam.sumarestargroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private TextView textView1;
    private RadioButton radioButton1;
    private RadioButton radioButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setEditText1((EditText) findViewById(R.id.editText1));
        setEditText2((EditText) findViewById(R.id.editText2));
        setTextView1((TextView) findViewById(R.id.textView1));
        setRadioButton1((RadioButton) findViewById(R.id.radioButton1));
        setRadioButton2((RadioButton) findViewById(R.id.radioButton2));
    }

    public void operar(View view){
        int num1 = Integer.parseInt(getEditText1().getText().toString());
        int num2 = Integer.parseInt(getEditText2().getText().toString());
        if(getRadioButton1().isChecked())
            getTextView1().setText(String.valueOf((num1 + num2)));
        else if(getRadioButton2().isChecked())
            getTextView1().setText(String.valueOf((num1 - num2)));
    }

    public EditText getEditText1() {
        return editText1;
    }

    public void setEditText1(EditText editText1) {
        this.editText1 = editText1;
    }

    public EditText getEditText2() {
        return editText2;
    }

    public void setEditText2(EditText editText2) {
        this.editText2 = editText2;
    }

    public TextView getTextView1() {
        return textView1;
    }

    public void setTextView1(TextView textView1) {
        this.textView1 = textView1;
    }

    public RadioButton getRadioButton1() {
        return radioButton1;
    }

    public void setRadioButton1(RadioButton radioButton1) {
        this.radioButton1 = radioButton1;
    }

    public RadioButton getRadioButton2() {
        return radioButton2;
    }

    public void setRadioButton2(RadioButton radioButton2) {
        this.radioButton2 = radioButton2;
    }
}
