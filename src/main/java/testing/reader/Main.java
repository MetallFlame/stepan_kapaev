package testing.reader;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("Ivan", 7355, "intellig idea", "30.03.2011",74833656);
        reader.takeBook("Грокаем алгоритмы", "я устал писать методы", "yamaha", "kdndjgheigneignej f");
        System.out.println();
        reader.showBooks();
        System.out.println();
        reader.returnBook("yamaha", "hgughg", "djfgggggggggggggggggggggggggggggggggggggggggg");
        System.out.println();
        reader.showBooks();
    }
}
