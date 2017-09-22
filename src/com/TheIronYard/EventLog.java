package com.TheIronYard;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;

public class EventLog {

    private List<Event> eventList;

    public boolean addEvent(Event event) throws IllegalArgumentException{

        if (event == null) throw new IllegalArgumentException();
        if (event.getAction()==null || event.getName()==null) throw new IllegalArgumentException();
        else {
            System.out.println("This event is "+event.getName());
            eventList.add(event);
        } return true;

//        "Face2Face"
//        "PhoneCall"
//        "TextMessaging"
//        "Unknown"
    }

    public int getNumEvents (){

    return eventList.size();
    }


    public EventLog (){

        this.eventList = new ArrayList<>();

    }


}
