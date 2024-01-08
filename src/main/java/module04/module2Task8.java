package module04;

public class module2Task8 {
    public static void main(String[] args) {
        int number = 123456;

        int[] arr = countsSum(number);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }

    private static int[] countsSum(int number) {
        int digit = 0;
        int sum = 0;
        while (number > 0){
            digit += number % 10;
            number = number / 10;
            sum++;
        }
        int[] arr = new int[]{digit, sum};
        return arr;
    }
}
