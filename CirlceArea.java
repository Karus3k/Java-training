import java.util.Scanner;

public class CirlceArea {
    public void circleArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();
        double area = Math.PI*radius;
        System.out.println("The area of the circle is:"+area);
    }
}
