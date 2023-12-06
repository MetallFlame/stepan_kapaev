package module02;

public class Task10 {
    public static void main(String[] args) {
        int height = 175;
        int weight = 80;

        idealWeight(height, weight);
    }

    private static void idealWeight(int height, int weight) {
        int idealWeight = height - 110;
        if (weight == idealWeight){
            System.out.println("Ваш вес идеальный");
            return;
        }
        if (idealWeight > weight){
            System.out.println("Ваш идеальный вес - " + idealWeight + " кг" + ".Вам нужно набрать " + (idealWeight - weight) + " кг");
        }
        else{
            System.out.println("Ваш идеальный вес - " + idealWeight + " кг" + ".Вам нужно сбросить " + (weight - idealWeight) + " кг");
        }
    }
}