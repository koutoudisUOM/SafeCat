public class InsurancePolicy {
    private String kodikosPaketou;
    private String perigrafi;
    private int diarkeia;

    public InsurancePolicy(String kodikosPaketou, String perigrafi, int diarkeia) {
        this.kodikosPaketou = kodikosPaketou;
        this.perigrafi = perigrafi;
        this.diarkeia = diarkeia;
    }

    public String getKodikosPaketou() {
        return kodikosPaketou;
    }

    public String getPerigrafi() {
        return perigrafi;
    }

    public int getDiarkeia() {
        return diarkeia;
    }

    public void printData() {
        System.out.println("Insurance Policy: " + kodikosPaketou + ", Description: " + perigrafi + ", Duration: " + diarkeia + " months");
    }
}