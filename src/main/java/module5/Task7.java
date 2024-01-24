package module5;

public class Task7 {
    public static void main(String[] args) {
        String name = "pfon  6k5j  n&^$";
        String name1 = differens(name);
        System.out.println(name1);
    }

    private static String differens(String name) {
        char[] nameC = name.toCharArray();
        for (int i = 0; i < nameC.length; i++){
            if (Character.isDigit(nameC[i])){
                nameC[i] = '-';
            }
            if (nameC[i] == Character.toLowerCase(nameC[i])){
                nameC[i] = Character.toUpperCase(nameC[i]);
            } else
            if (nameC[i] == Character.toUpperCase(nameC[i])){
                nameC[i] = Character.toLowerCase(nameC[i]);
            }
        }
        return (String.valueOf(nameC));
    }
}
