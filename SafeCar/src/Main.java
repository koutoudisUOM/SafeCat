import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Λίστες για τους πελάτες, τα οχήματα και τα ασφαλιστήρια συμβόλαια
        List<Customer> customers = new ArrayList<>();
        List<Vehicle> vehicles = new ArrayList<>();
        List<InsurancePolicy> insurancePolicies = new ArrayList<>();
        List<InsuranceContract> insuranceContracts = new ArrayList<>();

        // Δημιουργία πελατών
        Customer customer1 = new Customer("Maria", "Papadopoulou", "2310264368", "maria.papadopoulou@gmail.com", "AO79432");
        customers.add(customer1);
        System.out.println("New Customer has been created: " + customer1.getName() + " " + customer1.getLastName());

        Customer customer2 = new Customer("Evanthia", "Papagianni", "2310245368", "evanthia.papagianni@gmail.com", "AO77813");
        customers.add(customer2);
        System.out.println("New Customer has been created: " + customer2.getName() + " " + customer2.getLastName());

        Customer customer3 = new Customer("Vasilis", "Karagiannis", "2310245668", "ioannis.karagiannis@gmail.com", "AO45698");
        customers.add(customer3);
        System.out.println("New Customer has been created: " + customer3.getName() + " " + customer3.getLastName());

        // Δημιουργία οχημάτων
        Vehicle vehicle1 = new Vehicle("Mercedes", "GLC", "XKP8923", 2020, "7C3FR76A515072256");
        vehicles.add(vehicle1);
        System.out.println("New Vehicle has been created: " + vehicle1.getMarka() + " " + vehicle1.getModelo());

        Vehicle vehicle2 = new Vehicle("Subaru", "Forester", "NII4269", 2018, "7C3FR76A555071465");
        vehicles.add(vehicle2);
        System.out.println("New Vehicle has been created: " + vehicle2.getMarka() + " " + vehicle2.getModelo());

        Vehicle vehicle3 = new Vehicle("Ford", "Ranger", "KOH4681", 2022, "7C3FR76A55504645");
        vehicles.add(vehicle3);
        System.out.println("New Vehicle has been created: " + vehicle3.getMarka() + " " + vehicle3.getModelo());

        // Δημιουργία πακέτων ασφάλισης
        InsurancePolicy policy1 = new InsurancePolicy("ΜI93", "Mikti asfalisi", 6);
        insurancePolicies.add(policy1);
        System.out.println("New Insurance Policy has been created: " + policy1.getPerigrafi());

        InsurancePolicy policy2 = new InsurancePolicy("B56", "Basiki asfalisi", 6);
        insurancePolicies.add(policy2);
        System.out.println("New Insurance Policy has been created: " + policy2.getPerigrafi());

        InsurancePolicy policy3 = new InsurancePolicy("O58", "Me odiki", 6);
        insurancePolicies.add(policy3);
        System.out.println("New Insurance Policy has been created: " + policy3.getPerigrafi());

        // Δημιουργία ασφαλιστηρίων συμβολαίων
        InsuranceContract contract1 = new InsuranceContract(customer1, vehicle1, policy2, 60);
        insuranceContracts.add(contract1);
        System.out.println("New Insurance Contract has been created for: " + customer1.getName() + " " + customer1.getLastName());

        InsuranceContract contract2 = new InsuranceContract(customer2, vehicle2, policy1, 120);
        insuranceContracts.add(contract2);
        System.out.println("New Insurance Contract has been created for: " + customer2.getName() + " " + customer2.getLastName());

        InsuranceContract contract3 = new InsuranceContract(customer2, vehicle3, policy3, 80);
        insuranceContracts.add(contract3);
        System.out.println("New Insurance Contract has been created for: " + customer2.getName() + " " + customer2.getLastName());

        // Εμφάνιση πληροφοριών ασφαλιστηρίων συμβολαίων
        for (InsuranceContract contract : insuranceContracts) {
            System.out.println("Customer: " + contract.getCustomer().getName() + " " + contract.getCustomer().getLastName() + ", Vehicle: " + contract.getVehicle().getPinakida() + ", Policy: " + contract.getPolicy().getPerigrafi() + ", Cost: " + contract.getCost());
        }

        // Εμφάνιση πληροφοριών πελατών και οχημάτων
        for (Customer customer : customers) {
            double totalCost = 0;
            System.out.print("Customer: " + customer.getName() + " " + customer.getLastName() + " has vehicles: ");
            for (InsuranceContract contract : insuranceContracts) {
                if (contract.getCustomer().getArithmosTaftotitas().equals(customer.getArithmosTaftotitas())) {
                    System.out.print(contract.getVehicle().getPinakida() + " ");
                    totalCost += contract.getCost();
                }
            }
            System.out.println("with total insurance cost: " + totalCost);
        }
    }
}