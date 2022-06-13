package Die;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DiceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lets roll some Dice");
        System.out.println("How Many sides for your Dice?");
        int numSides = getIntegerInput(scanner);
        while (numSides <= 3 || numSides > 100){
            System.out.println("Enter a number between 1 and 100");
            numSides = Integer.parseInt(scanner.nextLine().trim());
        }

        System.out.println("How Many Dice?");
        int numDice = getIntegerInput(scanner);
        while (numDice <= 0 || numDice > 20){
        System.out.println("Enter a number between 1 and 20 ");
            numDice = getIntegerInput(scanner);
        }

        System.out.println("What color dice?");
        String color = scanner.nextLine().trim();

        List<Die> dice = createDice(numDice, numSides, color);

        Boolean isRollingAgain = true;
        while (isRollingAgain) {
        System.out.println(rollDice(dice) + "\n");
            System.out.println("Would you like to roll again? Y or N");
            String rollAgain = scanner.nextLine().trim();
            if (rollAgain.equals("N")) {
                isRollingAgain = false;
            } else if (rollAgain.equals("Y")) {
                System.out.println(rollDice(dice));
            } else {
                break;
            }
        }
    }

    public static List<Die> createDice(int numDice, int numSides, String color){
        List<Die> diceList = new ArrayList<>();
        for (int i = 0; i < numDice; i++) {
            diceList.add(new Die(numSides, color));
        }
        return diceList;
    }

    public static List<Integer> rollDice(List<Die> dieList){
        List<Integer> diceRollList = new LinkedList<>();
        for(Die die: dieList){
           diceRollList.add(die.rollDie());
        }
        return diceRollList;
    }

    public static int getIntegerInput(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine().trim());
    }


}
