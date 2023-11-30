public class Task3 {
    public static void main(String[] args) {
        float number = 6.4F;

        int count = intCount(number);
        System.out.println(count);
    }

    private static int intCount(float number) {
        int number1 = (int) (number * 10);
        int number2 = number1 % 10;

        if (number2 < 5) {
            int count = (number1 - number2) / 10;
            return (count);
        }
        else {
            int count = (number1 - number2) / 10 + 1;
            return (count);
        }
    }
}