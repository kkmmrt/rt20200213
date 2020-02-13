package com.example.rt20200213;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText lauk1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lauk1 = (EditText) findViewById(R.id.laukas1);
    }

    public void add22 (View view){
        String eil = lauk1.getText().toString();
        double sk = Double.parseDouble(eil);
        sk=sk+22;
        eil = Double.toString(sk);
        lauk1.setText(eil);
    }

}
