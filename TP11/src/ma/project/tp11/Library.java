package ma.project.tp11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Library {
    private List<Book> books = new ArrayList<>();
    private Set<String> categories = new HashSet<>();
    private Map<String, Book> isbnIndex = new HashMap<>();
    private Map<Book, String> loans = new HashMap<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addBookIndexed(Book book) {
        books.add(book);
        isbnIndex.put(book.getIsbn(), book);
    }

    public void addCategory(String category) {
        categories.add(category);
    }

    public Book findByIsbn(String isbn) {
        return isbnIndex.get(isbn);
    }

    public boolean borrowBook(Book book, String borrower) {
        if (!loans.containsKey(book)) {
            loans.put(book, borrower);
            System.out.println("-> Succès : " + book.getTitle() + " emprunté par " + borrower);
            return true;
        }
        System.out.println("-> Échec : " + book.getTitle() + " est déjà emprunté.");
        return false;
    }

    public void returnBook(Book book) {
        if (loans.containsKey(book)) {
            loans.remove(book);
            System.out.println("-> Succès : " + book.getTitle() + " a été restitué.");
        } else {
            System.out.println("-> Attention : Ce livre n'était pas enregistré comme emprunté.");
        }
    }

    public List<Book> getBooks() { return books; }
    public Set<String> getCategories() { return categories; }
    public Map<Book, String> getLoans() { return loans; }
}