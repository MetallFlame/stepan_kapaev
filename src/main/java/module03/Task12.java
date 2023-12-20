package module03;

public class Task12 {
    public static void main(String[] args) {
        int num = 745682;

        if ((num > 100000)&&(num < 1000000)){
            boolean lucky = luckyNum(num);
            System.out.println(lucky);
        }
    }

    private static boolean luckyNum(int num) {
        boolean lucky = false;
        int digit1 = num % 10;
        num = num / 10;
        int digit2 = num % 10;
        num = num / 10;
        int digit3 = num % 10;
        num = num / 10;
        int digit4 = num % 10;
        num = num / 10;
        int digit5 = num % 10;
        num = num / 10;
            if ((num + digit5 + digit4) == (digit1 + digit2 + digit3)){
                lucky = true;
        }
        return lucky;
    }
}
