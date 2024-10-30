package com.example.a7;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.example.a7.databinding.FragmentCheckoutBinding;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckoutFragment extends Fragment {

    private FragmentCheckoutBinding binding;
    private String selectedReason = ""; // To store the selected reason

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentCheckoutBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        // Spinner
        String[] opsi = getResources().getStringArray(R.array.opsi);
        ArrayList<String> opsiList = new ArrayList<>(Arrays.asList(opsi));
        ArrayAdapter<String> adapterOpsi = new ArrayAdapter<>(requireContext(), android.R.layout.simple_spinner_item, opsiList);
        adapterOpsi.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spinnerTicketType.setAdapter(adapterOpsi);

        // Spinner item selected listener
        binding.spinnerTicketType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // Handle spinner item selection
                selectedReason = parentView.getItemAtPosition(position).toString();
                // You can do something with the selected option here if needed.
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Do nothing
            }
        });

        return view;
    }
}
