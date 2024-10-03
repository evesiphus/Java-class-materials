package exercise1;

import java.util.Random;

class Calculation2 {
    public static void main(String[] args) {
        int maleCount = 20;

        // Generate random number of girls
        Random rand = new Random();
        int femaleCount = rand.nextInt(31) + 10;

        int totalPeople = maleCount + femaleCount;

        // Check: condition 1
        if (maleCount > femaleCount && totalPeople > 30) {
            System.out.println("More boys than girls, and total people > 30");
            System.out.println("Total people: " + totalPeople);
            System.out.println("Males: " + maleCount);
            System.out.println("Females: " + femaleCount);
        }

        // Check: condition 2
        if (maleCount > femaleCount || totalPeople > 30) {
            System.out.println("More boys than girls, or total people > 30");
            System.out.println("Total people: " + totalPeople);
            System.out.println("Males: " + maleCount);
            System.out.println("Females: " + femaleCount);
        }
    }
}