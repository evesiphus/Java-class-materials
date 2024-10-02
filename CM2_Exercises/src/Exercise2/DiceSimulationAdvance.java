package Exercise2;
import java.util.Random;
// Use While  to simulate: Exit when you get a value of 6. And print
//the number of times required to get 6.

public class DiceSimulationAdvance {
    public void simulateUntilSix() {
        Random rand = new Random();
        int count = 0;
        int DiceValue = 0;

        while(DiceValue != 6) {
            count++;
            DiceValue = rand.nextInt(6) + 1;
            System.out.println("Throw " + count + " " + DiceValue);
        }
        System.out.println("It took " + count + " throws to get a 6.");
    }
    public static void main(String[] args) {
        DiceSimulationAdvance simulation = new DiceSimulationAdvance();
        simulation.simulateUntilSix();
    }

}
