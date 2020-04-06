package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.String;

public class kelilingSegiPanjang extends AppCompatActivity {
    EditText sEditpanjang;
    EditText sEditLebar;
    TextView sTextkelilingPersegiPanjang;
    Button sHitungkeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_segi_panjang);
        sEditpanjang =(EditText) findViewById(R.id.editpanjangsegipanjang);
        sEditLebar =(EditText) findViewById(R.id.editlebarsegipanjang);
        sTextkelilingPersegiPanjang = (TextView) findViewById(R.id.kelilingsegipanjang1);
        sHitungkeliling = (Button) findViewById(R.id.hitungKelilig);

        sHitungkeliling.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Perhitungan();
            }
        });
    }
    public void Perhitungan(){
        Double Panjang = Double.parseDouble(sEditpanjang.getText().toString());
        Double Lebar = Double.parseDouble(sEditLebar.getText().toString());
        Double PerhitunganKeliling = 2 *(Panjang + Lebar);
        sTextkelilingPersegiPanjang.setText(PerhitunganKeliling.toString());
    }
}