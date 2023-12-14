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
 * Use the {@link SpecialityFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SpecialityFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SpecialityFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SpecialityFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SpecialityFragment newInstance(String param1, String param2) {
        SpecialityFragment fragment = new SpecialityFragment();
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
        return inflater.inflate(R.layout.fragment_speciality, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<Specialty> specialties = createTestSpecialtyList();
        RecyclerView recyclerView = view.findViewById(R.id.SpecialitiesRecyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(requireContext());
        SpecialityAdapter adapter = new SpecialityAdapter(specialties);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private List<Specialty> createTestSpecialtyList() {
        List<Specialty> specialties = new ArrayList<>();
        specialties.add(new Specialty("Прогер", "кодит много и дешево", R.drawable.baseline_assignment_ind_24));
        specialties.add(new Specialty("Литейщик", "Льёт волдуу", R.drawable.ic_launcher_background));
        specialties.add(new Specialty("Наладчик", "Дааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааааа", R.drawable.baseline_home_24));
        specialties.add(new Specialty("Бесполезнич", "Ну ты понял", R.drawable.ic_launcher_background));
        specialties.add(new Specialty("Massachusetts Institute of Technology (MIT)", "Private research university in Cambridge, Massachusetts", R.drawable.baseline_assignment_ind_24));
        specialties.add(new Specialty("Stanford University", "Private research university in Stanford, California", R.drawable.baseline_home_24));
        specialties.add(new Specialty("Harvard University", "Private Ivy League university in Cambridge, Massachusetts", R.drawable.ic_launcher_background));
        specialties.add(new Specialty("Massachusetts Institute of Technology (MIT)", "Private research university in Cambridge, Massachusetts", R.drawable.baseline_assignment_ind_24));
        specialties.add(new Specialty("Stanford University", "Private research university in Stanford, California", R.drawable.baseline_home_24));
        // Добавьте другие университеты по мере необходимости

        return specialties;
    }
}