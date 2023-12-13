package module03;

public class Task8 {
    public static void main(String[] args) {
        int x = 6;
        int y = 4;

        checkNmbers(x, y);
    }

    private static void checkNmbers(int x, int y) {
        if (((x % 2 > 0)&&(y % 2 > 0))|((x % 2 == 0)&&(y % 2 == 0))){
            System.out.println("YES");
        }
    }
}
