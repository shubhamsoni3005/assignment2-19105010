public class Ques5 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("n n^2 n^3 n^4"); //printing the first line
        for(int i=0; i<=n; i++) {
            System.out.println(i + " " + Math.round(Math.pow(i,2)) + " " + Math.round(Math.pow(i,3)) + " " + Math.round(Math.pow(i,4))); //printing next lies
        }
    }
}
