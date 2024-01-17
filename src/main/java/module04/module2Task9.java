package module04;

public class module2Task9 {
    public static void main(String[] args) {
        int number = 8;
        int startHigh = 5;

        spruce(number, startHigh);
    }

    private static void spruce(int number, int startHigh) {
        for (int i = 0; i < number; i++){
//            star(number, startHigh);
            body(i, startHigh, number);
        }
    }

    private static void body(int num, int startHigh, int number) {
        for (int i = 2; i <= startHigh + num + 1; i++){
            for (int j = 1; j <= (startHigh  + number) - i; j++){
                System.out.print(" ");
            }
//            System.out.print("*");
//            for (int j = 1; j < (1 + 2 * (i - 2)) * 2; j += 2){
                for (int j = 1; j < ( 2 * (i - 2)) * 2; j += 2){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

//    private static void star(int number, int startHigh) {
//        for (int i = 0; i <= startHigh - 3 + number; i++){
//            System.out.print(" ");
//        }
//        System.out.println("*");
//    }
}
