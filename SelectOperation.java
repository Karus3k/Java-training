import bankAccount.BankInterface;
import bankAccount.BankOperations;

import java.util.Scanner;

public class SelectOperation {
    public void selectOperation(){
        calculator calculator = new calculator();
        Iteration iteration = new Iteration();
        Comparison comparison = new Comparison();
        CirlceArea cirlceArea = new CirlceArea();
        BankInterface bankInterface = new BankInterface();
        Scanner sc = new Scanner(System.in);
        System.out.println("Select an operation:");
        System.out.println("1 - Calculator");
        System.out.println("2 - Iteration");
        System.out.println("3 - Comparison");
        System.out.println("4 - Circle area");
        System.out.println("5 - Bank account");
        char selectedOperation = sc.next().charAt(0);
        switch (selectedOperation){
            case '1':
                calculator.calculation();
                break;
            case '2':
                iteration.iteration();
                break;
            case  '3':
                comparison.comparison();
                break;
            case '4':
                cirlceArea.circleArea();
                break;
            case '5':
                bankInterface.bankAccount();
            default:
                System.out.println("Invalid operation");
    }
    }
}

