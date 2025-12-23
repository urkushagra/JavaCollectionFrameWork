import java.util.TreeSet;

public class AutoComplete {

    public static void main(String[] args) {

        TreeSet<String> dictionary = new TreeSet<>();

        dictionary.add("java");
        dictionary.add("javascript");
        dictionary.add("spring");
        dictionary.add("springboot");
        dictionary.add("docker");

        String prefix = "spr";

        dictionary.subSet(prefix, prefix + Character.MAX_VALUE)
                .forEach(System.out::println);
    }
}
