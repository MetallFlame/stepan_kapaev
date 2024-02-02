package module5;

public class Task2 {
    public static void main(String[] args) {
        int number = 0;
        int n = 10;
        char name = counts(number, n);
        System.out.println(name);
    }

    private static char counts(int num, int n) {
        StringBuilder name = new StringBuilder();
        for (int i = num; name.length() <= 1000; i++){
            name.append(i);
        }
        String name1 = name.toString();
        char[] name2 = name1.toCharArray();
        System.out.println(name);
        return name2[n - 1];
    }
}
