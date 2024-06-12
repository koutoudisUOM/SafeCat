public class Vehicle {
    private String marka;
    private String modelo;
    private String pinakida;
    private int year;
    private String arithmosPlaisiou;

    public Vehicle(String marka, String modelo, String pinakida, int year, String arithmosPlaisiou) {
        this.marka = marka;
        this.modelo = modelo;
        this.pinakida = pinakida;
        this.year = year;
        this.arithmosPlaisiou = arithmosPlaisiou;
    }

    public String getMarka() {
        return marka;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPinakida() {
        return pinakida;
    }

    public int getYear() {
        return year;
    }

    public String getArithmosPlaisiou() {
        return arithmosPlaisiou;
    }

    public void printData() {
        System.out.println("Vehicle: " + marka + " " + modelo + ", Plate: " + pinakida + ", Year: " + year + ", Chassis Number: " + arithmosPlaisiou);
    }
}
