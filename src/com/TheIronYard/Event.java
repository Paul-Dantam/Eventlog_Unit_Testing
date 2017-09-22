package com.TheIronYard;

public class Event {

    private String name;
    private String action;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Event( String name, String action) throws IllegalArgumentException {

        this.name = name;
        this.action = action;
    }

    public Event() {}



}
