
import java.util.Scanner;

puublic class Username {
    
    public static void main(String[] args) {

        System.out.println("Enter your username: ");

        Scanner scan = new Scanner(System.in);

        String name = input.nextLine();

    
        if(NotLongEnough(nickname)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }

    public static boolean NotLongEnough(String name) {
        
        return name.length() > 6;
    }

}
