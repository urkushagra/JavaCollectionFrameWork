import java.util.LinkedHashSet;
import java.util.Set;

public class IPAllowList {

    private static Set<String> allowedIPs = new LinkedHashSet<>();

    static {
        allowedIPs.add("192.168.1.1");
        allowedIPs.add("192.168.1.2");
        allowedIPs.add("10.0.0.1");
    }

    public static boolean isAllowed(String ip) {
        return allowedIPs.contains(ip);
    }

    public static void main(String[] args) {
        System.out.println(isAllowed("10.0.0.1")); // true
        System.out.println(isAllowed("8.8.8.8"));  // false
    }
}
