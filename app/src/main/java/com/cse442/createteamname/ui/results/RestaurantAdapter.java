package com.cse442.createteamname.ui.results;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import com.cse442.createteamname.R;

public class RestaurantAdapter extends Adapter<RestaurantAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView restaurantName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // Get the textview from the xml layout
            restaurantName = (TextView) itemView.findViewById(R.id.restaurant_name);
        }
    }

    private String[] restaurantNames;

    public RestaurantAdapter(String[]restaurantNames) {
        this.restaurantNames = restaurantNames;
    }

    @NonNull
    @Override
    public RestaurantAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.results_item, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantAdapter.ViewHolder holder, int position) {
        TextView textView = holder.restaurantName;
        textView.setText(restaurantNames[position]);
    }

    @Override
    public int getItemCount() {
        return restaurantNames.length;
    }
}
