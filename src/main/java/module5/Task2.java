package module5;

public class Task2 {
    public static void main(String[] args) {
        int number = 100;

        String name = counts(number);
        System.out.println(name);
    }

    private static String counts(int num) {
        StringBuilder name = new StringBuilder();
        for (int i = num; name.length() <= 1000; i++){
            name.append(i);
        }
        return name.toString();
    }
}
