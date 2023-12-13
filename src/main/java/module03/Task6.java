package module03;

public class Task6 {
    public static void main(String[] args) {
        int year = 2024;

        dayCount(year);
    }

    private static void dayCount(int year) {
        if (year > 0){
            if (year % 4 == 0){
                int digit1 = year % 10;
                int digit2 = year % 100;
                if ((digit2 == 0)&&(digit1 == 0)&&(year > 99)&&(year % 400 > 0)){
                    System.out.println("В этом году 365 дней");
                }
                else {
                    System.out.println("В этом году 366 дней");
                }
            }
            else {
                System.out.println("В этом году 365 дней");
            }
        }
        else {
            System.out.println("Год некорректен.Введите другой год");
        }
    }
}
