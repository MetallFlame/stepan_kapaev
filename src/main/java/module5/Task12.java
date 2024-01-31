package module5;

public class Task12 {
    public static void main(String[] args) {
        String name = ":---))";

        boolean real = isSmile(name);
        System.out.println(real);
    }

    private static boolean isSmile(String name) {
        boolean real = false;
        if ((name.charAt(name.length() - 1) == '(')|(name.charAt(name.length() - 1) == ')')|(name.charAt(name.length() - 1) == '{')|(name.charAt(name.length() - 1) == '}')|(name.charAt(name.length() - 1) == '[')|(name.charAt(name.length() - 1) == ']')) {
            if (name.charAt(name.length() - 1) == name.charAt(name.length() - 2)) {
                if ((name.charAt(0) == ';') | (name.charAt(0) == ':')) {
                    StringBuilder name1 = new StringBuilder(name);
                    name1.delete(name1.length() - 2, name1.length() - 1);
                    name1.deleteCharAt(0);
                    if (name1.isEmpty()){
                        real = true;
                    }
                    else {
                        String name2 = name1.toString();
                        char[] name3 = name2.toCharArray();
                        for (int i = 0; i < name3.length; i++){
                            if ((name3[i] == '-')|(name3[i] == '(')|(name3[i] == ')')|(name3[i] == '[')|(name3[i] == ']')|(name3[i] == '{')|(name3[i] == '}')){
                                real = true;
                            }
                        }
                    }
                }
            }
        }
        return real;
    }
}
