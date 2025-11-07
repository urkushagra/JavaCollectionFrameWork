import java.util.Vector;

class BusReservationSystem {
    private static Vector<String> seats = new Vector<>();

    public static void main(String[] args) {
        // Pre-allocate seats
        for (int i = 1; i <= 5; i++) {
            seats.add("Seat-" + i);
        }

        Runnable bookSeat = () -> {
            if (!seats.isEmpty()) {
                String seat = seats.remove(0);
                System.out.println(Thread.currentThread().getName() + " booked " + seat);
            } else {
                System.out.println(Thread.currentThread().getName() + " tried to book, but no seats left!");
            }
        };

        // Multiple passengers (threads) trying to book
        for (int i = 1; i <= 7; i++) {
            new Thread(bookSeat, "Passenger-" + i).start();
        }
    }
}
