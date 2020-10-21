package testing;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class JunitTestingTest2 {

    @Test
    void acreage() {
        JunitTesting junitTesting = new JunitTesting();
        int output = junitTesting.acreage(5);
        assertEquals(25, output);
    }
}