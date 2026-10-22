package pembelajaran_03;
import javax.swing.JOptionPane;

public class Latihan04 {

    private static String input(String label) {
        return JOptionPane.showInputDialog(null, "Masukkan " + label + ":",
                "Input " + label, JOptionPane.QUESTION_MESSAGE);
    }

    private static boolean konfirmasiKeluar() {
        int pilih = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar ?",
                "Konfirmasi", JOptionPane.YES_NO_OPTION);
        return pilih == JOptionPane.YES_OPTION;
    }

    private static void error(String pesan) {
        JOptionPane.showMessageDialog(null, pesan, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        Biodata bio = new Biodata();

        while (true) {
            String fullname = input("Fullname");
            if (fullname == null) {
                if (konfirmasiKeluar()) break; else continue;
            }
            if (fullname.trim().isEmpty()) {
                error("Field Fullname tidak boleh kosong");
                continue;
            }

            String usiaStr = input("Usia");
            if (usiaStr == null) {
                if (konfirmasiKeluar()) break; else continue;
            }
            if (usiaStr.trim().isEmpty()) {
                error("Field Usia tidak boleh kosong");
                continue;
            }
            int usia;
            try {
                usia = Integer.parseInt(usiaStr.trim());
            } catch (NumberFormatException e) {
                error("Isian usia harus angka");
                continue;
            }

            String alamat = input("Alamat");
            if (alamat == null) {
                if (konfirmasiKeluar()) break; else continue;
            }
            if (alamat.trim().isEmpty()) {
                error("Field Alamat tidak boleh kosong");
                continue;
            }
            if (alamat.trim().length() < 10) {
                JOptionPane.showMessageDialog(null, "Masukan alamat minimum 10 karakter",
                        "Warning", JOptionPane.WARNING_MESSAGE);
                continue;
            }

            bio.setData(fullname.trim(), usia, alamat.trim());
            JOptionPane.showMessageDialog(null,
                    "Fullname : " + bio.getFullname() + "\n" +
                    "Usia     : " + bio.getUsia() + "\n" +
                    "Alamat   : " + bio.getAlamat(),
                    "Info", JOptionPane.INFORMATION_MESSAGE);

            // OK ditekan -> tanya keluar: Yes = selesai, No = kembali ke Fullname
            if (konfirmasiKeluar()) break;
        }
    }
}