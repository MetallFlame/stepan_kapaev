package module5;

public class Task3 {
    public static void main(String[] args) {
        String name = "Stepa wertwe ertqwer t ertertgert";

        float lenth = middleLenth(name);
        System.out.println(lenth);
    }

    private static float middleLenth(String name) {
        char[] name1 = name.toCharArray();
        int count = 0;
        for (int i = 0; i < name1.length; i++){
            if (name1[i] == ' '){
                count++;
            }
        }
        float lenth = ((float)(name1.length - count)) / (count + 1);
        return lenth;
    }
}
