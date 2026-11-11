package ma.project.tp11;
public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        Book b1 = new Book("978-2123456803", "Java Avancé", "Auteur A");
        Book b2 = new Book("978-2070368228", "L'Étranger", "Albert Camus");

        lib.addCategory("Informatique");
        lib.addCategory("Littérature");
        lib.addCategory("Informatique"); 

        lib.addBookIndexed(b1);
        lib.addBookIndexed(b2);

        System.out.println("--- Recherche par ISBN ---");
        Book searchResult = lib.findByIsbn("978-2123456803");
        System.out.println("Livre trouvé : " + searchResult);

        System.out.println("\n--- Cycle de Prêt / Restitution ---");
        lib.borrowBook(b1, "Aya");

        lib.borrowBook(b1, "Ali");

        lib.returnBook(b1);

        lib.borrowBook(b1, "Ali");
    }
}
