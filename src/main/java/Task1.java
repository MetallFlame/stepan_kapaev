public class Task1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        divide(x, y);
        divideDigit(x, y);
        xInSquare(x);
    }

    private static void xInSquare(int x) {
        System.out.println(x * x);
    }

    private static void divideDigit(int x, int y) {
        System.out.println(x % y);
    }

    private static void divide(int x, int y) {
        System.out.println(x / y);
    }
}
