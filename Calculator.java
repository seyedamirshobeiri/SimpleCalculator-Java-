import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Please enter an operator (+, -, *, /): ");
        String operator = scanner.next();



        
        System.out.println("Please enter the second number: ");
        double num2 = scanner.nextDouble();
        SimpleCalculatorClass newClass1 = new SimpleCalculatorClass();
        newClass1.GetResult(num1,num2,operator);
        
        
 

        
    }
}
