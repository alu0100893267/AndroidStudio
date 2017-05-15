package com.example.airam.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String[] paises = { "Argentina", "Chile", "Paraguay", "Bolivia",
            "Peru", "Ecuador", "Brasil", "Colombia", "Venezuela", "Uruguay" };
    private String[] habitantes = { "40000000", "17000000", "6500000",
            "10000000", "30000000", "14000000", "183000000", "44000000",
            "29000000", "3500000" };
    private TextView textView1;
    private ListView list1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTextView1((TextView) findViewById(R.id.textView1));
        setList1((ListView)findViewById(R.id.list1));
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises);
        getList1().setAdapter(adapter);

        getList1().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                getTextView1().setText("Población de "+ getList1().getItemAtPosition(i) + " es "+ habitantes[i]);
            }
        });
    }

    public String[] getPaises() {
        return paises;
    }

    public void setPaises(String[] paises) {
        this.paises = paises;
    }

    public String[] getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(String[] habitantes) {
        this.habitantes = habitantes;
    }

    public TextView getTextView1() {
        return textView1;
    }

    public void setTextView1(TextView textView1) {
        this.textView1 = textView1;
    }

    public ListView getList1() {
        return list1;
    }

    public void setList1(ListView list1) {
        this.list1 = list1;
    }
}
