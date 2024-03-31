package testing.library;

import testing.library.model.Book;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        userTesting(library);
        bookTesting(library);
        library.printAllUsers();
        library.printAllAboutBooks();
    }

        public static void userTesting (Library library){
            library.addNewUser("Stepa_kap", "123456789", "123456789");
            library.addNewUser("KIA_man", "8365746ssfsdde", "8365746ssfsdde");
            library.addNewUser("Sigma_ice", "10203040", "10203040");
        }

        public static void bookTesting (Library library){
            library.addNewBook("1984", "George");
            library.addNewBook("qwerty", "Steve");
            library.addNewBook("people", "not people");
            library.addNewBook("people", "human");
            library.addNewBook("waiting", "volve");
            library.addNewBook("key to all doors", "soilder");
            library.addBookToUser("Stepa_kap", 1);
            library.addBookToUser("Stepa_kap", 4);
            library.addBookToUser("KIA_man", 3);
            library.addBookToUser("KIA_man", 6);
            library.addBookToUser("Sigma_ice", 2);
            library.addBookToUser("Sigma_ice", 5);
        }

}
