import java.util.Random;

public class ServerNameGenerator {
    // #2 - Arrays: Server name generator
    private static final String[] adjectives = {"adventurous", "courageous", "dangerous", "exuberant", "outrageous", "prickly", "shiny", "victorious", "wandering", "zealous"}; // private means it can ONLY be accessed within its class.
    private static final String[] nouns = {"apple", "gold", "hamburger", "pizza", "potato", "breakfast", "leather", "whale", "football", "xylophone"}; // "final" keyword is like "const" in javascript.

    public static String randomName() {
        int randomAdjectiveIndex = new Random().nextInt(10); // int variable to store random number
        int randomNounIndex = new Random().nextInt(10);
        return adjectives[randomAdjectiveIndex] + "-" + nouns[randomNounIndex];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name: " + randomName());
    }
}
