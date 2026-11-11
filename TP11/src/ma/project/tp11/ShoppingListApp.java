package ma.project.tp11;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListApp {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        
        shoppingList.add("Banane");
        shoppingList.add("Thé");
        shoppingList.add("Pommes");
        
        System.out.println("Articles de la liste initiale :");
        for (String item : shoppingList) {
            System.out.println("- " + item);
        }
       
        shoppingList.remove("Lait");
        
        boolean hasApples = shoppingList.contains("Pommes");
        
        System.out.println("Contient des pommes ? " + hasApples);
        System.out.println("Taille finale de la liste : " + shoppingList.size());
        
        System.out.println("\nArticles restants dans la liste :");
        for (String item : shoppingList) {
            System.out.println("- " + item);
        }
    }
}
