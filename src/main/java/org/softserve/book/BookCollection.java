package org.softserve.book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class BookCollection {
    //Create set of authors to avoid duplicates
    private Set<String> authors = new HashSet<>();
    private ArrayList<Book> selectedBooks = new ArrayList<>();

    public Set<String> getBooksAuthors(ArrayList<Book> books) {
        authors.clear();
        for (Book book : books) {
            authors.add(book.getAuthor());
        }
        return authors;
    }

    public Set<String> getBooksAuthorsByGenre(ArrayList<Book> books, String genre) {
        authors.clear();
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                authors.add(book.getAuthor());
            }
        }
        return authors;
    }

    public Set<String> getBooksAuthorsByYear(ArrayList<Book> books, int year) {
        authors.clear();
        for (Book book : books) {
            if (book.getYear() == year) {
                authors.add(book.getAuthor());
            }
        }
        return authors;
    }

    public ArrayList<Book> selectBooksByAuthor(ArrayList<Book> books, String author) {
        selectedBooks.clear();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                selectedBooks.add(book);
            }
        }
        return selectedBooks;
    }

    public ArrayList<Book> selectBooksByYear(ArrayList<Book> books, int year) {
        selectedBooks.clear();
        for (Book book : books) {
            if (book.getYear() == year) {
                selectedBooks.add(book);
            }
        }
        return selectedBooks;
    }

    public ArrayList<Book> selectBooksByGenre(ArrayList<Book> books, String genre) {
        selectedBooks.clear();
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                selectedBooks.add(book);
            }
        }
        return selectedBooks;
    }

    public ArrayList<Book> removeBooksByAuthor(ArrayList<Book> books, String author) {
        books.removeIf(book -> book.getAuthor().equalsIgnoreCase(author));
        return books;
    }

    public ArrayList<Book> sortByComparator (ArrayList<Book> books, Comparator<Book> comparator){
        books.sort(comparator);
        return books;
    }

    public ArrayList<Book> mergeTwoCollections(ArrayList<Book> books1, ArrayList<Book> books2) {
        books1.addAll(books2);
        return books1;
    }
}
