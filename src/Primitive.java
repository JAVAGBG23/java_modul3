public class Primitive {
    public static void main(String[] args) {
        // MINSTA TILLÅTNA VÄRDE PÅ INTEGER I JAVA
        int minIntValue = Integer.MIN_VALUE;

        // Integer.MIN_VALUE = expression

        //System.out.println(minIntValue);

        // MAX TILLÅTNA VÄRDE PÅ INTEGER I JAVA
        int maxIntValue = Integer.MAX_VALUE;

        //System.out.println(maxIntValue);

        System.out.println("Minimum int value: " + minIntValue);

        System.out.println("Maximum int value: " + maxIntValue);

        //System.out.println("Integer value range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);

        // vad händer om vi plussar på 1 på max value?

        // blir inte bra...
        //System.out.println("Max value? " + maxIntValue + 1);

        System.out.println("Max value? " + (maxIntValue + 1));

        //int testValue = 2147483648;































    }
}
