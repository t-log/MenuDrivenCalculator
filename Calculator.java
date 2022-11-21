import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("***MENU***\n" +
                "Enter Option:\n" +
                "1.Add \n" +
                "2.Sub \n" +
                "3.Multiply" +
                "4.Divide ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        double numberOne,numberTwo;
        switch (option){
            case 1:
                System.out.println("Enter two numbers to add:");
                numberOne = sc.nextInt();
                numberTwo = sc.nextInt();
                System.out.println("After addition, result ="+(numberOne+numberTwo));

        }
    }
}
