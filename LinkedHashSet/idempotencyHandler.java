import java.util.LinkedHashSet;
import java.util.Set;

public class IdempotencyHandler {

    private Set<String> processedRequests = new LinkedHashSet<>();

    public boolean processRequest(String requestId) {
        if (processedRequests.contains(requestId)) {
            return false; // duplicate request
        }
        processedRequests.add(requestId);
        return true;
    }

    public static void main(String[] args) {
        IdempotencyHandler handler = new IdempotencyHandler();

        System.out.println(handler.processRequest("REQ-1")); // true
        System.out.println(handler.processRequest("REQ-2")); // true
        System.out.println(handler.processRequest("REQ-1")); // false
    }
}
