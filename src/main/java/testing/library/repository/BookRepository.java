package testing.library.repository;

import testing.library.model.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepository {
    private Map<Integer, Book> books;

    public BookRepository(){
        this.books = new HashMap<>();
    }

    public void addNewBook(String bookName, String author){
        Book book = new Book(bookName, author);
        book.setBookNumber(books.size() + 1);
        books.put(book.getBookNumber(), book);
    }

    public List<Book> getAllBooks(){
        return new ArrayList<>(books.values());
    }

    public Book getBookByBookNumber(Integer bookNumber){
        return books.get(bookNumber);
    }

    public void deleteBook(Integer bookNumber){
        books.remove(bookNumber);
    }

    public List<Integer> findBook(String bookName, String author){
        List<Integer> bookNumbers = new ArrayList<>();
        List<Book> bookList = new ArrayList<>(getAllBooks());
        for (Book book: bookList){
            if ((book.getBookName().equals(bookName))&&(book.getAuthor() == author)){
                bookNumbers.add(book.getBookNumber());
            }
        }
        return bookNumbers;
    }

    public void findBookByBookName(String bookName){
        List<Book> bookList = new ArrayList<>(getAllBooks());
        for (Book book: bookList){
            if (book.getBookName() == bookName){
                System.out.println(book.getBookName() + " - " + book.getAuthor() + " - " + book.getBookNumber());
            }
        }
    }

    public void printAllAboutBooks(){
        List<Book> bookList = new ArrayList<>(getAllBooks());
        for (Book book: bookList){
            System.out.println(book.getBookName() + " - " + book.getAuthor() + " - " + book.getBookNumber());
        }
    }

    public Book findBookByBookNumber(Integer bookNumber){
        return books.get(bookNumber);
    }
}
