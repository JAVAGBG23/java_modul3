public class LogicalOperators {
    public static void main(String[] args) {
        int testNumberOne = 80;

     /*   if (testNumberOne < 100) {
            System.out.println("Test number is less than 100");
        }*/

        int testNumberTwo = 100;

        // OCH OPERATORN
        // vi ska kolla om test ett är större än test 2 OCH om test ett är mindre än 100
        if (testNumberOne > testNumberTwo && testNumberOne < 100) {
            System.out.println("Test number one is greater than test number two and less than 100");
        }

        // ELLER OPERATORN
        if (testNumberOne > 90 || testNumberTwo <= 90) {
            System.out.println("Either or both conditions are true");
        }
















    }
}
