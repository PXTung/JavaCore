package testing;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class JunitTestingTest3 {

    @Test
    void acreage() {
        JunitTesting junitTesting = new JunitTesting();
        int output = junitTesting.acreage(5);
        assertEquals(25, output);
    }

    @Test
    void countString() {
        JunitTesting junitTesting = new JunitTesting();
        int output = junitTesting.countString("aaAA");
        assertEquals(4, output);
    }
}