package module04;

public class Task3 {
    public static void main(String[] args) {
        int min = 10;
        int max = 1000000;

        armstrongNumbers(min, max);
    }

    private static void armstrongNumbers(int min, int max) {
        for (int i = min; i <= max; i++){
            int numberLenth = numberCount(i);
            int numberS = numbersSum(i, numberLenth);
            if (numberS == i){
                System.out.println(i);
            }
        }
    }

    private static int numbersSum(int number, int power) {
        int sum = 0;
        while (number > 0){
            int digit = number % 10;
            number = number / 10;
            sum += Math.pow(digit, power);
        }
        return sum;
    }


    private static int numberCount(int i) {
        return Integer.toString(i).length();
    }
}
