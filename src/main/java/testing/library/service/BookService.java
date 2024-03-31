package testing.library.service;

import testing.library.model.Book;
import testing.library.repository.BookRepository;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    public BookService() {
        bookRepository = new BookRepository();
    }

    public void addNewBook(String bookName, String author){
        bookRepository.addNewBook(bookName, author);
    }

    public void printAllBooks(){
        for (Book book: bookRepository.getAllBooks()){
            System.out.println(book.getBookName() + "  " + book.getAuthor());
        }
//        bookRepository.getAllBooks().forEach(book -> {System.out.println(book.getBookName() + "  " + book.getAuthor());});
    }

    public void deleteBook(Integer bookNumber){
        if (bookRepository.getBookByBookNumber(bookNumber) != null){
            bookRepository.deleteBook(bookNumber);
        }
        else {
            System.out.println("Такой книги нет в базе данных.");
        }
    }

    public List<Integer> findBook(String bookName, String author){
        return bookRepository.findBook(bookName, author);
    }

    public void findBookByBookName(String bookName){
        bookRepository.findBookByBookName(bookName);
    }

    public void printAllAboutBooks(){
        bookRepository.printAllAboutBooks();
    }

    public Book findBookByBookNumber(Integer bookNumber){
        return bookRepository.findBookByBookNumber(bookNumber);
    }

    public Book getBook(Integer bookNumber){
        return bookRepository.findBookByBookNumber(bookNumber);
    }
}
