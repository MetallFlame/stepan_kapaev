package module6Task5;

public class Main {
    static int soilderHealth = 20;
    static int soilderDamage = 20;
    static int dragonHealth = 4000;
    static int dragonDamage = 200;
    public static void main(String[] args) {
        int healthNow = 0;
        int soilderCount = 1;

        while (healthNow < dragonHealth){
            healthNow = soilderCount * soilderDamage;
            soilderCount = soilderCount + dragonDamage / soilderHealth;
        }
        boolean isVictory = battleSimulation(soilderCount);
        while (battleSimulation(soilderCount)){
            soilderCount--;
        }
        System.out.println(++soilderCount);
    }

    private static boolean battleSimulation(int soilderCount) {
        int testingHealth = dragonHealth;
        while ((testingHealth > 0)&&(soilderCount > 0)){
            testingHealth = testingHealth - soilderCount * soilderDamage;
            soilderCount = soilderCount - dragonDamage / soilderHealth;
        }
        if (testingHealth < 1){
            return true;
        }
        else{
            return false;
        }
    }
}
