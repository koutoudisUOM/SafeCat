
public class Customer {
    private String name;
    private String lastName;
    private String phone;
    private String email;
    private String arithmosTaftotitas;

    public Customer(String name, String lastName, String phone, String email, String arithmosTaftotitas) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.arithmosTaftotitas = arithmosTaftotitas;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getArithmosTaftotitas() {
        return arithmosTaftotitas;
    }

    public void printData() {
        System.out.println("Customer: " + name + " " + lastName + ", Phone: " + phone + ", Email: " + email + ", ID: " + arithmosTaftotitas);
    }
}
