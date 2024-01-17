package module04;

public class module2Task2 {
    public static void main(String[] args) {
        int number = 5;
        boolean emptyFull = false;

        triagle(number, emptyFull);
    }

    private static void triagle(int number, boolean emptyFull) {
        line(number);
        body(number, emptyFull);
        star(number);
    }

    private static void body(int number, boolean emptyFull) {
        for (int i = 1; i < number - 1; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= number - 2 - i; j++){
                if (emptyFull) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }

//        for (int i = number; i > 1; i--){
//            for (int j = 1; j < number - i; j++){
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            for (int j = 1; j < i; j++){
//                System.out.print(" ");
//            }
//            System.out.println("*");
//        }
    }

    private static void line(int number) {
        for (int i = 1; i <= number; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    private static void star(int number) {
        for (int i = 1; i < number; i++){
            System.out.print(" ");
        }
        System.out.println("*");
    }
}

