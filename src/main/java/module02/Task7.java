package module02;

public class Task7 {
    public static void main(String[] args) {
        float bankSum = 50000.0F;
        float yearPercent = 5.9F;
        int yearCount = 10;

        float newBankSum = yearSum(bankSum, yearPercent, yearCount);
        System.out.println("Ваш банковский счёт спустя " + yearCount + " лет" + " - " + newBankSum + "$");
    }

    private static float yearSum (float bankSum, float yearPercent, int yearCount) {
        for (int i = 0; i < yearCount; i++){
            bankSum = bankSum + (bankSum * yearPercent / 100);
        }
        return (bankSum);
    }
}
