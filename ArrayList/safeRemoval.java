import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SafeRemoval {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4));

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }

        System.out.println(list); // [1, 3]
    }
}
