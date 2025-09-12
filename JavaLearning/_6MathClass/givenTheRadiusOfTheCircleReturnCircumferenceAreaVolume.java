package _6MathClass;
import java.util.Scanner;
public class givenTheRadiusOfTheCircleReturnCircumferenceAreaVolume {
    public static void main(String[] args) {
        // circumference = 2 * pi * r
        // area = pi * r^2
        // volume = pi * r^2 * h

        double circumference, area, volume, radius, height;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = input.nextDouble();
        System.out.print("Enter height: ");
        height = input.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = Math.PI * Math.pow(radius, 2) * height;

        System.out.println("The circumference of the circle is " + circumference);
        System.out.println("The area of the circle is " + area);
        System.out.println("The volume of the circle is " + volume);


        input.close();
    }
}
