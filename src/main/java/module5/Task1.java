package module5;

public class Task1 {
    public static void main(String[] args) {
        String name = new String("fallcon");
        char symbol = 'l';

        int count = sameSymbols(name, symbol);
        System.out.println(count);
    }

    private static int sameSymbols(String name, char symbol) {
        char[] name1 = name.toCharArray();
        int count = 0;
        for (int i = 0; i < name1.length; i++){
            if (symbol == name1[i]){
                count++;
                System.out.println(i + 1);
            }
        }
        if (count == 0){
            System.out.println("Совпадений нет!");
        }
        return count;
    }
}
