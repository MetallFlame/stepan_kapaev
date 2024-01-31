package module5;

public class Task12 {
    public static void main(String[] args) {
        String name = ";-]";

        boolean real = isSmile(name);
        System.out.println(real);
    }

    private static boolean isSmile(String name) {
        boolean real = false;
        char[] name1 = name.toCharArray();
        if ((name1[0] == ':')|(name1[0] == ';')){
            if ((name1[name.length() - 1] == '(')|(name1[name.length() - 1] == ')')|(name1[name.length() - 1] == '[')|(name1[name.length() - 1] == ']')|(name1[name.length() - 1] == '{')|(name1[name.length() - 1] == '}')){
                int sum = 0;
                for (int i = 1; i < name1.length - 1; i++){
                    if ((name1[i] == '(')|(name1[i] == ')')|(name1[i] == '[')|(name1[i] == ']')|(name1[i] == '{')|(name1[i] == '}')|(name1[i] == '-')){
                       sum++;
                    }
                }
                real = sum == name1.length - 2;
            }
        }
        return real;
    }
}



