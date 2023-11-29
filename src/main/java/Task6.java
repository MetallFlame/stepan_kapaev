public class Task6 {
    public static void main(String[] args) {
        int w = 10;
        int h = 17;

        square(w, h);
        perimetres(w, h);
    }

    private static void perimetres(int w, int h) {
        System.out.println("Периметр прямоугольника равен " + w * h);
    }

    private static void square(int w, int h) {
        System.out.println("Периметр прямоугольника равен " + (w + h) * 2);
    }
}
