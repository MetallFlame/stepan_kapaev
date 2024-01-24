package module5;

public class Task8 {
    public static void main(String[] args) {
        String name = "sjfhfggf_kdhgkjwvf_klhjhn";

        String name1 = javaCPP(name);
        System.out.println(name1);
    }

    private static String javaCPP(String name) {
        String name1;
        String[] nameName = name.split("_");

        if (nameName.length > 1){
                name1 = toJava(name);
        }
        else{
            name1 = toCPP(name);
        }
        return name1;
    }

    private static String toCPP(String name) {
        StringBuilder name1 = new StringBuilder();
        char[] massive = name.toCharArray();

        for (int i = 0; i < massive.length; i++){
            if (massive[i] == Character.toUpperCase(massive[i])){
                name1.append('_');
                name1.append(Character.toLowerCase(massive[i]));
            }
            else {
                name1.append(massive[i]);
            }
        }
        return name1.toString();
    }

    private static String toJava(String name) {
        StringBuilder name1 = new StringBuilder();
        char[] massive = name.toCharArray();
        for (int i = 0; i < massive.length; i++){
            char symbol;
            if (massive[i] == ' '){
                symbol = massive[i + 1];
                name1.append(symbol);
                i++;
            }
            else {
                symbol = massive[i];
                name1.append(symbol);
            }
        }
        return name1.toString();
    }
}
