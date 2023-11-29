public class Task7 {
    public static void main(String[] args) {
        int bankSum = 100000;
        int yearPercent = 10;
        int yearCount = 5;

        float newBankSum = yearSum(bankSum, yearPercent, yearCount);
        System.out.println(newBankSum);
    }

    private static float yearSum(int bankSum, int yearPercent, int yearCount) {
        float newBankSum = bankSum;
        for (int i = 0; i < yearCount; i++){
            newBankSum = newBankSum + (newBankSum * yearPercent / 100);
        }
        return (newBankSum);
    }
}
