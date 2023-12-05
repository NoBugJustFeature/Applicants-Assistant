package com.example.applicantsassistant;

import android.widget.LinearLayout;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private LinearLayout universityList;
    private LinearLayout specialtyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        universityList = findViewById(R.id.universityList);
        specialtyList = findViewById(R.id.specialtyList);

        populateUniversityList();
        populateSpecialtyList();
    }

    private void populateUniversityList() {
        String[] universities = {"Университет 1", "Университет 2"};

        for (String university : universities) {
            TextView textView = new TextView(this);
            textView.setText(university);
            universityList.addView(textView);
        }
    }

    private void populateSpecialtyList() {
        String[] specialties = {"Специальность 1", "Специальность 2"};

        for (String specialty : specialties) {
            TextView textView = new TextView(this);
            textView.setText(specialty);
            specialtyList.addView(textView);
        }
    }
}
