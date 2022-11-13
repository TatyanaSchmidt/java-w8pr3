import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> programmingLanguages = new LinkedList<>();
        programmingLanguages.add("Java");
        programmingLanguages.addFirst("Rust");
        programmingLanguages.addLast("JavaScript");
        programmingLanguages.add(0,"Python");
        System.out.println(programmingLanguages);

        HashMap<Integer,String> indexLanguages = new HashMap<>();
        indexLanguages.put(programmingLanguages.indexOf("Java"), "Java");
        indexLanguages.put(programmingLanguages.indexOf("Python"), "Python");
        indexLanguages.put(programmingLanguages.indexOf("JavaScript"), "JavaScript");
        indexLanguages.put(programmingLanguages.indexOf("Rust"), "Rust");
        System.out.println(indexLanguages);
    }
}