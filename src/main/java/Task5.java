public class Task5 {
    public static void main(String[] args) {
        float radius = 15;

        float perimetr = perimetr(radius);
        System.out.println(perimetr);
        float square = square(radius);
        System.out.println(square);
    }

    private static float square(float radius) {
        float pCount = 3.14F;

        float square = radius * radius * pCount;
        return (square);
    }

    private static float perimetr(float radius) {
        float pCount = 3.14F;

        float perimetr = radius * 2 * pCount;
        return (perimetr);
    }
}
