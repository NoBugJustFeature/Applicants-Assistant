package com.example.applicantsassistant;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class SpecialityAdapter extends RecyclerView.Adapter<SpecialityAdapter.SpecialityViewHolder> {

    private List<Specialty> specialties;

    public SpecialityAdapter(List<Specialty> specialties) {
        this.specialties = specialties;
    }

    public static class SpecialityViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView titleTextView;
        public TextView descriptionTextView;

        public SpecialityViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.SpecialityImage);
            titleTextView = itemView.findViewById(R.id.SpecialityTitle);
            descriptionTextView = itemView.findViewById(R.id.SpecialityDescription);
        }
    }

    @Override
    public SpecialityAdapter.SpecialityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_speciality_card, parent, false);
        return new SpecialityAdapter.SpecialityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SpecialityAdapter.SpecialityViewHolder holder, int position) {
        Specialty specialty = specialties.get(position);

        holder.imageView.setImageResource(specialty.getImageResId());
        holder.titleTextView.setText(specialty.getName());
        holder.descriptionTextView.setText(specialty.getDescription());
    }

    @Override
    public int getItemCount() {
        return specialties.size();
    }
}
