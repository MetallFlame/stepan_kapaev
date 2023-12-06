package module03;

public class Task5 {
    public static void main(String[] args) {
        int year = 2011;
        int month = 3;
        int date = 30;

        System.out.println(2023 % 12);

        if ((year >= 1930)&&(month > 0)&&(month <= 12)&&(date > 0)&&(date <= 31)){
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
        if ((year - 1920) % 12 == 0){
            System.out.println("Ваш год: год обезьяны");

        }
        if ((year - 1921) % 12 == 0){
            System.out.println("Ваш год: год петуха");

        }
        if ((year - 1922) % 12 == 0){
            System.out.println("Ваш год: год собаки");

        }
        if ((year - 1923) % 12 == 0){
            System.out.println("Ваш год: год свиньи");

        }
        if ((year - 1924) % 12 == 0){
            System.out.println("Ваш год: год крысы");

        }
        if ((year - 1925) % 12 == 0){
            System.out.println("Ваш год: год быка");

        }
        if ((year - 1926) % 12 == 0){
            System.out.println("Ваш год: год тигра");

        }
        if ((year - 1927) % 12 == 0){
            System.out.println("Ваш год: год кота");

        }
        if ((year - 1928) % 12 == 0){
            System.out.println("Ваш год: год дракон");
        }
        if ((year - 1929) % 12 == 0){
            System.out.println("Ваш год: год змеи");

        }
        if ((year - 1930) % 12 == 0){
            System.out.println("Ваш год: год лошади");

        }
        else {
            System.out.println("Ваш год: год овцы");
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
        else {
            System.out.println("Ваш знак зодиака:рыбы");
        }
    }
}

