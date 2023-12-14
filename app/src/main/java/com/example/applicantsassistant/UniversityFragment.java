package com.example.applicantsassistant;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UniversityFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UniversityFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public UniversityFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment UniversityFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static UniversityFragment newInstance(String param1, String param2) {
        UniversityFragment fragment = new UniversityFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_university, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<University> universities = createTestUniversityList();
        RecyclerView recyclerView = view.findViewById(R.id.UniversitiesRecyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(requireContext());
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