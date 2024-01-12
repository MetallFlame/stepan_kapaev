package module04;


public class module2Task3 {
    public static void main(String[] args) {
        int number = 25;
        boolean emptyFull = false;

        isoscelesTriagle(number, emptyFull);
    }

    private static void isoscelesTriagle(int number, boolean emptyFull) {
        star(number);
        body(number, emptyFull);
        line(number);
    }

    private static void body(int number, boolean emptyFull) {
        for (int i = 2; i <= number; i++) {
            for (int j = 1; j < number - i + 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < (1 + 2 * (i - 2)); j++){
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

    private static void line(int number) {
        for (int i = 0; i <= number * 2; i++){
            System.out.print("*");
        }
    }

    private static void star(int number) {
        for (int i = 1; i <= number; i++){
            System.out.print(" ");
        }
        System.out.println("*");
    }
}
