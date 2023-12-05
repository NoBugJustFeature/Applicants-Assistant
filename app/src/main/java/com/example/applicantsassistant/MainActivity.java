package com.example.applicantsassistant;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ListView listView2;
    private TextView emptyListView1;
    private TextView emptyListView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        listView2 = findViewById(R.id.listView2);
        emptyListView1 = findViewById(R.id.textView3);
        emptyListView2 = findViewById(R.id.textView4);

        // Пример данных для списка 1
        ArrayList<String> list1Data = new ArrayList<>();
        // Добавь свои данные, например:
        // list1Data.add("Университет 1");
        // list1Data.add("Университет 2");

        // Пример данных для списка 2
        ArrayList<String> list2Data = new ArrayList<>();
        // Добавь свои данные, например:
        // list2Data.add("Специальность 1");
        // list2Data.add("Специальность 2");

        setupListView(listView, list1Data, emptyListView1);
        setupListView(listView2, list2Data, emptyListView2);
    }

    private void setupListView(ListView listView, ArrayList<String> data, TextView emptyView) {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);

        if (data.isEmpty()) {
            emptyView.setVisibility(View.VISIBLE);
        } else {
            listView.setVisibility(View.VISIBLE);
        }
    }
}
