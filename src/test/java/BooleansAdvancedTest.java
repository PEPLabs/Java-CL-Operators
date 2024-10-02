import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class BooleansAdvancedTest {
    static BooleansAdvanced boolAdv;

    @BeforeClass
    public static void setUp(){
        boolAdv = new BooleansAdvanced();
    }

    /**
     * Tests the returnNotBoth() method of the AdvanedBooleanLogic class.
     * 
     * This test verifies that, if returnNotBoth() receives a values of `true` and `true`, it returns `false`.
     */
    @Test
    public void returnNotBothTest1(){
        boolean input1 = true;
        boolean input2 = true;
        boolean expected = false;
        boolean actual = boolAdv.returnNotBoth(input1, input2);
        Assert.assertEquals(expected, actual);
    }

    /**
     * Tests the returnNotBoth() method of the AdvanedBooleanLogic class.
     * 
     * This test verifies that, if returnNotBoth() receives a values of `true` and `false`, it returns `true`.
     */
    @Test
    public void returnNotBothTest2(){
        boolean input1 = true;
        boolean input2 = false;
        boolean expected = true;
        boolean actual = boolAdv.returnNotBoth(input1, input2);
        Assert.assertEquals(expected, actual);
    }

    /**
     * Tests the returnNotBoth() method of the AdvanedBooleanLogic class.
     * 
     * This test verifies that, if returnNotBoth() receives a values of `false` and `true`, it returns `true`.
     */
    @Test
    public void returnNotBothTest3(){
        boolean input1 = false;
        boolean input2 = true;
        boolean expected = true;
        boolean actual = boolAdv.returnNotBoth(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * Tests the returnNotBoth() method of the AdvanedBooleanLogic class.
     * 
     * This test verifies that, if returnNotBoth() receives a values of `false` and `false`, it returns `true`.
     */
    @Test
    public void returnNotBothTest4(){
        boolean input1 = false;
        boolean input2 = false;
        boolean expected = true;
        boolean actual = boolAdv.returnNotBoth(input1, input2);
        Assert.assertEquals(expected, actual);
    }

    /**
     * Tests the returnExclusiveOr() method of the AdvanedBooleanLogic class.
     * 
     * This test verifies that, if returnExclusiveOr() receives a values of `true` and `true`, it returns `false`.
     */
    @Test
    public void returnExclusiveOrTest1(){
        boolean input1 = true;
        boolean input2 = true;
        boolean expected = false;
        boolean actual = boolAdv.returnExclusiveOr(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * Tests the returnExclusiveOr() method of the AdvanedBooleanLogic class.
     * 
     * This test verifies that, if returnExclusiveOr() receives a values of `true` and `false`, it returns `true`.
     */
    @Test
    public void returnExclusiveOrTest2(){
        boolean input1 = true;
        boolean input2 = false;
        boolean expected = true;
        boolean actual = boolAdv.returnExclusiveOr(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * Tests the returnExclusiveOr() method of the AdvanedBooleanLogic class.
     * 
     * This test verifies that, if returnExclusiveOr() receives a values of `false` and `true`, it returns `true`.
     */
    @Test
    public void returnExclusiveOrTest3(){
        boolean input1 = false;
        boolean input2 = true;
        boolean expected = true;
        boolean actual = boolAdv.returnExclusiveOr(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * Tests the returnExclusiveOr() method of the AdvanedBooleanLogic class.
     * 
     * This test verifies that, if returnExclusiveOr() receives a values of `false` and `false`, it returns `false`.
     */
    @Test
    public void returnExclusiveOrTest4(){
        boolean input1 = false;
        boolean input2 = false;
        boolean expected = false;
        boolean actual = boolAdv.returnExclusiveOr(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * Tests the returnNeitherNor() method of the AdvanedBooleanLogic class.
     * 
     * This test verifies that, if returnNeitherNor() receives a values of `true` and `true`, it returns `false`.
     */
    @Test
    public void returnNeitherNorTest1(){
        boolean input1 = true;
        boolean input2 = true;
        boolean expected = false;
        boolean actual = boolAdv.returnNeitherNor(input1, input2);
        Assert.assertEquals(expected, actual);
    }

    /**
     * Tests the returnNeitherNor() method of the AdvanedBooleanLogic class.
     * 
     * This test verifies that, if returnNeitherNor() receives a values of `false` and `true`, it returns `false`.
     */
    @Test
    public void returnNeitherNorTest2(){
        boolean input1 = false;
        boolean input2 = true;
        boolean expected = false;
        boolean actual = boolAdv.returnNeitherNor(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * Tests the returnNeitherNor() method of the AdvanedBooleanLogic class.
     * 
     * This test verifies that, if returnNeitherNor() receives a values of `true` and `false`, it returns `false`.
     */
    @Test
    public void returnNeitherNorTest3(){
        boolean input1 = true;
        boolean input2 = false;
        boolean expected = false;
        boolean actual = boolAdv.returnNeitherNor(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * Tests the returnNeitherNor() method of the AdvanedBooleanLogic class.
     * 
     * This test verifies that, if returnNeitherNor() receives a values of `false` and `false`, it returns `true`.
     */
    @Test
    public void returnNeitherNorTest4(){
        boolean input1 = false;
        boolean input2 = false;
        boolean expected = true;
        boolean actual = boolAdv.returnNeitherNor(input1, input2);
        Assert.assertEquals(expected, actual);
    }
}
