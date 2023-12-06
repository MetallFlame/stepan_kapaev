package module02;

public class Task2 {
    public static void main(String[] args) {
        int number = 376;

        if ((number >= 100)&&(number < 1000)){
            int sum = sumCount(number);
            System.out.println(sum);
        }
    }

    private static int sumCount(int number) {
        int digit1 = number % 10;
        number = number / 10;
        int digit2 = number % 10;
        number = number / 10;
        int digit3 = number % 10;
        int sum = digit1 + digit2 + digit3;
        return (sum);
        }
    }