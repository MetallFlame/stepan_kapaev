public class Homework2 {
    public static void main(String[] args) {
        int number = 7;
        finger(number);
    }

    private static void finger(int number) {
        if (number < 1){
            System.out.println("Ваше число некорректно.Введите число от одного до пяти");
            return;
        }
        if (number > 5){
            System.out.println("Ваше число некорректно.Введите число от одного до пяти");
            return;
        }
        if (number == 1){
            System.out.println("Мизинец");
            return;
        }
        if (number == 2){
            System.out.println("Безымянный палец");
            return;
        }
        if (number == 3){
            System.out.println("Средний палец");
            return;
        }
        if (number == 4){
            System.out.println("Указательный палец");
            return;
        }
        if (number == 5) {
            System.out.println("Большой палец");
        }
    }
}