package module04;

public class Task5 {
    public static void main(String[] args) {
        int number = 765567;

        isReversive(number);
    }

    private static void isReversive(int number) {
        String number1 = Integer.toString(number);
        StringBuilder name = new StringBuilder(Integer.toString(number));
        name.reverse();
        String name1 = name.toString();
        if (name1.equals(number1)){
            System.out.println("it's true");
        }
        else {
            System.out.println("It's false");
        }
    }

}

