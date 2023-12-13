package com.example.applicantsassistant;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView; // Make sure to include this import

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<University> universities = createTestUniversityList();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        UniversityAdapter adapter = new UniversityAdapter(universities);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private List<University> createTestUniversityList() {
        List<University> universities = new ArrayList<>();
        universities.add(new University("Harvard University", "Private Ivy League university in Cambridge, Massachusetts", R.drawable.ic_launcher_background));
        universities.add(new University("Massachusetts Institute of Technology (MIT)", "Private research university in Cambridge, Massachusetts", R.drawable.baseline_assignment_ind_24));
        universities.add(new University("Stanford University", "Private research university in Stanford, California", R.drawable.baseline_home_24));
        universities.add(new University("Harvard University", "Private Ivy League university in Cambridge, Massachusetts", R.drawable.ic_launcher_background));
        universities.add(new University("Massachusetts Institute of Technology (MIT)", "Private research university in Cambridge, Massachusetts", R.drawable.baseline_assignment_ind_24));
        universities.add(new University("Stanford University", "Private research university in Stanford, California", R.drawable.baseline_home_24));
        universities.add(new University("Harvard University", "Private Ivy League university in Cambridge, Massachusetts", R.drawable.ic_launcher_background));
        universities.add(new University("Massachusetts Institute of Technology (MIT)", "Private research university in Cambridge, Massachusetts", R.drawable.baseline_assignment_ind_24));
        universities.add(new University("Stanford University", "Private research university in Stanford, California", R.drawable.baseline_home_24));
        // Добавьте другие университеты по мере необходимости

        return universities;
    }
}