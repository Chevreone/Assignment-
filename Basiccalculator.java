import java.util.Scanner; 

public class Basiccalculator {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = scan.nextDouble();

        System.out.print("Enter second number: ");
        double b = scan.nextDouble();

        System.out.print("Enter an operator: (+ or - or * or /): ");
        char operator = scan.next().charAt(0);

        boolean isValid = true;
        double result = 0;

        switch(operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Unknown operator. Please select only (+ or - or * or /)");
                isValid = false;
                break;
                
        }

        if(isValid) System.out.println(a + " " + b + " = " + result);


    }
    
}
