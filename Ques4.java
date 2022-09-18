public class Ques4 {
    public static void main(String[] args) {
        int population = 80_000; //defining population
        double rate = 0.05d; //defining rate
        int time = 0; //time to calculate

        while(population < 150_000)
        {
            population += (population * rate); //population increasing each year
            time++;
        }
        System.out.println("The population will exceed 150000 in "+time+" years");
    }
}
