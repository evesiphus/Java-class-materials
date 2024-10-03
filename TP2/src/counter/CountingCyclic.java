package counter;

public class CountingCyclic {
    private int counter;
    private int maxValue = 0;

    // Constructor initializes counter to 0 and sets a maximum value
    public CountingCyclic(int maxValue) {
        this.maxValue = maxValue;
        this.counter = 0;
    }

    // Increment method: increases counter by 1, if counter > maxValue, set counter to 0
    public void incrementer(){
        if(this.counter < this.maxValue){
            this.counter++;
            System.out.println("Current counter value: " + this.counter);
        }else{
            this.counter = 0; // Reset to 0 if max value is reached
            System.out.println("Current counter value: " + this.counter);
        }
    }

    // Decrement method: decreases counter by 1, if counter < 0, set counter to maxValue
    public void decrementer(){
        if(this.counter > 0){
            this.counter--;
            System.out.println("Current counter value: " + this.counter);
        }else{
            this.counter = this.maxValue;
            System.out.println("Current counter value: " + this.counter);
        }
    }

    // method to display

    public void display(){
        System.out.println("Current counter value: " + this.counter);
    }

    public static void main(String[] args) {
        // Create an object of class Counting with maxValue = 5
        CountingCyclic count = new CountingCyclic(5);

        // Display initial value
        count.display();

        // Increment 8 times (max value is 5, so it will cycle)
        for (int i = 0; i < 8; i++) {
            count.incrementer();
        }

        // Display the value after 8 increments (expected to be 2 due to cycling)
        count.display();

        // Decrement 10 times (it will cycle back from 0 to max value)
        for (int i = 0; i < 10; i++) {
            count.decrementer();
        }

        // Display the value after 10 decrements (expected to be 1 due to cycling)
        count.display();
    }

}
