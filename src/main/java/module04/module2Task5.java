package module04;

public class module2Task5 {
    public static void main(String[] args) {
        int number = 10;
        boolean emptyFull = true;

        paralelogramm(number, emptyFull);
    }

    private static void paralelogramm(int number, boolean emptyFull) {
        line1(number);
        body(number, emptyFull);
        line2(number);
    }

    private static void body(int number, boolean EF){
        for (int i = 0; i < number; i++){
            for (int j = 0; j < number - i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < 24; j++){
                if (EF){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
    }

    private static void line2(int number) {
        for (int i = 0; i < 26; i++){
            System.out.print("*");
        }
    }

    private static void line1(int number) {
        for (int i = 1; i <= number + 1; i++){
            System.out.print(" ");
        }
        for (int i = 0; i < 26; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
