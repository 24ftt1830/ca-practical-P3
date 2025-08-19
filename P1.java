package P3;

public class P1 {
    
    public static void main(String[] args) {
        
        final double PI = 3.14;
        double base = 4.0;
        double height = 6.0;
        double radius = 8.0;

        double areaOfSquare = (base*base);
        double areaOfTriangle = (base*height/2);
        double areaOfCircle = (PI*radius*radius);

        System.out.printf("The area of square is %.1f%n"+"The area of triangle is %.1f%n"+"The area of circle is %.2f%n", areaOfSquare, areaOfTriangle, areaOfCircle);
    }
}
