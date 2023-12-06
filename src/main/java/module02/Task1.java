package module02;

public class Task1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        int xyDivde = divide(x, y);
        System.out.println(xyDivde);
        int xyDigit = divideDigit(x, y);
        System.out.println(xyDigit);
        int newX = xInSquare(x);
        System.out.println(newX);
    }

    private static int xInSquare(int x) {
        int newX = x * x;
        return (newX);
    }

    private static int divideDigit(int x, int y) {
        int xyDigit = x % y;
        return (xyDigit);
    }

    private static int divide(int x, int y) {
        int xyDivide = x / y;
        return (xyDivide);
    }
}
