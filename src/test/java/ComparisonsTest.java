
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ComparisonsTest {

    static Comparisons c;

    @BeforeClass
    public static void setUp() {
        c = new Comparisons();
    }

    /**
     * Tests the isEqual() method of the Comparisons class.
     * 
     * This test verifies that, if isEqual() receives two numbers that are equal, it
     * returns true.
     */
    @Test
    public void isEqualTest1() {
        int a = 1;
        int b = 1;
        boolean expected = true;
        boolean actual = c.isEqual(a, b);
        Assert.assertEquals(expected, actual);
    }

    /**
     * Tests the isEqual() method of the Comparisons class.
     * 
     * This test verifies that, if isEqual() receives two numbers that are not equal, it
     * returns false.
     */
    @Test
    public void isEqualTest2() {
        int a = 1;
        int b = 2;
        boolean expected = false;
        boolean actual = c.isEqual(a, b);
        Assert.assertEquals(expected, actual);
    }

    /**
     * Tests the isGreaterThan() method of the Comparisons class.
     * 
     * This test verifies that, if isGreaterThan()'s `a` parameter has a value greater than the `b` parameter, it
     * returns true.
     */
    @Test
    public void isGreaterThanTest1() {
        int a = 2;
        int b = 1;
        boolean expected = true;
        boolean actual = c.isGreaterThan(a, b);
        Assert.assertEquals(expected, actual);
    }

    /**
     * Tests the isGreaterThan() method of the Comparisons class.
     * 
     * This test verifies that, if isGreaterThan()'s `a` parameter has a value less than the `b` parameter, it
     * returns false.
     */
    @Test
    public void isGreaterThanTest2() {
        int a = 1;
        int b = 2;
        boolean expected = false;
        boolean actual = c.isGreaterThan(a, b);
        Assert.assertEquals(expected, actual);
    }

    /**
     * Tests the isGreaterThan() method of the Comparisons class.
     * 
     * This test verifies that, if isGreaterThan()'s parameters are equal, it
     * returns false.
     */
    @Test
    public void isGreaterThanTest3() {
        int a = 2;
        int b = 2;
        boolean expected = false;
        boolean actual = c.isGreaterThan(a, b);
        Assert.assertFalse(actual);
        Assert.assertEquals(expected, actual);
    }

    /**
     * Tests the isLessThan() method of the Comparisons class.
     * 
     * This test verifies that, if isLessThan()'s `a` parameter has a value smaller than the `b` parameter, it
     * returns true.
     */
    @Test
    public void isLessThanTest1() {
        int a = 1;
        int b = 2;
        boolean expected = true;
        boolean actual = c.isLessThan(a, b);
        Assert.assertEquals(expected, actual);
    }

    /**
     * Tests the isLessThan() method of the Comparisons class.
     * 
     * This test verifies that, if isLessThan()'s `a` parameter is equal to the `b` parameter, it
     * returns false.
     */
    @Test
    public void isLessThanTest2() {
        int a = 2;
        int b = 2;
        boolean expected = false;
        boolean actual = c.isLessThan(a, b);
        Assert.assertEquals(expected, actual);
    }


    /**
     * Tests the isLessThan() method of the Comparisons class.
     * 
     * This test verifies that, if isLessThan()'s `a` parameter has a value greater than the `b` parameter, it
     * returns false.
     */
    @Test
    public void isLessThanTest3() {
        int a = 2;
        int b = 1;
        boolean expected = false;
        boolean actual = c.isLessThan(a, b);
        Assert.assertEquals(expected, actual);
    }

    /**
     * Tests the isGreaterThanOrEqualTo() method of the Comparisons class.
     * 
     * This test verifies that, if isGreaterThanOrEqualTo()'s `a` parameter has a value greater than the `b` parameter, it
     * returns true.
     */
    @Test
    public void isGreaterThanOrEqualToTest1() {
        int a = 2;
        int b = 1;
        boolean expected = true;
        boolean actual = c.isGreaterThanOrEqualTo(a, b);
        Assert.assertEquals(expected, actual);
    }

    /**
     * Tests the isGreaterThanOrEqualTo() method of the Comparisons class.
     * 
     * This test verifies that, if isGreaterThanOrEqualTo()'s `a` parameter is equal to the `b` parameter, it
     * returns true.
     */
    @Test
    public void isGreaterThanOrEqualToTest2() {
        int a = 2;
        int b = 2;
        boolean expected = true;
        boolean actual = c.isGreaterThanOrEqualTo(a, b);
        Assert.assertEquals(expected, actual);
    }

    /**
     * Tests the isGreaterThanOrEqualTo() method of the Comparisons class.
     * 
     * This test verifies that, if isGreaterThanOrEqualTo()'s `a` parameter is less than the `b` parameter, it
     * returns false.
     */
    @Test
    public void isGreaterThanOrEqualToTest3() {
        int a = 3;
        int b = 4;
        boolean expected = false;
        boolean actual = c.isGreaterThanOrEqualTo(a, b);
        Assert.assertEquals(expected, actual);
    }

    /**
     * Tests the isLessThanOrEqualTo() method of the Comparisons class.
     * 
     * This test verifies that, if isLessThanOrEqualTo()'s `a` parameter is less than the `b` parameter, it
     * returns true.
     */
    @Test
    public void isLessThanOrEqualToTest1() {
        int a = 1;
        int b = 2;
        boolean expected = true;
        boolean actual = c.isLessThanOrEqualTo(a, b);
        Assert.assertEquals(expected, actual);
    }

    /**
     * Tests the isLessThanOrEqualTo() method of the Comparisons class.
     * 
     * This test verifies that, if isLessThanOrEqualTo()'s `a` parameter is equal to the `b` parameter, it
     * returns true.
     */
    @Test
    public void isLessThanOrEqualToTest2() {
        int a = 2;
        int b = 2;
        boolean expected = true;
        boolean actual = c.isLessThanOrEqualTo(a, b);
        Assert.assertEquals(expected, actual);
    }

    /**
     * Tests the isLessThanOrEqualTo() method of the Comparisons class.
     * 
     * This test verifies that, if isLessThanOrEqualTo()'s `a` parameter is greater than the `b` parameter, it
     * returns false.
     */
    @Test
    public void isLessThanOrEqualToTest3() {
        int a = 4;
        int b = 2;
        boolean expected = false;
        boolean actual = c.isLessThanOrEqualTo(a, b);
        Assert.assertEquals(expected, actual);
    }

    /**
     * Tests the isNotEqualTo() method of the Comparisons class.
     * 
     * This test verifies that, if isNotEqualTo()'s `a` parameter is equal to the `b` parameter, it
     * returns false.
     */
    @Test
    public void isNotEqualToTest1() {
        int a = 1;
        int b = 1;
        boolean expected = false;
        boolean actual = c.isNotEqualTo(a, b);
        Assert.assertEquals(expected, actual);
    }

    /**
     * Tests the isNotEqualTo() method of the Comparisons class.
     * 
     * This test verifies that, if isNotEqualTo()'s `a` parameter is not equal to the `b` parameter, it
     * returns true.
     */
    @Test
    public void isNotEqualToTest2() {
        int a = 1;
        int b = 2;
        boolean expected = true;
        boolean actual = c.isNotEqualTo(a, b);
        Assert.assertEquals(expected, actual);
    }
}
