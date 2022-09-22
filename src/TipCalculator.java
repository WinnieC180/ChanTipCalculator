import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("Welcome to the Tip Calculator!");
        System.out.println("-------------------------------"); //rjhfhs

        System.out.println();
        System.out.print("How many people are you with?: ");
        int ppl = scan.nextInt();
        System.out.println();
        System.out.println("|enter an integer without the % sign|");
        System.out.print("What is the tip percentage? (0-100): ");
        double tipPercent = scan.nextDouble(); //set to double, so it could be turned to a decimal
        tipPercent /= 100;

        double totalBill = 0.0;
        double costOfItem = 0;
        double tip;
        double totalTip = 0.0;

        while (costOfItem != -1) {
            System.out.print("Enter the cost in dollars and cents, (enter -1 to end): ");
            costOfItem = scan.nextDouble();
            if (costOfItem != -1) {
                totalBill = totalBill + costOfItem;
                tip = costOfItem * tipPercent;
                totalTip = totalTip + tip;
            }
        }

        System.out.println("-------------------------------");
        System.out.println("Total Bill before tip: " + totalBill);
    }
}
