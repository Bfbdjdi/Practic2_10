package com.mirea.kt.mylistofcars;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {
    private ArrayList<Car> allCars;

    public CarAdapter(ArrayList<Car> allCars) {
        this.allCars = allCars;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView brandView;
        private final TextView yearView;

        ViewHolder(View view){
            super (view);
            brandView = view.findViewById(R.id.brandCar);
            yearView = view.findViewById(R.id.yearCar);
        }

    }

    @NonNull
    @Override
    public CarAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cars,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarAdapter.ViewHolder holder, int position) {

        Car car = allCars.get(position);
        Log.d("Display car details",car.toString());
        holder.brandView.setText(String.format("%s %s", car.getBrand(),car.getNumber()));
        holder.yearView.setText(String.format("%d year", car.getYear()));

    }

    @Override
    public int getItemCount() {
        return allCars.size();
    }
}
