
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class BooleansTest {

    static Booleans e;

    @BeforeClass
    public static void setUp(){
        e = new Booleans();
    }

    /**
     * Tests the returnBoolean() method of the Booleans class.
     * 
     * This test verifies that, if returnBoolean() receives a value of `true`, it returns `true`.
     */
    @Test
    public void returnBooleanTest1(){
        boolean input = true;
        boolean actual = e.returnBoolean(input);
        Assert.assertTrue(actual);
    }

    /**
     * Tests the returnBoolean() method of the Booleans class.
     * 
     * This test verifies that, if returnBoolean() receives a value of `false`, it returns `false`.
     */
    @Test
    public void returnBooleanTest2(){
        boolean input = false;
        boolean actual = e.returnBoolean(input);
        Assert.assertFalse(actual);
    }

    /**
     * Tests the returnNot() method of the Booleans class.
     * 
     * This test verifies that, if returnNot() receives a value of `true`, it returns `false`.
     */
    @Test
    public void returnNotTest1(){
        boolean input = true;
        boolean actual = e.returnNot(input);
        Assert.assertFalse(actual);
    }
    
    /**
     * Tests the returnNot() method of the Booleans class.
     * 
     * This test verifies that, if returnNot() receives a value of `false`, it returns `true`.
     */
    @Test
    public void returnNotTest2(){
        boolean input = false;
        boolean actual = e.returnNot(input);
        Assert.assertTrue(actual);
    }

    /**
     * Tests the returnAnd() method of the Booleans class.
     * 
     * This test verifies that, if returnAnd() receives a value of `true` and `true`, it returns `true`.
     */
    @Test
    public void returnAndTest1(){
        boolean input1 = true;
        boolean input2 = true;
        boolean expected = true;
        boolean actual = e.returnAnd(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * Tests the returnAnd() method of the Booleans class.
     * 
     * This test verifies that, if returnAnd() receives a value of `false` and `true`, it returns `false`.
     */
    @Test
    public void returnAndTest2(){
        boolean input1 = false;
        boolean input2 = true;
        boolean expected = false;
        boolean actual = e.returnAnd(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * Tests the returnAnd() method of the Booleans class.
     * 
     * This test verifies that, if returnAnd() receives a value of `false` and `false`, it returns `false`.
     */
    @Test
    public void returnAndTest3(){
        boolean input1 = false;
        boolean input2 = false;
        boolean expected = false;
        boolean actual = e.returnAnd(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * Tests the returnAnd() method of the Booleans class.
     * 
     * This test verifies that, if returnAnd() receives a value of `false` and `true`, it returns `false`.
     */
    @Test
    public void returnAndTest4(){
        boolean input1 = false;
        boolean input2 = true;
        boolean expected = false;
        boolean actual = e.returnAnd(input1, input2);
        Assert.assertEquals(expected, actual);
    }

    /**
     * Tests the returnOr() method of the Booleans class.
     * 
     * This test verifies that, if returnOr() receives a value of `true` and `true`, it returns `true`.
     */
    @Test
    public void returnOrTest1(){
        boolean input1 = true;
        boolean input2 = true;
        boolean expected = true;
        boolean actual = e.returnOr(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * Tests the returnOr() method of the Booleans class.
     * 
     * This test verifies that, if returnOr() receives a value of `true` and `false`, it returns `true`.
     */
    @Test
    public void returnOrTest2(){
        boolean input1 = true;
        boolean input2 = false;
        boolean expected = true;
        boolean actual = e.returnOr(input1, input2);
        Assert.assertEquals(expected, actual);
    }

    /**
     * Tests the returnOr() method of the Booleans class.
     * 
     * This test verifies that, if returnOr() receives a value of `false` and `true`, it returns `true`.
     */
    @Test
    public void returnOrTest3(){
        boolean input1 = false;
        boolean input2 = true;
        boolean expected = true;
        boolean actual = e.returnOr(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * Tests the returnOr() method of the Booleans class.
     * 
     * This test verifies that, if returnOr() receives a value of `false` and `false`, it returns `false`.
     */
    @Test
    public void returnOrTest4(){
        boolean input1 = false;
        boolean input2 = false;
        boolean expected = false;
        boolean actual = e.returnOr(input1, input2);
        Assert.assertEquals(expected, actual);
    }


}
