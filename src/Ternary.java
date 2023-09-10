public class Ternary {
    public static void main(String[] args) {
        String dog = "Bullterrier";

        //boolean isShortHairedBreed = false;

        boolean isShortHairedBreed = dog == "Bullterrier" ? true : false;

        // det som kommer bakom ? det är precis samma sak som vi skriver i blocket efter vår if-sats
        // det som står efter : är samma sak som vårt else block

        if (isShortHairedBreed) {
            System.out.println("Bullterrier is a short haired breed");
        }

        String breed = isShortHairedBreed ? "This dog is a short haired breed" : "This dog is a long haired breed";
        System.out.println(breed);
    }
}
