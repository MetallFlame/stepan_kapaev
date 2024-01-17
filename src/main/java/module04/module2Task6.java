package module04;

public class module2Task6 {
    public static void main(String[] args) {
        int floorCount = 5;

        drawingProgramm(floorCount);
    }

    private static void drawingProgramm(int floorCount) {
        for (int i = 1; i < floorCount; i++){
            if (i == 1) {
                System.out.println("***");
                System.out.println();
                System.out.println("  *");
            }
            else {
                System.out.println();
                for (int j = 1; j < i; j++){
                    System.out.print("  ");
                }
                System.out.println("***");
                System.out.println();
                for (int j = 1; j < i; j++){
                    System.out.print("  ");
                }
                System.out.println("  *");
            }
        }
    }
}
