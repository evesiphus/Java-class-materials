package exercise2;
import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        Random rand = new Random();
        for(int i = 1; i<=10;i++){
            int dice = rand.nextInt(6) + 1;
            System.out.println(dice);
        }
    }
}
