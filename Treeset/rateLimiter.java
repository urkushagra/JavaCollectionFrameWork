import java.util.TreeSet;

public class RateLimiter {

    private static final long WINDOW_MS = 60_000;
    private static final int MAX_REQUESTS = 3;

    private TreeSet<Long> requestTimes = new TreeSet<>();

    public boolean allowRequest() {
        long now = System.currentTimeMillis();

        // Remove old timestamps
        requestTimes.headSet(now - WINDOW_MS).clear();

        if (requestTimes.size() < MAX_REQUESTS) {
            requestTimes.add(now);
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws InterruptedException {
        RateLimiter limiter = new RateLimiter();

        System.out.println(limiter.allowRequest());
        System.out.println(limiter.allowRequest());
        System.out.println(limiter.allowRequest());
        System.out.println(limiter.allowRequest()); // false
    }
}
