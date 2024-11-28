
package bookcollections;
import java.util.ArrayList;

// Book class definition
class Book {
    private int bookId;
    private String bookName;
    private String authorName;

    // Parameterized constructor
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Getter methods to access private variables
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId + ", Book Name: " + bookName + ", Author: " + authorName);
    }
}

public class BookCollection {
    public static void main(String[] args) {
        // Creating an ArrayList of type Book
        ArrayList<Book> bookList = new ArrayList<>();

        // Creating Book objects and adding them to the ArrayList
        bookList.add(new Book(101, "Discovery of india", "Pandit jawaharlal Nehru"));
        bookList.add(new Book(102, "Origin of Species", "Charles Darwin"));
        bookList.add(new Book(103, "Geetanjali", "Rabindra Nath Tagore"));
        bookList.add(new Book(104, "The Merchant of Venice", "Shakespeare"));
        bookList.add(new Book(105, "Shakuntala", "Kalidas"));

        // Using advanced for loop to display all book details
        for (Book book : bookList) {
            book.displayBookDetails();
        }
    }
}


     
