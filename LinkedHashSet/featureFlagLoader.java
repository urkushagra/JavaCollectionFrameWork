import java.util.LinkedHashSet;
import java.util.Set;

public class FeatureFlagLoader {

    public static void main(String[] args) {

        Set<String> featureFlags = new LinkedHashSet<>();

        featureFlags.add("AUTH_V2");
        featureFlags.add("DARK_MODE");
        featureFlags.add("BETA_CHECKOUT");
        featureFlags.add("AUTH_V2"); // duplicate ignored

        for (String flag : featureFlags) {
            System.out.println("Loading feature: " + flag);
        }
    }
}
