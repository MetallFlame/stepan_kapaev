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
                    real = true;
                }
            }
        }
        return real;
    }
}
