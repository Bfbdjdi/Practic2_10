package com.mirea.kt.mylistofcars;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShowCarsActivity extends AppCompatActivity implements View.OnClickListener {


    private DBManager dbManager;
    Button buttonHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.dbManager = new DBManager(new MyAppSQLiteHelper(this,"my_database.db",null,1));
        setContentView(R.layout.activity_show_cars);

        ArrayList<Car> cars = this.dbManager.loadAllCarsFromDatabase();

        RecyclerView rcView = findViewById(R.id.recycler);
        CarAdapter adapter = new CarAdapter(cars);
        rcView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        rcView.setAdapter(adapter);

        buttonHome = findViewById(R.id.buttonHome);
        buttonHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonHome) {
            onBackPressed();
        }
    }
}