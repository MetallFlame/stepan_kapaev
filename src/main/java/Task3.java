public class Task3 {
    public static void main(String[] args) {
        float number = 6.4F;

        intCount(number);
    }

    private static void intCount(float number) {
        int number1 = (int) (number * 10);
        int number2 =  number1 % 10;
        if (number2 < 5){
            System.out.println((number1 - number2) / 10);
        }
        else {
            System.out.println((number1 - number2) / 10 + 1);
        }
    }
}
