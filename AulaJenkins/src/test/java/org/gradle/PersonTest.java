package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry", 30);
        assertEquals("Larry", person.getName());
        assertEquals(30, person.getAge());
    }
}
