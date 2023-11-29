public class Task8 {
    public static void main(String[] args) {
        int secondCount = 5;

        int distance = distanceLighting(secondCount);
        System.out.println(distance + " метров");
    }

    private static int distanceLighting(int secondCount) {
        int soundSpeed = 343;

        int distanceLighting = soundSpeed * secondCount;
        return (distanceLighting);
    }
}
