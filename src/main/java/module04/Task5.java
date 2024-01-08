package module04;

public class Task5 {
    public static void main(String[] args) {
        int number = 73693;

        isReversive(number);
    }

    public static boolean isReversive(int number) {
        String number1 = Integer.toString(number);
        StringBuilder name = new StringBuilder(Integer.toString(number));
        name.reverse();
        String name1 = name.toString();
        return  (name1.equals(number1));
    }
}

