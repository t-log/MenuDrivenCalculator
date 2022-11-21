import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        boolean flag = true;
        while(flag){
            System.out.println("***MENU***\n" +
                    "Enter Option:\n" +
                    "1.Add \n" +
                    "2.Sub \n" +
                    "3.Multiply \n" +
                    "4.Divide \n"+
                    "0.Exit");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            double numberOne,numberTwo;
            switch (option){
                case 1:
                    System.out.println("Enter two numbers to add:");
                    numberOne = sc.nextInt();
                    numberTwo = sc.nextInt();
                    System.out.println("After addition, result ="+(numberOne+numberTwo));
                    break;
                case 2:
                    System.out.println("Enter two numbers to subtract:");
                    numberOne = sc.nextInt();
                    numberTwo = sc.nextInt();
                    System.out.println("After subtraction, result ="+(numberOne-numberTwo));
                    break;
                case 3:
                    System.out.println("Enter two numbers to multiply:");
                    numberOne = sc.nextInt();
                    numberTwo = sc.nextInt();
                    System.out.println("After multiplication, result ="+(numberOne*numberTwo));
                    break;
                case 4:
                    System.out.println("Enter two numbers to divide:");
                    numberOne = sc.nextInt();
                    numberTwo = sc.nextInt();
                    System.out.println("After division, result ="+(numberOne/numberTwo));
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("No such operation");
            }
        }

    }
}
