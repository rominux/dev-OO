package tpQU.tp02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tpOO.tp03.Task;

public class EventTest {
    public Event evt1;
    public Event evt2;
    public Event evt3;
    public Event evt4;
    public Event evt5;
    public Event evt6;
    public Task t1;
    public Task t2;

    @BeforeEach
    public void avantTest() {
        LocalDate d1 = LocalDate.of(2022, 1, 5);
        LocalDate d2 = LocalDate.of(2022, 2, 10);
        LocalDate d3 = LocalDate.of(2022, 3, 15);
        LocalDate d4 = LocalDate.of(2022, 4, 20);
        String place1 = "nowhere";
        String place2 = "everywhere";
        evt1 = new Event("evt1", place1, d1, d2);
        evt2 = new Event("evt2", place1, d2, d3);
        evt3 = new Event("evt3", place1, d3, d4);
        evt4 = new Event("evt4", place1, d2, d4);
        evt5 = new Event("evt5", place2, d1, d2);
        evt6 = new Event("evt1", place1, d1, d2);
        t1 = new Task("task1", 2);
        t2 = new Task("task2", 1);
    }

    @Test
    void testToString() {
        assertEquals("evt1 - nowhere: \t 2022-01-05 -> 2022-02-10", evt1.toString());
        assertEquals("evt2 - nowhere: \t 2022-02-10 -> 2022-03-15", evt2.toString());
        assertEquals("evt3 - nowhere: \t 2022-03-15 -> 2022-04-20", evt3.toString());
        assertEquals("evt4 - nowhere: \t 2022-02-10 -> 2022-04-20", evt4.toString());
        assertEquals("evt5 - everywhere: \t 2022-01-05 -> 2022-02-10", evt5.toString());
    }

    @Test
    void testAddTask() {
        assertEquals(0, evt1.getNbTasks());
        assertNull(evt1.getChores()[0]);
        evt1.addTask(t1);
        assertEquals(1, evt1.getNbTasks());
        assertEquals(t1, evt1.getChores()[0]);
        evt1.addTask(t2);
        assertEquals(2, evt1.getNbTasks());
        assertEquals(t2, evt1.getChores()[1]);
        evt1.addTask(t1);
        assertEquals(3, evt1.getNbTasks());
        assertEquals(t1, evt1.getChores()[0]);
        assertEquals(t1, evt1.getChores()[2]);
    }

    @Test
    void testEquals() {
        assertTrue(evt1.equals(evt1));
        assertFalse(evt1.equals(evt2));
        assertFalse(evt1.equals(evt3));
        assertFalse(evt1.equals(evt4));
        assertFalse(evt1.equals(evt5));
        assertTrue(evt1.equals(evt6));
        //
        assertTrue(evt2.equals(evt2));
        assertFalse(evt2.equals(evt3));
        assertFalse(evt2.equals(evt4));
        assertFalse(evt2.equals(evt5));
        assertFalse(evt2.equals(evt6));
    }

    @Test
    void testOverlap() {
        assertTrue(evt1.overlap(evt1));
        assertFalse(evt1.overlap(evt2));
        assertFalse(evt1.overlap(evt3));
        assertFalse(evt1.overlap(evt4));
        assertTrue(evt1.overlap(evt5));
        assertTrue(evt1.overlap(evt6));
        assertFalse(evt2.overlap(evt3));
        assertTrue(evt2.overlap(evt4));
        assertTrue(evt3.overlap(evt4));
    }
}
