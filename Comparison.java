import java.util.Scanner;

public class Comparison {
    public void comparison() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2){
            System.out.println(num1+" is greaten dan "+num2);
        }
        else if (num1 < num2){
            System.out.println(num1+" is less dan "+num2);
        }
        else {
            System.out.println(num1+" is equal to "+num2);
        }
    }
}
