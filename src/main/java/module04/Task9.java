package module04;

public class Task9 {
    public static void main(String[] args) {
        int min = 0;
        int max = 1000;
        int[] arr = new int[]{3, 5};
        int sum = numbersSum(min, max, arr);
        System.out.println(sum);
    }

    private static int numbersSum(int min, int max, int[] arr) {
        int sum = 0;
        for (int i = min; i <= max; i++){
            for (int j = 0; j < arr.length; j++){
                if (i % arr[j] == 0){
                    sum +=  i;
                }
            }
        }
        return sum;
    }
}
