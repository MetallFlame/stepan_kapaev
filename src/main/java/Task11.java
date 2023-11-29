public class Task11 {
    public static void main(String[] args) {
        int seconds = 5000;

        dayConventer(seconds);
    }

    private static void dayConventer(int seconds) {
        int minutes = seconds / 60;
        seconds = seconds % 60;
        int hours = minutes / 60;
        minutes = minutes % 60;
        int days = hours / 24;
        hours = hours % 24;
        System.out.println("До Нового года осталось:" + days + "дн., " + hours + "ч., " + minutes + "мин.," + seconds + "сек.");
    }
}