package com.TheIronYard;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
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
    public void addNullNameEvent() {
        System.out.println("Testing null name event function");
        Event nullNameEvent = new Event(null, "action");
        expected.expect(IllegalArgumentException.class);
        assertTrue(eventLog.addEvent(nullNameEvent));
    }

    @Test
    public void addNullActionEvent() {
        System.out.println("Testing null action event function");
        Event nullActionEvent = new Event("name",null);
        expected.expect(IllegalArgumentException.class);
       assertTrue(eventLog.addEvent(nullActionEvent));
    }

    @Test
    public void addEvent() throws IllegalArgumentException {
        expected.expect(IllegalArgumentException.class);
        System.out.println("Testing add Event function");
        Event eventOne = new Event("eventOne", "Instantiate");
        assertFalse(eventLog.addEvent(eventOne)); //Test for action that doesn't meet requirements, but isn't null
    }

    @Test
    public void addEventWithRequirements() throws IllegalArgumentException {
        System.out.println("Testing add Event function");
        Event eventTwo = new Event("eventTwo", "Face2Face");
        Event eventThree = new Event("eventThree", "PhoneCall");
        Event eventFour = new Event("eventFour", "TextMessaging");
        Event eventFive = new Event("eventFive", "Unknown");
        assertTrue(eventLog.addEvent(eventTwo));
        assertTrue(eventLog.addEvent(eventThree));
        assertTrue(eventLog.addEvent(eventFour));
        assertTrue(eventLog.addEvent(eventFive));
    }
}