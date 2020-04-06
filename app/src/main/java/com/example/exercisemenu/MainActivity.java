package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       button = (Button) findViewById(R.id.btnok);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openmenu1();
           }
       });
    }

    public void openmenu1(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}
