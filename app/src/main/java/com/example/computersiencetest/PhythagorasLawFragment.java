package com.example.computersiencetest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PhythagorasLawFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PhythagorasLawFragment extends Fragment {
    private EditText etA,etB;
    private Button btnCalculate;
    private ImageButton btnBack;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PhythagorasLawFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PhythagorasLawFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PhythagorasLawFragment newInstance(String param1, String param2) {
        PhythagorasLawFragment fragment = new PhythagorasLawFragment();
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
        return inflater.inflate(R.layout.fragment_phythagoras_law, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        connectComponents();
    }

    private void connectComponents() {
        etA = getView().findViewById(R.id.etALaw);
        etB = getView().findViewById(R.id.etBLaw);
        btnBack = getView().findViewById(R.id.btnBackLaw);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
        btnCalculate = getView().findViewById(R.id.btnCalculateLaw);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(etA.getText().toString());
                double b = Double.parseDouble(etB.getText().toString());
                a = Math.pow(a,2);
                b = Math.pow(b,2);
                double c = Math.sqrt((a+b));
                Toast.makeText(getActivity(), "The c equals:" + c, Toast.LENGTH_SHORT).show();
            }
        });
    }
}