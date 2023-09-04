
import java.util.HashMap;
import java.util.Scanner;

public class parte2ejercicio7Principal {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("apple", "manzana");
        dictionary.put("banana", "plátano");
        dictionary.put("car", "coche");
        dictionary.put("house", "casa");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra en ingles: ");
        String englishWord = scanner.nextLine().toLowerCase();

        if (dictionary.containsKey(englishWord)) {
            String spanishTranslation = dictionary.get(englishWord);
            System.out.println("Traduccion a español: " + spanishTranslation);
        } else {
            System.out.println("Esa palabra no esta en el diccionario.");
        }
    }
}

