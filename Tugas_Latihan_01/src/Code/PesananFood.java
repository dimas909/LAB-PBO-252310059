package Code;
public class PesananFood {
    private String idPesanan;
    private String namaPelanggan;
    private double totalHarga;
    public PesananFood(String idPesanan, String namaPelanggan) {
        this.idPesanan = idPesanan;
        this.namaPelanggan = namaPelanggan;
        this.totalHarga = 0;
    }
    public void tambahItem(String namaMenu, double harga, int jumlah) {
        if (harga > 0 && jumlah > 0) {
            totalHarga += harga * jumlah;
            System.out.println("Ditambahkan: " + jumlah + "x " + namaMenu);
        } else {
            System.out.println("Input tidak valid, item ditolak.");
        }
    }
    public double getTotalHarga() { return totalHarga; }
    public String getIdPesanan()  { return idPesanan; }
}
