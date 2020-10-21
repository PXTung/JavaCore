package testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class JunitTestingTest {

    @Test
    public void test() {
        JunitTesting junitTesting = new JunitTesting();
        int output = junitTesting.acreage(5);
        assertEquals(25, output);
    }
}