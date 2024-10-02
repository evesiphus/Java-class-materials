package Exercise1;

class Calculation {
    public static void main(String[] args) {
        int maleCount = 20;
        int femaleCount = 15;
        int totalPeople = maleCount + femaleCount;

        // Check condition 1
        if (maleCount > femaleCount && totalPeople > 30) {
            System.out.println("More boys than girls, and total people > 30");
        }
        // Check condition 2
        if (maleCount > femaleCount || totalPeople > 30) {
            System.out.println("More boys than girls, or total people > 30");
        }
    }
}