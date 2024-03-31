package testing.reader;

import java.util.LinkedList;

public class Reader {
    private String fullName;
    private int ticketNumber;
    private String facultet;
    private String borningDate;
    private int phoneNumber;
    private LinkedList<String> books;

    public Reader(String fullName, int ticketNumber, String facultet, String borningDate, int phoneNumber) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.facultet = facultet;
        this.borningDate = borningDate;
        this.phoneNumber = phoneNumber;
        books = new LinkedList<>();
    }

    public String getFullName() {
        return fullName;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getFacultet() {
        return facultet;
    }

    public String getBorningDate() {
        return borningDate;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }

    public void setBorningDate(String borningDate) {
        this.borningDate = borningDate;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(String... bookslist){
        for (int i = 0; i < bookslist.length; i++){
            books.add(bookslist[i]);
        }
        System.out.println(fullName + " взял " + bookslist.length + " книги");
    }

    public void returnBook(String... bookList){
        for (int i = 0; i < bookList.length; i++){
            if (books.remove(bookList[i])){
                System.out.println("Книга " + bookList[i] + " принята");
            }
            else {
                System.out.println("Книга не найдена");
            }
        }
    }

    public void showBooks(){
        for(String book:books){
            System.out.println(book);
        }
    }
}