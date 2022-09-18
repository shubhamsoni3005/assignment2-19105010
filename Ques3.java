import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month = sc.nextInt(); //taking month as input from user
        switch (month) {
            case 1:
                System.out.println("Month: January, Number of Days = 31");
                break;
            case 2:
                System.out.println("Month: February, Number of Days = 28");
                break;
            case 3:
                System.out.println("Month: March, Number of Days = 31");
                break;
            case 4:
                System.out.println("Month: April, Number of Days = 30");
                break;
            case 5:
                System.out.println("Month: May, Number of Days = 31");
                break;
            case 6:
                System.out.println("Month: June, Number of Days = 30");
                break;
            case 7:
                System.out.println("Month: July, Number of Days = 31");
                break;
            case 8:
                System.out.println("Month: August, Number of Days = 31");
                break;
            case 9:
                System.out.println("Month: September, Number of Days = 30");
                break;
            case 10:
                System.out.println("Month: October, Number of Days = 31");
                break;
            case 11:
                System.out.println("Month: November, Number of Days = 30");
                break;
            case 12:
                System.out.println("Month: December, Number of Days = 31");
                break;
        }
    }
}
