public class InsuranceContract {
    private Customer customer;
    private Vehicle vehicle;
    private InsurancePolicy policy;
    private double cost;

    public InsuranceContract(Customer customer, Vehicle vehicle, InsurancePolicy policy, double cost) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.policy = policy;
        this.cost = cost;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public InsurancePolicy getPolicy() {
        return policy;
    }

    public double getCost() {
        return cost;
    }

    public void printData() {
        System.out.println("Insurance Contract: Customer: " + customer.getName() + " " + customer.getLastName() +
                ", Vehicle: " + vehicle.getPinakida() + ", Policy: " + policy.getPerigrafi() + ", Cost: " + cost);
    }
}