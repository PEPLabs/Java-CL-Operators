// This file is optional to edit and can be used for manual testing.

public class Main {
    /**
     * The entry point of the application.
     * 
     * This method calls manual testing methods.
     * 
     * @param args - Command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        
        comparisonsManualTesting();

        booleansManualTesting();

        booleansManualTesting();

    }

    /**
     * This method creates a Comparisons object and manually tests it's methods by calling them several times with varying arguments and printing out the results.
     * 
     */
    public static void comparisonsManualTesting(){
        Comparisons comparisons = new Comparisons();

        System.out.println("Currently, isEqual produces the following value for '4 is equal to 4':");
        boolean result11 = comparisons.isEqual(4,4);
        System.out.println(result11);

        System.out.println("Currently, isEqual produces the following value for '2 is equal to 7':");
        boolean result12 = comparisons.isEqual(2,7);
        System.out.println(result12);

        System.out.println("Currently, greaterThan produces the following value for '5 is greater than 3':");
        boolean result21 = comparisons.isGreaterThan(5,3);
        System.out.println(result21);

        System.out.println("Currently, greaterThan produces the following value for '4 is greater than 9':");
        boolean result22 = comparisons.isGreaterThan(4,9);
        System.out.println(result22);

        System.out.println("Currently, lessThan produces the following value for '3 is less than 6':");
        boolean result31 = comparisons.isLessThan(3,6);
        System.out.println(result31);

        System.out.println("Currently, lessThan produces the following value for '2 is less than 1':");
        boolean result32 = comparisons.isLessThan(2,1);
        System.out.println(result32);

        System.out.println("Currently, notEqualTo produces the following value for '1 is not equal to 9':");
        boolean result41 = comparisons.isNotEqualTo(1,9);
        System.out.println(result41);

        System.out.println("Currently, notEqualTo produces the following value for '8 is not equal to 8':");
        boolean result42 = comparisons.isNotEqualTo(8,8);
        System.out.println(result42);
    }

    /**
     * This method creates a Booleans object and manually tests it's methods by calling them several times with varying arguments and printing out the results.
     * 
     */
    public static void booleansManualTesting() {
        Booleans booleans = new Booleans();
        System.out.println("Consider the expression 'true IS true'.");
        System.out.println("Here's what Booleans.returnBoolean returns when provided the value 'true' (should be 'true')");
        boolean result1 = booleans.returnBoolean(true);
        System.out.println(result1);

        System.out.println("Consider the expression 'false IS false'.");
        System.out.println("Here's what Booleans.returnBoolean returns when provided the value 'false' (should be 'false')");
        boolean result2 = booleans.returnBoolean(false);
        System.out.println(result2);

        System.out.println("Consider the expression 'true IS NOT false'.");
        System.out.println("Here's what Booleans.returnNot returns when provided the value 'true' (should be 'false')");
        boolean result3 = booleans.returnNot(true);
        System.out.println(result3);

        System.out.println("Consider the expression 'false IS NOT true'.");
        System.out.println("Here's what Booleans.returnNot returns when provided the value 'false' (should be 'true')");
        boolean result4 = booleans.returnNot(false);
        System.out.println(result4);

        System.out.println("Consider the expression 'true AND true IS true'.");
        System.out.println("Here's what Booleans.returnAnd returns when provided the values 'true', 'true' (should be 'true')");
        boolean result5 = booleans.returnAnd(true, true);
        System.out.println(result5);

        System.out.println("Consider the expression 'true AND false IS false'.");
        System.out.println("Here's what Booleans.returnAnd returns when provided the values 'true', 'false' (should be 'false')");
        boolean result6 = booleans.returnAnd(true, false);
        System.out.println(result6);

        System.out.println("Consider the expression 'true OR true IS true'.");
        System.out.println("Here's what Booleans.returnAnd returns when provided the values 'true', 'true' (should be 'true')");
        boolean result7 = booleans.returnOr(true, true);
        System.out.println(result7);

        System.out.println("Consider the expression 'true OR false IS true'.");
        System.out.println("Here's what Booleans.returnAnd returns when provided the values 'true', 'false' (should be 'true')");
        boolean result8 = booleans.returnOr(true, false);
        System.out.println(result8);

        System.out.println("Consider the expression 'false OR false IS false'.");
        System.out.println("Here's what Booleans.returnAnd returns when provided the values 'false', 'false' (should be 'false')");
        boolean result9 = booleans.returnOr(false, false);
        System.out.println(result9);
    }

    /**
     * This method creates a BooleansAdvanced object and manually tests it's methods by calling them several times with varying arguments and printing out the results.
     * 
     */
    public static void BooleansAdvancedManualTesting() {
        BooleansAdvanced boolsAdv = new BooleansAdvanced();
        
        //NOTE: The values below will be incorrect until you update AdvancedBooleanLogic.java with the correct logic
        System.out.println("~~~~returnNotBoth()~~~~");
        System.out.println("Input: b1=true and b2=true   | Expected: false | Actual: " + boolsAdv.returnNotBoth(true, true));
        System.out.println("Input: b1=true and b2=false  | Expected: true  | Actual: " + boolsAdv.returnNotBoth(true, false));
        System.out.println("Input: b1=false and b2=true  | Expected: true  | Actual: " + boolsAdv.returnNotBoth(false, true));
        System.out.println("Input: b1=false and b2=false | Expected: true  | Actual: " + boolsAdv.returnNotBoth(false, false));

        System.out.println("\n~~~~returnExclusiveOr()~~~~");
        System.out.println("Input: b1=true and b2=true   | Expected: false | Actual: " + boolsAdv.returnExclusiveOr(true, true));
        System.out.println("Input: b1=true and b2=false  | Expected: true  | Actual: " + boolsAdv.returnExclusiveOr(true, false));
        System.out.println("Input: b1=false and b2=true  | Expected: true  | Actual: " + boolsAdv.returnExclusiveOr(false, true));
        System.out.println("Input: b1=false and b2=false | Expected: false | Actual: " + boolsAdv.returnExclusiveOr(false, false));

        System.out.println("\n~~~~returnNeitherNor()~~~~");
        System.out.println("Input: b1=true and b2=true   | Expected: false | Actual: " + boolsAdv.returnNeitherNor(true, true));
        System.out.println("Input: b1=true and b2=false  | Expected: false | Actual: " + boolsAdv.returnNeitherNor(true, false));
        System.out.println("Input: b1=false and b2=true  | Expected: false | Actual: " + boolsAdv.returnNeitherNor(false, true));
        System.out.println("Input: b1=false and b2=false | Expected: true  | Actual: " + boolsAdv.returnNeitherNor(false, false));
    
    }
}
