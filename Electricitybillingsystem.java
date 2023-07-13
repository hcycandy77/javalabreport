import java.util.Scanner;

class Customer {
    private String name;
    private String address;
    private int previousReading;
    private int currentReading;

    public Customer(String name, String address, int previousReading, int currentReading) {
        this.name = name;
        this.address = address;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPreviousReading() {
        return previousReading;
    }

    public int getCurrentReading() {
        return currentReading;
    }

    public int calculateUnitsConsumed() {
        return currentReading - previousReading;
    }

    public double calculateBill(double unitRate) {
        int unitsConsumed = calculateUnitsConsumed();
        return unitsConsumed * unitRate;
    }
}

public class ElectricityBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter customer details
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer address: ");
        String address = scanner.nextLine();
        System.out.print("Enter previous meter reading: ");
        int previousReading = scanner.nextInt();
        System.out.print("Enter current meter reading: ");
        int currentReading = scanner.nextInt();

        // Create customer object
        Customer customer = new Customer(name, address, previousReading, currentReading);

        // Calculate bill
        double unitRate = 8.5;  // Assuming unit rate of 8.5 per unit
        double billAmount = customer.calculateBill(unitRate);

        // Generate bill
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Previous Reading: " + customer.getPreviousReading());
        System.out.println("Current Reading: " + customer.getCurrentReading());
        System.out.println("Units Consumed: " + customer.calculateUnitsConsumed());
        System.out.println("Bill Amount: $" + billAmount);
    }
}

