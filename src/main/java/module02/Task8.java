package module02;

public class Task8 {
    public static void main(String[] args) {
        float secondCount = 5;

        float distance = distanceLighting(secondCount);
        System.out.println(distance + " метров");
    }

    private static float distanceLighting(float secondCount) {
        int soundSpeed = 343;

        float distanceLighting = soundSpeed * secondCount;
        return (distanceLighting);
    }
}
