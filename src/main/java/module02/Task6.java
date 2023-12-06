package module02;

public class Task6 {
    public static void main(String[] args) {
        float w = 10;
        float h = 17;

        square(w, h);
        perimetres(w, h);
    }

    private static void perimetres(float w, float h) {
        System.out.println("Периметр прямоугольника равен " + w * h);
    }

    private static void square(float w, float h) {
        System.out.println("Периметр прямоугольника равен " + (w + h) * 2);
    }
}
