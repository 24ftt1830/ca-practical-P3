package P3.P3;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);

        // User Input
        System.out.println("Each Durian Cost $15.75");
        System.out.print("How Much Money Do You Have? $");
        double money = input.nextDouble();

        // Price of the durian
        double durian = 15.75;

        // Calculate how many user can buy
        int count = (int)(money / durian);

        // Output
        System.out.println("The number of durian(s) you can buy is "+count);
    }
}

