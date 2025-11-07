import java.util.Vector;

class Logger {
    private static Vector<String> logs = new Vector<>();

    public static void main(String[] args) {
        Runnable addLog = () -> {
            for (int i = 1; i <= 3; i++) {
                String log = Thread.currentThread().getName() + " logged event " + i;
                logs.add(log);
                System.out.println(log);
                try { Thread.sleep(300); } catch (InterruptedException e) {}
            }
        };

        Thread t1 = new Thread(addLog, "Thread-1");
        Thread t2 = new Thread(addLog, "Thread-2");

        t1.start();
        t2.start();

        try { t1.join(); t2.join(); } catch (InterruptedException e) {}

        System.out.println("\nAll Logs:");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}
