public class IfStatement {
    public static void main(String[] args) {
        boolean logicTest = false;

        // if then
        if (logicTest) {
            // om  logicTest är = true kommer koden vi skriver här inne köras
            System.out.println("Logic test is true!");
        }

        int age = 15;

        if (age == 18) {
            System.out.println("You can go to the pub!");
        } else if (age >= 20) {
            System.out.println("You are allowed to shop at Systembolaget!");
        } else {
            System.out.println("Sorry you have to wait a few years to go to the pub and Systembolaget");
        }

        //else if (age == 20 || age > 20)
        // här kollar vi om age är exakt lika med 20 ELLER || om age är större än 20
    }
}
