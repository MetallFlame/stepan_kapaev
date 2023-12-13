package module03;

public class Task5 {
    public static void main(String[] args) {
        int year = 1993;
        int month = 6;
        int date = 21;

        if ((year > 0)&&(month > 0)&&(month <= 12)&&(date > 0)&&(date <= 31)){
            switch (month){
                case 2:
                    if (year % 4 == 0){
                        if (date <= 29){
                            chinaYearAndZodiac(year, month, date);
                        }
                    }
                    else {
                        if (date <= 28){
                            chinaYearAndZodiac(year, month, date);
                        }
                        else {
                            System.out.println("Дата некорректна");
                        }
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (date <= 30){
                        chinaYearAndZodiac(year, month, date);
                    }
                    else {
                        System.out.println("Дата некорректна");
                    }
                    break;
                default:
                    chinaYearAndZodiac(year, month, date);
                   break;
            }
        }
    }

    private static void chinaYearAndZodiac(int year, int month, int date) {
        int count = year % 12;
        switch (count) {
            case 0:
                System.out.println("Ваш год: год обезьяны");
            break;
            case 1:
                System.out.println("Ваш год: год петуха");
                break;
            case 2:
                System.out.println("Ваш год: год собаки");
                break;
            case 3:
                System.out.println("Ваш год: год свиньи");
                break;
            case 4:
                System.out.println("Ваш год: год крысы");
                break;
            case 5:
                System.out.println("Ваш год: год быка");
                break;
            case 6:
                System.out.println("Ваш год: год тигра");
                break;
            case 7:
                System.out.println("Ваш год: год кота");
                break;
            case 8:
                System.out.println("Ваш год: год дракона");
                break;
            case 9:
                System.out.println("Ваш год: год змеи");
                break;
            case 10:
                System.out.println("Ваш год: год лошади");
                break;
            case 11:
                System.out.println("Ваш год: год овцы");
                break;
        }
        if (((date > 20)&&(month == 3))|((date <= 20)&&(month == 4))){
            System.out.println("Ваш знак зодиака:овен");
        }
        if (((date > 20)&&(month == 4))|((date <= 21)&&(month == 5))){
            System.out.println("Ваш знак зодиака:телец");
        }
        if (((date > 21)&&(month == 5))|((date <= 21)&&(month == 6))){
            System.out.println("Ваш знак зодиака:близнецы");
        }
        if (((date > 21)&&(month == 6))|((date <= 22)&&(month == 7))){
            System.out.println("Ваш знак зодиака:рак");
        }
        if (((date > 22)&&(month == 7))|((date <= 23)&&(month == 8))){
            System.out.println("Ваш знак зодиака:лев");
        }
        if (((date > 23)&&(month == 8))|((date <= 23)&&(month == 9))){
            System.out.println("Ваш знак зодиака:дева");
        }
        if (((date > 23)&&(month == 9))|((date <= 23)&&(month == 10))){
            System.out.println("Ваш знак зодиака:весы");
        }
        if (((date > 23)&&(month == 10))|((date <= 22)&&(month == 11))){
            System.out.println("Ваш знак зодиака:скорпион");
        }
        if (((date > 23)&&(month == 11))|((date <= 22)&&(month == 12))){
            System.out.println("Ваш знак зодиака:стрелец");
        }
        if (((date > 22)&&(month == 12))|((date <= 20)&&(month == 1))){
            System.out.println("Ваш знак зодиака:козерог");
        }
        if (((date > 20)&&(month == 1))|((date <= 19)&&(month == 2))){
            System.out.println("Ваш знак зодиака:водолей");
        }
        if (((date > 19)&&(month == 2))|((date <= 20)&&(month == 3))){
            System.out.println("Ваш знак зодиака:рыбы");
        }
    }
}

