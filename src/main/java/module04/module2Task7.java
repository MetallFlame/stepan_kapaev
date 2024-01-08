package module04;

public class module2Task7 {
    public static void main(String[] args) {
        int number = 123456;

        int numberRev = reverse(number);
        System.out.println(numberRev);
    }

    private static int reverse(int number){
        int digit = 0;
        while (number > 0){
            digit = digit * 10;
            digit += number % 10;
            number = number / 10;
        }
        return digit;
    }
}
