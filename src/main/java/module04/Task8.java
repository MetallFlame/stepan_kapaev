package module04;

public class Task8 {
    public static void main(String[] args) {
        int sum = simmetricalNumbers();
        System.out.println(sum);
    }

    private static int simmetricalNumbers() {
        int sum = 0;
        for (int i = 0; i < 2359; i++){
            int digit = i % 100;
            if (digit < 60){
                if (i == 0){
                    System.out.println("0000");
                    sum++;
                }
                if ((i < 1000)&&(i > 60)){
                    String name = new String("0" + Integer.toString(i));
                    if (isRevrse(name)){
                        System.out.println(name);
                        sum++;
                    }
                }
                if (i > 1000){
                    String name = new String(Integer.toString(i));
                    if (isRevrse(name)){
                        System.out.println(name);
                        sum++;
                    }
                }
            }
        }
        return sum;
    }

    private static boolean isRevrse(String name) {
        StringBuilder number1 = new StringBuilder(name);
        number1.reverse();
        String name1 = number1.toString();
        return name.equals(name1);
    }
}
