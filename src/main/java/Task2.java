public class Task2 {
    public static void main(String[] args) {
        int number = 376;

        if ((number >= 100)&&(number < 1000)){
            sumCount(number);
        }
    }

    private static void sumCount(int number) {
        int digit1 = number % 10;
        number = number / 10;
        int digit2 = number % 10;
        number = number / 10;
        int digit3 = number % 10;
        System.out.println(digit1 + digit2 + digit3);
        }
    }