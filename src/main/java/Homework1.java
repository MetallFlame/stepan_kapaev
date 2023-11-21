public class Homework1 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 16, 24, 50, 40};
        sort1(arr);
    }
    private static void sort1(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 4 == 0){
                if(arr[i] % 6 > 0){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}