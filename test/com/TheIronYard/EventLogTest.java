package com.TheIronYard;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EventLogTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addEvent() throws Exception {


//        Throw an IllegalArgumentException if the event parameter is null or if either if the two variables of event are null.
//
//                If both parameters are set then print the event to the console and add it to the list.
//
//                The return value from the addEvent method should be true.


        System.out.println("Testing add Event function");

        Event eventOne = new Event("eventOne", "Instantiate");
        Event eventTwo = new Event("eventTwo", "Instantiate");

        assertTrue(EventLog.addEvent(eventList[0]);
        assertTrue(EventLog.addEvent(eventTwo));


    }

}