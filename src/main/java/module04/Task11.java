package module04;

public class Task11 {
    public static void main(String[] args) {
        int min = 0;
        int max = 1000;

        fizzBuzzHiss(min, max);
    }

    private static void fizzBuzzHiss(int min, int max) {
        for (int i = min; i < max; i++){
            if ((i % 3 != 0)&&(i % 5 != 0)){
                System.out.println(i);
            }
            if (i % 15 == 0){
                System.out.println("hiss");
            }
            if (i % 5 == 0){
                System.out.println("buzz");
            }
            else {
                System.out.println("fizz");
            }
        }
    }
}
