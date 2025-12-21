import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FeatureFlags {
    public static void main(String[] args) {

        List<String> flags = new CopyOnWriteArrayList<>();

        flags.add("DARK_MODE");
        flags.add("NEW_CHECKOUT");

        // Safe iteration without locking
        for (String flag : flags) {
            System.out.println(flag);
        }

        // Safe write (creates new copy internally)
        flags.add("BETA_SEARCH");
    }
}
