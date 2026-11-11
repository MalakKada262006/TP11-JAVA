package ma.project.tp11;
import java.util.HashMap;
import java.util.Map;

public class BilingualDictionary {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        
        dictionary.put("cat", "chat");
        dictionary.put("dog", "chien");
        dictionary.put("bird", "oiseau");
        
        System.out.println("Traduction de 'dog' : " + dictionary.get("dog"));

        System.out.println("--- Dictionnaire complet ---");
        
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}