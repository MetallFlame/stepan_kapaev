public class Homework2 {
    public static void main(String[] args) {
        int number = 4;
        fingerNumber(number);
    }

    private static void fingerNumber(int number) {
        switch (number){
            case 1:
                System.out.println("Мизинец");
                break;
            case 2:
                System.out.println("Безымянный палец");
                break;
            case 3:
                System.out.println("Средний палец");
                break;
            case 4:
                System.out.println("Указательный палец");
                break;
            case 5:
                System.out.println("Большой палец");
                break;
            default:
                System.out.println("Ваше число некорректно.Введите число от одного до пяти");
        }
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