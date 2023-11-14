public class lesson2 {

        public static void main(String[] args) {
           int[] arr = new int[]{1, 2, 5, 6,};
           for(int i = 0; i < 2; i++){
               int x = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = x;

           }
            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }
        }
    }

