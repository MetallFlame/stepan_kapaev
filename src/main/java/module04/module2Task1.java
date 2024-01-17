package module04;

public class module2Task1 {
    public static void main(String[] args) {
        int number = 4;
        boolean emptyFull = false;

        triagleDrawing(number, emptyFull);
    }

    private static void triagleDrawing(int number, boolean emptyFull) {
        for (int i = 1; i < number; i++){
            if (i == 1){
                for (int j = 1; j < number; j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            if (i == number - 1){
                for (int j = 1; j <= number; j++){
                    System.out.print("*");
                }
            }
            else {
                for (int j = 1; j < number - i; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 1; j < i; j++){
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
    }
}
