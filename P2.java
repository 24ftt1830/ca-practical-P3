package P3.P3;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner input = new
        Scanner(System.in);

        System.out.print("Enter the number of byte(s) to be converted: ");
        int number = input.nextInt();

        int numberBits = (number*8);
        
        System.out.println(number+" byte(s) is "+numberBits+" bits.");
    }
}
