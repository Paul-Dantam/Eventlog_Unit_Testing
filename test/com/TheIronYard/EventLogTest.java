package com.TheIronYard;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.junit.Assert.*;

public class EventLogTest {

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    EventLog eventLog = new EventLog();


    @Test
    public void addNullEvent() {
        System.out.println("Testing null event function");
        Event nullEvent = null;
        expected.expect(IllegalArgumentException.class);
        assertTrue(eventLog.addEvent(nullEvent));
    }

    


    @Test
    public void addEvent() throws IllegalArgumentException {
        expected.expect(IllegalArgumentException.class);
        System.out.println("Testing add Event function");
        Event eventOne = new Event("eventOne", "Instantiate");
        assertTrue(eventLog.addEvent(eventOne));
    }

}