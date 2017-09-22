package com.TheIronYard;

import com.sun.istack.internal.NotNull;

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

    public Event(@NotNull String name, @NotNull String action) throws IllegalArgumentException {

        this.name = name;
        this.action = action;
    }

    public Event() {}



}
