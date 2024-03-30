package org.example;

import org.junit.jupiter.api.BeforeEach;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    public Queue<String> queue = new Queue<>();
    @BeforeEach
    void setQ(){
        queue = new Queue<>();
    }


    @Test
    void testIsEmpty() {
        assertTrue(queue.isEmpty());
        queue.add("test");
        assertFalse(queue.isEmpty());
    }

    @Test
    void testAdd() {
        assertTrue(queue.add("test"));
        assertEquals(1, queue.size);
    }

    @Test
    void testRemove() {
        queue.add("test");
        queue.remove();
        assertTrue(queue.isEmpty());
    }

    @Test
    void testPeek() {
        queue.add("test");
        assertEquals("test", queue.peek());
    }

    @Test
    void testPoll() {
        queue.add("test");
        assertEquals("test", queue.poll());
        assertTrue(queue.isEmpty());
    }
}

