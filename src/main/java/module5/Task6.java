package module5;

public class Task6 {
    public static void main(String[] args) {
        int count = luckyNumber();

        System.out.println(count);
    }
    private static int luckyNumber() {
        String[] numbers = new String[99999];
        int sum = 0;
        for (int i = 0; i < 99999; i++){
            if (i < 10){
                numbers[i] = "0000" + i;
            }
            if ((i < 100)&&(i > 9)){
                numbers[i] = "000" + i;
            }
            if ((i < 1000)&&(i > 99)){
                numbers[i] = "00" + i;
            }
            if ((i < 10000)&&(i > 999)){
                numbers[i] = "0" + i;
            }
            else {
                numbers[i] = Integer.toString(i);
            }
            boolean okNo = isRight(numbers[i]);
            if (okNo){
                sum++;
            }
        }
        return sum;
    }
    private static boolean isRight(String number){
        number = number + "0";
        String[] something = number.split("4|//13");
        return something.length > 1;
    }
}
