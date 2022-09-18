public class MinOfThree {
    public static void main(String[] args) {
        int num1 = 6, num2 = 5, num3 = -7; //declaring 3 numbers
        if (num1 < num2) {
            if (num1 < num3)
                System.out.println(num1);
            else //when num3 is greater than num1
                System.out.println(num3);
        } else { //when num1 is greater than num2
            if (num2 < num3)
                System.out.println(num2);
            else //when num3 is greater than num2
                System.out.println(num3);
        }
    }
}
