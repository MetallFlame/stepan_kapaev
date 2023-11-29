public class Task9 {
    public static void main(String[] args) {
        float number = 4.6F;

        boolean integer = isInteger(number);
        System.out.println(integer);
    }

    private static boolean isInteger(float number) {
        int digit = (int) ((number * 10) % 10);
        switch (digit){
            case 0:
                boolean integer1 = true;
                return (integer1);
            default:
                boolean integer2 = false;
                return (integer2);
        }
    }
}

