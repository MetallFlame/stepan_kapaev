public class Task7 {
    public static void main(String[] args) {
        int bankSum = 100000;
        int yearPercent = 10;
        int yearCount = 5;

        yearSum(bankSum, yearPercent, yearCount);
    }

    private static void yearSum(int bankSum, int yearPercent, int yearCount) {
        for (int i = 0; i < yearCount; i++){
            bankSum = bankSum + (bankSum * yearPercent / 100);
        }
        System.out.println(bankSum);
    }
}
