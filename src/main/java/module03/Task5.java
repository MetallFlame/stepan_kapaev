public class Modul3Task5 {
    public static void main(String[] args) {
        int year = 2011;
        int month = 3;
        int date = 30;

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
            return;
        }
        if ((year - 1921) % 12 == 0){
            System.out.println("Ваш год: год петуха");
            return;
        }
        if ((year - 1922) % 12 == 0){
            System.out.println("Ваш год: год собаки");
            return;
        }
        if ((year - 1923) % 12 == 0){
            System.out.println("Ваш год: год свиньи");
            return;
        }
        if ((year - 1924) % 12 == 0){
            System.out.println("Ваш год: год крысы");
            return;
        }
        if ((year - 1925) % 12 == 0){
            System.out.println("Ваш год: год быка");
            return;
        }
        if ((year - 1926) % 12 == 0){
            System.out.println("Ваш год: год тигра");
            return;
        }
        if ((year - 1927) % 12 == 0){
            System.out.println("Ваш год: год кота");
            return;
        }
        if ((year - 1928) % 12 == 0){
            System.out.println("Ваш год: год дракон");
            return;
        }
        if ((year - 1929) % 12 == 0){
            System.out.println("Ваш год: год змеи");
            return;
        }
        if ((year - 1930) % 12 == 0){
            System.out.println("Ваш год: год лошади");
            return;
        }
        else {
            System.out.println("Ваш год: год овцы");
        }
        if (((date > 20)&&(month == 3))|((date <= 20)&&(month == 4))){
            System.out.println("Ваш знак зодиака:овен");
            return;
        }
        if (((date > 20)&&(month == 4))|((date <= 21)&&(month == 5))){
            System.out.println("Ваш знак зодиака:телец");
            return;
        }
        if (((date > 21)&&(month == 5))|((date <= 21)&&(month == 6))){
            System.out.println("Ваш знак зодиака:близнецы");
            return;
        }
        if (((date > 21)&&(month == 6))|((date <= 22)&&(month == 7))){
            System.out.println("Ваш знак зодиака:рак");
            return;
        }
        if (((date > 22)&&(month == 7))|((date <= 23)&&(month == 8))){
            System.out.println("Ваш знак зодиака:лев");
            return;
        }
        if (((date > 23)&&(month == 8))|((date <= 23)&&(month == 9))){
            System.out.println("Ваш знак зодиака:дева");
            return;
        }
        if (((date > 23)&&(month == 9))|((date <= 23)&&(month == 10))){
            System.out.println("Ваш знак зодиака:весы");
            return;
        }
        if (((date > 23)&&(month == 10))|((date <= 22)&&(month == 11))){
            System.out.println("Ваш знак зодиака:скорпион");
            return;
        }
        if (((date > 23)&&(month == 11))|((date <= 22)&&(month == 12))){
            System.out.println("Ваш знак зодиака:стрелец");
            return;
        }
        if (((date > 22)&&(month == 12))|((date <= 20)&&(month == 1))){
            System.out.println("Ваш знак зодиака:козерог");
            return;
        }
        if (((date > 20)&&(month == 1))|((date <= 19)&&(month == 2))){
            System.out.println("Ваш знак зодиака:водолей");
        }
        else {
            System.out.println("Ваш знак зодиака:рыбы");
        }
    }
}

