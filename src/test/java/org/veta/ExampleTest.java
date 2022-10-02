package org.veta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ExampleTest {
    @Test
    void exampleTest0() {
        Assertions.assertTrue(2 < 8);
    }

    @Test
    void exampleTest1() {
        Assertions.assertFalse(3 > 9);
    }
    @Test
    void exampleTest2() {
        Assertions.assertFalse(4 > 10);

    }
}
