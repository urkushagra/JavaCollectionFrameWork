import java.util.ArrayList;
import java.util.List;

public class WrongRemoval {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4));

        for (Integer x : list) {
            if (x % 2 == 0) {
                list.remove(x); // ConcurrentModificationException
            }
        }
    }
}
