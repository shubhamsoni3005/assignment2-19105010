import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score value: ");
        double score = sc.nextFloat(); //taking input from user
        if (score > 80 && score < 90) //checking the condition
            score += 5; //increasing score value
        System.out.println("New score: "+score);
    }
}
