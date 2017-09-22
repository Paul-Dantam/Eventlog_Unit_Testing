package com.TheIronYard;

import java.util.ArrayList;
import java.util.List;

public class EventLog {

    private List<Event> eventList;

    public boolean addEvent(Event event) throws IllegalArgumentException{

        if (event == null) throw new IllegalArgumentException();
        if (event.getAction()==null || event.getName()==null) throw new IllegalArgumentException();
        if( event.getAction().equals("Face2Face") ||
                event.getAction().equals("PhoneCall") ||
                event.getAction().equals("TextMessaging") ||
                event.getAction().equals("Unknown")
                ){
            System.out.println("This event is "+event.getName());
            eventList.add(event);
            return true;
        }
        else throw new IllegalArgumentException();

    }

    public int getNumEvents (){

    return eventList.size();
    }


    public EventLog (){

        this.eventList = new ArrayList<>();

    }


}
