package com.mirea.kt.mylistofcars;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonStart;
    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.enterButton){
            Intent intent = new Intent(this,MainAppActivity.class);
            startActivityForResult(intent,42);
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        buttonStart = findViewById(R.id.enterButton);
        buttonStart.setOnClickListener(this);
    }


}