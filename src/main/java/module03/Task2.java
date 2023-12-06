package module03;

public class Task2 {
    public static void main(String[] args) {
        int o_clock = 8;

        if ((o_clock >= 0) && (o_clock <= 24)) {
            hello(o_clock);
        }
    }

    private static void hello(int oClock) {
        if ((oClock >= 7) && (oClock <= 12)) {
            System.out.println("Доброе утро!");
            return;
        }
        if ((oClock >= 13) && (oClock <= 18)) {
            System.out.println("Добрый день!");
            return;
        }
        if ((oClock >= 19) && (oClock <=24)) {
            System.out.println("Добрый вечер!");
        }
        else {
            System.out.println("Доброй ночи!");
        }
    }
}