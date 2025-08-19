package P3.P3;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
         Scanner input = new
         Scanner(System.in);

         System.out.print("What is your target amount? $");

         double MoneyAmount = input.nextDouble();

         System.out.print("How many month(s) to reach your goal? ");
         byte MonthReach = input.nextByte();

         double Average = (MoneyAmount/(MonthReach*30));

         System.out.printf("The amount you need to save per day is $ %.2f%n",Average);
    }
}
