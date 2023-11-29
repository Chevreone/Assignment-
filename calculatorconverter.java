import java.util.Scanner;

public class calculatorconverter {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Fahrenheit to Celsius (1) or Celsius to Farenheit (2)");
        int result = scan.nextInt();

        if (result == 1) {

            System.out.println("You have chosen Fahrenheit to Celsius!");
            System.out.println("Enter Fahrenheit Value: ");
            double value = scan.nextDouble();
            double valueFinal= (value - 32) * 5/9;
            System.out.print("Celsius is : ");
            System.out.println(Math.round(valueFinal*10.0)/10.0);

        } else if (result == 2) {

            System.out.println("You have chosen Celsius to Fahrenheit!");
            System.out.println("Enter Celsius Value: ");
            double value2 = scan.nextDouble();
            double finaResult = value2 * 1.82 + 32;
            System.out.print("Fahrenheit is : ");
            System.out.println(Math.round(finaResult*10.0)/10.0);
            
        } else {
            System.out.println("Not a valid choice!");
        }
    }
}
