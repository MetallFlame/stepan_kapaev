package module02;

public class Task12 {
    public static void main(String[] args) {
        int studentsCount = 500;
        int percent = 30;

        int[] arr = foodQuanity(studentsCount, percent);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }

    private static int[] foodQuanity(int studentsCount, int percent) {
        int less30kg = studentsCount * percent / 100;
        int pieCount1 = studentsCount - less30kg;
        int pieCount = less30kg * 2 + pieCount1;
        int milkCount = less30kg;
        int[] arr = new int[]{pieCount, milkCount};
        return (arr);
    }
}
