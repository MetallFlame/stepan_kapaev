package module5;


public class Task10 {
    public static void main(String[] args) {
        String name = new String("texting");

        veryDifficultProgramm(name);
    }

    private static void veryDifficultProgramm(String name) {
        upperPart(name);
    }

    private static void upperPart(String name) {
        StringBuilder name1 = new StringBuilder(name);
        for (int i = 1; i <= name.length(); i++){
            for (int j = 0; j < name.length() - i; j++){
                System.out.print(" ");
            }
            System.out.println(name1.delete(0, name.length() - i));
        }
    }
}
