public class Homework1 {
    public static void main(String[] args) {
        sort1();
    }
    private static void sort1() {
        for (int i = 9; i < 100; i++){
            if(i % 4 == 0){
                if(i % 6 > 0){
                    System.out.println(i);
                }
            }
        }
    }
}