package com.TheIronYard;

import java.util.List;

public class EventLog {







    private static List<Event> eventList;

    public static boolean addEvent(Event event) throws IllegalArgumentException{


        if (event == null || event.getAction()==null || event.getName()==null){
            throw new IllegalArgumentException();
        } else {
            System.out.println(event.getName());
            eventList.add(event);
        } return true;
//        "Face2Face"
//        "PhoneCall"
//        "TextMessaging"
//        "Unknown"
    }

    public int getNumEvents (){

    return -1;
    }


    public EventLog (){

    }


}
