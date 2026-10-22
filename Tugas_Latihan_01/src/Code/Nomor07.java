package Code;
public class Nomor07 {
    public static void main(String[] args) {
        PesananFood p = new PesananFood("PSN-001", "Budi");
        p.tambahItem("Nasi Goreng", 25000, 2);
        p.tambahItem("Es Teh", 5000, 2);
        p.tambahItem("Ayam Bakar", -1000, 1);     
        System.out.println("Total harga: Rp" + p.getTotalHarga());
    }
}
