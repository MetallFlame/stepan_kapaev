public class Task5 {
    public static void main(String[] args) {
        int radius = 15;

        perimetr(radius);
        System.out.println(perimetr);
        square(radius);
        System.out.println(square);
    }

    private static float square(int radius) {
        float pCount = 3.14F;

        float square = radius * radius * pCount;
        return (square);
    }

    private static float perimetr(int radius) {
        float pCount = 3.14F;

        float perimetr = radius * 2 * pCount;
        return (perimetr);
    }
}
