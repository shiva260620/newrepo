import java.util.Scanner;

class Customer {
    String name;
    int unitsConsumed;

    Customer(String name, int unitsConsumed) {
        this.name = name;
        this.unitsConsumed = unitsConsumed;
    }

    double calculateBill() {
        // Define your billing logic here. This is a basic example; you can make it more complex.
        double ratePerUnit = 7.0; // Change this rate as per your requirements.
        return unitsConsumed * ratePerUnit;
    }
}

public class BillSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Electricity Billing System");
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter units consumed: ");
        int unitsConsumed = scanner.nextInt();

        Customer customer = new Customer(name, unitsConsumed);
        double billAmount = customer.calculateBill();

        System.out.println("Customer Name: " + customer.name);
        System.out.println("Units Consumed: " + customer.unitsConsumed);
        System.out.println("Bill Amount: Rs" + billAmount);

        scanner.close();
    }
}
