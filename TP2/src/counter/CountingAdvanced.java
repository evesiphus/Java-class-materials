package counter;


public class CountingAdvanced{
    private int counter;
    private int maxValue; // Maximum value for the counter

    // Constructor initializes counter to 0 and sets a maximum value
    public CountingAdvanced (int maxValue) {
        this.counter = 0;
        this.maxValue = maxValue;
    }

    // Increment method: increases counter by 1, but only if counter < maxValue
    public void incrementer() {
        if (this.counter < this.maxValue) {
            this.counter += 1;
        } else {
            System.out.println("Counter is at the maximum value: " + this.maxValue);
        }
    }

    // Decrement method: decreases counter by 1, but only if it's greater than 0
    public void decrementer() {
        if (this.counter > 0) {
            this.counter -= 1;
        } else {
            System.out.println("Counter cannot be negative.");
        }
    }

    // Method to display the current value of the counter
    public void display() {
        System.out.println("Current counter value: " + this.counter);
    }

    public static void main(String[] args) {
        //creat an object of class Counting
        CountingAdvanced counter= new CountingAdvanced(5);

        // Display initial value
        counter.display();

        // Increment 10 times
        for (int i = 0; i <10; i++){
            counter.incrementer();
        }
        counter.display();

        // Increment 20 times
        for (int i = 0; i <20; i++){
            counter.decrementer();
        }
        counter.display();

    }
}

