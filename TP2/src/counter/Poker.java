package counter;
import java.util.Random;

public class Poker {
    private int diceValue;
    private Random random;
    public Poker() {
        random = new Random();
        diceValue = random.nextInt(6) + 1;
    }
    // Method to generate a new random dic value between 1 and 6
    public void newThrow() {
        this.diceValue = random.nextInt(6) + 1;
    }

    public void displayValue(){
        System.out.println("Dice shows: " + this.diceValue);
    }

    public static void main(String[] args) {
        // Create an object of class Poker
        Poker pokerDice = new Poker();

        // Throw the dice 10 times
        for (int i = 0; i < 10; i++) {
            pokerDice.newThrow(); // Generate a new dice value
            pokerDice.displayValue(); // Display the new value
        }
    }

}
