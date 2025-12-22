import java.util.LinkedHashSet;

public class SearchHistoryService {

    private static final int MAX_HISTORY = 5;
    private LinkedHashSet<String> history = new LinkedHashSet<>();

    public void addSearch(String query) {
        if (history.contains(query)) {
            history.remove(query); // move to latest
        } else if (history.size() == MAX_HISTORY) {
            history.remove(history.iterator().next()); // remove oldest
        }
        history.add(query);
    }

    public void printHistory() {
        System.out.println(history);
    }

    public static void main(String[] args) {
        SearchHistoryService service = new SearchHistoryService();

        service.addSearch("java");
        service.addSearch("spring");
        service.addSearch("docker");
        service.addSearch("java");
        service.addSearch("kubernetes");

        service.printHistory();
    }
}
