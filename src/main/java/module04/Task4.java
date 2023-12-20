package module04;

public class Task4 {
    public static void main(String[] args) {
        int min = 1;
        int max = 1000000;

        perfectCount(min, max);
    }

    private static void perfectCount(int min, int max) {
        for (int i = min; i <= max; i++){
            int sum = numbersSum(i);
            if (sum == i){
                System.out.println(i);
            }
        }
    }

    private static int numbersSum(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}
