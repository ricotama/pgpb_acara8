package com.example.a7;

public class Ticket {
    private String city;
    private String ticketType;

    public Ticket(String city, String ticketType) {
        this.city = city;
        this.ticketType = ticketType;
    }

    public String getCity() {
        return city;
    }

    public String getTicketType() {
        return ticketType;
    }
}
