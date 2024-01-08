package module04;

public class Task10 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 9, 8, 7, 6};

        int number = minNumber(arr);
        System.out.println(number);
    }

    private static int minNumber(int[] arr) {
        boolean isRight = false;
        int i = 0;

        while (!isRight){
            isRight = true;
            i++;
        for (int j = 0; j < arr.length; j++){
                if (i % arr[j] != 0){
                    isRight = false;
                }
            }
            if (isRight){
                return i;
            }
        }
        return 0;
    }
}
