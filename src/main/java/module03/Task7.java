package module03;

public class Task7 {
    public static void main(String[] args) {
        char letter = '8';

        symbolType(letter);
    }

    private static void symbolType(char letter) {
        if (((letter >= 'a')&&(letter <= 'z'))|((letter >= 'A')&&(letter <= 'Z'))){
            System.out.println("Символ из латиницы");
            return;
        }
        if (((letter >= 'а')&&(letter <= 'я'))|((letter >= 'А')&&(letter <= 'Я'))){
            System.out.println("Символ из кирилицы");
            return;
        }
        if ((letter >= '0')&&(letter <= '9')){
            System.out.println("Символ это число");
        }
        else {
            System.out.println("Символ не распознан");
        }
    }
}
