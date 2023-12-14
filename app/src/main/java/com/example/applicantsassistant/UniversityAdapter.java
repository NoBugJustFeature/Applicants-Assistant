package com.example.applicantsassistant;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class UniversityAdapter extends RecyclerView.Adapter<UniversityAdapter.UniversityViewHolder> {

    private List<University> universities;

    public UniversityAdapter(List<University> universities) {
        this.universities = universities;
    }

    public static class UniversityViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView titleTextView;
        public TextView descriptionTextView;

        public UniversityViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.UniversityImage);
            titleTextView = itemView.findViewById(R.id.UniversityTitle);
            descriptionTextView = itemView.findViewById(R.id.UniversityDescription);
        }
    }

    @Override
    public UniversityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_university_card, parent, false);
        return new UniversityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UniversityViewHolder holder, int position) {
        University university = universities.get(position);

        holder.imageView.setImageResource(university.getImageResId());
        holder.titleTextView.setText(university.getName());
        holder.descriptionTextView.setText(university.getDescription());
    }

    @Override
    public int getItemCount() {
        return universities.size();
    }
}
