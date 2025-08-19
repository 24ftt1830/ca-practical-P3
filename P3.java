package P3.P3;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        
        Scanner input = new
        Scanner(System.in);

        System.out.print("Enter a character: ");
        
        char character = input.next().charAt(0);
        int character1 = (character);
    
    
        System.out.println("The Unicode for character "+character+" is "+character1);
    }
}
