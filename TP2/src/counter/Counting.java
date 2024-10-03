package counter;

public class Counting {
    private int counter;

    // Constructor initialized counter to 0
    public Counting() {
        this.counter = 0;
    }

    // Increment method: increases counter by 1
    public void incrementer() {
        this.counter++;
    }

    // Decrement method: decreases counter by 1, but only if it;s greater than 0
    public void decrementer() {
        if(this.counter > 0) {
            this.counter--;
        } else{
            System.out.println("Counter exceeded");
        }
    }

    // Method to display the current value of the counter
    public void display(){
        System.out.println("Counter: " + this.counter);
    }

    public static void main(String[] args) {
        //creat an object of class Counting
        Counting counter = new Counting();

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
