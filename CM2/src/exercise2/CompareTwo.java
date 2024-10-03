package exercise2;

import java.util.Random;

class CompareTwo {
    public void compareTwo() {
        Random random = new Random();
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;

        System.out.println(dice1 + " " + dice2);
        if (dice1 > dice2) {
            System.out.println("Dice 1 wins!");
        } else if (dice1 < dice2) {
            System.out.println("Dice 2 wins!");
        } else{
            System.out.println("It's a tie !");
        }
    }

    public static void main(String[] args) {

        CompareTwo  diceSim = new CompareTwo();
        diceSim.compareTwo ();
    }

}
