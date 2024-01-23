package module5;

import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите набор слов, разделённых пробелом или двоеточием");
        String name = keyboard.next();

        int count = wordCount(name);
        System.out.println(count);
    }

    private static int wordCount(String name) {
        String[] wordsArray = name.split("_|\\:");
        int sum = 0;
        for (int i = 0; i < wordsArray.length; i++){
            if (wordsArray[i].length() % 2 == 0){
                sum++;
            }
        }
        return sum;
    }
}
