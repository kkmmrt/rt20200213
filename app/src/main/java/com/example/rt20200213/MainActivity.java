package com.example.rt20200213;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText lauk1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lauk1 = (EditText) findViewById(R.id.laukas1);
    }

    public void add22 (View view){
        try {
            String eil = lauk1.getText().toString();
            double sk = Double.parseDouble(eil);
            sk = sk + 22;
            eil = Double.toString(sk);
            lauk1.setText(eil);
        }
        catch (Exception e){
            Log.d("skaicius", "ivestas neteisingas skaicius");
            Toast.makeText(this, "Neteisingas skaičius", Toast.LENGTH_LONG).show();
        }
    }

    public void saknis (View view){
        try{
            double sk = Double.parseDouble(lauk1.getText().toString());
            sk=Math.sqrt(sk);
            lauk1.setText(Double.toString(sk));
        }catch (Exception e){
            Log.d("skaicius", "ivestas neteisingas skaicius");
            Toast.makeText(this, "Neteisingas skaičius", Toast.LENGTH_LONG).show();
        }
    }

}
