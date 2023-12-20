package module03;

public class Task10 {
    public static void main(String[] args) {
        int floorCount = 20;
        int flatCount = 5;
        int flatNumber = 234;

        if (flatNumber > 0) {
            entranceNumber(floorCount, flatCount, flatNumber);
        }
    }

    private static void entranceNumber(int floorCount, int flatCount, int flatNumber) {
        int entrance = flatNumber / (floorCount * flatCount) + 1;
        System.out.println("Подъезд номер " + entrance);
    }
}
