abstract class ElectricityBill {
    protected String customerName;
    protected int unitsConsumed;

    public ElectricityBill(String customerName, int unitsConsumed) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    public abstract double calculateBillAmount();

    public void displayBill() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: Rs." + calculateBillAmount());
    }
}

class ResidentialBill extends ElectricityBill {
    public ResidentialBill(String customerName, int unitsConsumed) {
        super(customerName, unitsConsumed);
    }

    @Override
    public double calculateBillAmount() {
        return unitsConsumed * 12; // Rs. 12 per unit for residential customers
    }
}

class CommercialBill extends ElectricityBill {
    public CommercialBill(String customerName, int unitsConsumed) {
        super(customerName, unitsConsumed);
    }

    @Override
    public double calculateBillAmount() {
        return unitsConsumed * 15; // Rs. 15 per unit for commercial customers
    }
}

public class index {
    public static void main(String[] args) {
        ElectricityBill residentialBill = new ResidentialBill("Rohit Sharma", 60);
        ElectricityBill commercialBill = new CommercialBill("ABC Inc.", 120);

        residentialBill.displayBill();
        commercialBill.displayBill();
    }
}