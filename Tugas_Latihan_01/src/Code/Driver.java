package Code;

public class Driver {
    private String idDriver;
    private String namaDriver;
    private PesananFood pesananAktif;     // ASOSIASI: Driver --> PesananFood

    public Driver(String idDriver, String namaDriver) {
        this.idDriver = idDriver;
        this.namaDriver = namaDriver;
    }

    public void ambilPesanan(PesananFood pesanan) {
        this.pesananAktif = pesanan;
        System.out.println(namaDriver + " mengambil pesanan " + pesanan.getIdPesanan());
    }

    public void antarPesanan() {
        if (pesananAktif == null) {
            System.out.println("Belum ada pesanan untuk diantar.");
            return;
        }
        System.out.println(namaDriver + " mengantar pesanan " + pesananAktif.getIdPesanan()
                + " | Total: Rp" + pesananAktif.getTotalHarga());
    }
}