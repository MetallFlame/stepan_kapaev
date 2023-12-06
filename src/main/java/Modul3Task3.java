public class Modul3Task3 {
    public static void main(String[] args) {
        int animalNumber = 5;

        if ((animalNumber > 0)&&(animalNumber <= 10)){
            animalSound(animalNumber);
        }
    }

    private static void animalSound(int animalNumber) {
        switch (animalNumber){
            case 1:
                System.out.println("Животное:собака; Звуки:гау-гау");
                break;
            case 2:
                System.out.println("Животное:кот; Звуки: мяу-мяу");
                break;
            case 3:
                System.out.println("Животное:корова; Звуки:мууу-муу");
                break;
            case 4:
                System.out.println("Животное:овца; Звуки:беее");
                break;
            case 5:
                System.out.println("Животное:лягушка; Звуки:ква-ква");
                break;
            case 6:
                System.out.println("Животное:тигр; Звуки:рррррр");
                break;
            case 7:
                System.out.println("Животное:ворона; Звуки:кар-кар");
                break;
            case 8:
                System.out.println("Животное:кукушка; Звуки:куку-куку");
                break;
            case 9:
                System.out.println("Животное:попугай; Звуки:Покорми меня!");
                break;
            case 10:
                System.out.println("Животное:коза; Звуки:бееее");
                break;
        }
    }
}
