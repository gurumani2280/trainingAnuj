package upei.project;
import java.util.Random;
public class Dice {

    private final Random random; // Random generator instance
    private int firstRoll;
    private int secondRoll;

    public Dice() {
        this.random = new Random();
    }

    public int roll() {
        //promptRoll();
        firstRoll = random.nextInt(6) + 1; // Roll die 1 (1-6)
        secondRoll = random.nextInt(6) + 1; // Roll die 2 (1-6)

        displayRolls();
        return getCurrentRoll();
    }

    public int getCurrentRoll() {
        return firstRoll + secondRoll;
    }

    public boolean isDouble() {
        return firstRoll == secondRoll;
    }

//    private void promptRoll() {
//        System.out.print("Press Enter to roll the dice...");
//        Input.read(); // Pauses for user input
//    }

    private void displayRolls() {
        System.out.println("You rolled a " + firstRoll + " and a " + secondRoll + " (Total: " + getCurrentRoll() + ")");
    }
}


