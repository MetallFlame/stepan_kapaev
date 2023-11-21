public class Homework2 {
    public static void main(String[] args) {
        int number = 2;
        finger(number);
    }

    private static void finger(int number) {
        if (number == 1){
            System.out.println("Мизинец");
        }
        if (number == 2){
            System.out.println("Безымянный палец");
        }
        if (number == 3){
            System.out.println("Средний палец");
        }
        if (number == 4){
            System.out.println("Указательный палец");
        }
        if (number == 5){
            System.out.println("Большой палец");
        }
        else{
            System.out.println("Ваш номер некорректен");
        }
    }
}