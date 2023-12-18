package module03;

public class Task9 {
    public static void main(String[] args) {
        int xCoordinates1 = 3;
        int yCoordinates1 = 10;
        int xCoordinates2 = 15;
        int yCoordinates2 = 30;

        movingTraectory(xCoordinates1, xCoordinates2, yCoordinates1, yCoordinates2);
    }

    private static void movingTraectory(int xCoordinates1, int xCoordinates2, int yCoordinates1, int yCoordinates2) {
        boolean upDown;
        boolean horVer;
        boolean usual = false;
        boolean ground = false;
        if (yCoordinates1 == yCoordinates2){
            ground = true;
        }
        if (yCoordinates1 > yCoordinates2){
            upDown = false;
        }
        else {
            upDown = true;
        }
        if ((xCoordinates1 > xCoordinates2)&&(yCoordinates1 == yCoordinates2)) {
            horVer = true;
        }
        else {
            horVer = false;
        }
        if ((xCoordinates1 != xCoordinates2)&&(yCoordinates1 != yCoordinates2)){
            usual = true;
        }
        if (ground == true){
            System.out.println("Ровная дорога");
        }
        if ((upDown == false)&&(usual == true)){
            System.out.println("спуск");
        }
        if ((upDown == true)&&(usual == true)){
            System.out.println("подъём");
        }
        if ((upDown == true)&&(horVer == false)&&(usual == false)){
            System.out.println("Отвесный подъём");
        }
        if ((upDown == false)&&(horVer == false)&&(usual == false)&&(ground == false)){
            System.out.println("Отвесный спуск");
        }
    }
}
