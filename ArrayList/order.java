class Order {
    String status;
    double amount;

    Order(String status, double amount) {
        this.status = status;
        this.amount = amount;
    }
}

ArrayList<Order> orders = new ArrayList<>();

orders.add(new Order("PAID", 1200));
orders.add(new Order("CANCELLED", 500));
orders.add(new Order("PAID", 3000));

// Filter paid orders
List<Order> paidOrders = orders.stream()
    .filter(o -> o.status.equals("PAID"))
    .toList();
