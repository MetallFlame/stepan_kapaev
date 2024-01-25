package module5;


public class Task10 {
    public static void main(String[] args) {
        String name = new String("perpetuum");

        veryDifficultProgramm(name);
    }

    private static void veryDifficultProgramm(String name) {
        upperPart(name);
        lowerPart(name);
    }

    private static void lowerPart(String name) {
        for (int i = 1; i < name.length(); i++){
            StringBuilder name1 = new StringBuilder(name);
            System.out.println(name1.delete(name.length() - i, name.length()));
        }
    }

    private static void upperPart(String name) {
        for (int i = 1; i <= name.length(); i++){
            for (int j = 0; j < name.length() - i; j++){
                System.out.print(" ");
            }
            StringBuilder name1 = new StringBuilder(name);
            System.out.println(name1.delete(0, name1.length() - i));
        }
    }
}
