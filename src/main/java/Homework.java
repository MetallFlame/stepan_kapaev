public class Homework {
    public static void main(String[] args) {
        String name1 = "Stepa Kap";
        char[] arr1 = name1.toCharArray();
        sort(arr1);
        print(arr1);
       }
    private static void print(char[] arr1) {
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
    private static void sort(char[] arr1) {
        for (int i = 0; i < arr1.length / 2; i++){
            char x = arr1[i];
            arr1[i] = arr1[arr1.length - i -1];
            arr1[arr1.length - i - 1] = x;
        }
    }
}

