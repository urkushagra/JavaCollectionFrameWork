import java.util.HashMap;

public class CollisionDemo {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Aa", 1);
        map.put("BB", 2); // Same hashCode as "Aa"

        System.out.println("Aa".hashCode());
        System.out.println("BB".hashCode());

        System.out.println(map);
    }
}
