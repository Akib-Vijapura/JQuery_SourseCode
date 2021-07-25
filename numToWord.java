// convert number into words 

import java.util.Scanner;

public class numToWord {

    public static void main(String[] args) {
        System.out.println("Please Choose Number Between 1 To 10");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        switch (n) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            default:
                System.out.println("Please Enter Number Only Between 1 To 10");
        }
    }

}
