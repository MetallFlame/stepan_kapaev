package module04;

import java.util.Scanner;

public class keyboadInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number");
        int number = keyboard.nextInt();
        System.out.println(number);
    }
}
