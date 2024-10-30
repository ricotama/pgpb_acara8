package com.example.a7;

import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TicketListFragment extends Fragment {
    private RecyclerView recyclerView;
    private TicketAdapter ticketAdapter;

    public TicketListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ticket_list, container, false);

        // Create a list of tickets
        List<Ticket> ticketList = new ArrayList<>();
        ticketList.add(new Ticket("Jakarta", "Business class ticket"));
        ticketList.add(new Ticket("Surabaya", "Business class ticket"));
        ticketList.add(new Ticket("Bandung", "Business class ticket"));
        ticketList.add(new Ticket("Medan", "Business class ticket"));
        ticketList.add(new Ticket("Semarang", "Business class ticket"));
        ticketList.add(new Ticket("Yogyakarta", "Business class ticket"));
        ticketList.add(new Ticket("Makassar", "Business class ticket"));
        ticketList.add(new Ticket("Palembang", "Business class ticket"));
        ticketList.add(new Ticket("Batam", "Business class ticket"));
        ticketList.add(new Ticket("Padang", "Business class ticket"));


        // Add other cities and ticket types to the list

        // Initialize RecyclerView and adapter with the list of tickets
        recyclerView = view.findViewById(R.id.ticketRecyclerView);
        ticketAdapter = new TicketAdapter(requireContext(), ticketList);
        recyclerView.setAdapter(ticketAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));

        return view;
    }
}
