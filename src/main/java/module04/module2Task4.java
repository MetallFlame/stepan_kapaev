package module04;


public class module2Task4 {
    public static void main(String[] args) {
        int number = 25;
        boolean emptyFull = false;

        if (number % 2 != 0){
            romb(number, emptyFull);
        }
        else {
            System.out.println("Ваше число некорректно.Введите нечётное число!");
        }
    }

    private static void romb(int number, boolean emptyFull) {
        star(number);
        upperPart(number, emptyFull);
        middle(number, emptyFull);
        lowerPart(number, emptyFull);
        star(number);
    }

    private static void middle(int number, boolean emptyFull) {
        System.out.print("*");
        for (int i = 1; i <= number - 2; i++){
            if (emptyFull){
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println("*");
    }

    private static void lowerPart(int number, boolean emptyFull) {
        for (int i = number / 2 - 1; i > 0; i--){
            for (int j = 1; j < number / 2 - i + 1; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = number - 3; j > number - 2 * (i + 1); j--){
                if (emptyFull){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
    }

    private static void upperPart(int number, boolean emptyFull) {
        for (int i = 2; i <= number / 2; i++){
            for (int j = 1; j < number / 2 - i + 2; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < 1 + 2 * (i - 2); j++){
               if (emptyFull){
                   System.out.print("*");
               }
               else {
                   System.out.print(" ");
               }
            }
            System.out.println("*");
        }
    }

    private static void star(int number) {
        for (int i = 1; i <= number / 2; i++){
            System.out.print(" ");
        }
        System.out.println("*");
    }
}
