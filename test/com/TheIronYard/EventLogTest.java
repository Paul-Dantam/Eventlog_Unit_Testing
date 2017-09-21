package com.TheIronYard;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.junit.Assert.*;

public class EventLogTest {

    @Rule //Another annotation directed to JUnit
    public ExpectedException expected = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addEvent() throws IllegalArgumentException {

        expected.expect(IllegalArgumentException.class);



//        Throw an IllegalArgumentException if the event parameter is null or if either if the two variables of event are null.
//
//                If both parameters are set then print the event to the console and add it to the list.
//
//                The return value from the addEvent method should be true.


        System.out.println("Testing add Event function");


        Event eventOne = new Event("eventOne", "Instantiate");
        Event eventTwo = new Event("eventTwo", null);

        assertTrue(EventLog.addEvent(eventOne));
        assertFalse(EventLog.addEvent(eventTwo));



    }

}