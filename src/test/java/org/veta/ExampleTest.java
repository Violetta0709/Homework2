package org.veta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ExampleTest {
    @Test
    void exampleTest0() {
        Assertions.assertFalse(2 < 4);
    }

    @Test
    void exampleTest1() {
        Assertions.assertTrue(3 > 4);
    }
    @Test
    void exampleTest2() {
        Assertions.assertTrue(4 > 5);
    
    }
}
