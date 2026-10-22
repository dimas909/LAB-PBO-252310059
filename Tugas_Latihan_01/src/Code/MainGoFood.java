package Code;
public class MainGoFood {
    public static void main(String[] args) {
        PesananFood pesanan = new PesananFood("PSN-001", "Budi");
        pesanan.tambahItem("Nasi Goreng", 25000, 2);
        pesanan.tambahItem("Es Teh", 5000, 2);
        Driver driver = new Driver("DRV-01", "Andi");
        driver.ambilPesanan(pesanan);
        driver.antarPesanan();
    }
}