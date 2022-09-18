package guru.qa;

import java.util.ArrayList;
import java.util.List;

public class Book {
    List<String> storedBooks = new ArrayList<>();

    public void addNewBook(String author) {
        storedBooks.add(author);
    }

    public void removeBook(String author) {
        storedBooks.remove(author);
    }

    public void printBooks() {
        for (int i = 0; i <= storedBooks.size(); i++) {
            System.out.println("Книги в продаже" + i);
        }
    }

    public void searchBook(String author) {
        for (String storedBook : storedBooks) {
            if (storedBooks.contains(author)) {
                System.out.println("Книга в наличии");
            } else System.out.println("Книги нет в наличии");
        }


    }
}
