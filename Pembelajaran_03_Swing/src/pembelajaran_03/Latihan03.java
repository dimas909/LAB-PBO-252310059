package pembelajaran_03;
import javax.swing.JOptionPane;
 
public class Latihan03 {
 
    private static String input(String label) {
        String s = JOptionPane.showInputDialog(null, "Masukkan " + label + ":",
                "Input " + label, JOptionPane.QUESTION_MESSAGE);
        return s == null ? "" : s.trim();
    }
 
    private static void error(String pesan) {
        JOptionPane.showMessageDialog(null, pesan, "Error", JOptionPane.ERROR_MESSAGE);
    }
 
    public static void main(String[] args) {
        Biodata bio = new Biodata();
 
        while (true) {
            String fullname = input("Fullname");
            if (fullname.isEmpty()) {
                error("Field Fullname tidak boleh kosong");
                continue;
            }
 
            String usiaStr = input("Usia");
            if (usiaStr.isEmpty()) {
                error("Field Usia tidak boleh kosong");
                continue;
            }
            int usia;
            try {
                usia = Integer.parseInt(usiaStr);
            } catch (NumberFormatException e) {
                error("Isian usia harus angka");
                continue;
            }
 
            String alamat = input("Alamat");
            if (alamat.isEmpty()) {
                error("Field Alamat tidak boleh kosong");
                continue;
            }
            if (alamat.length() < 10) {
                JOptionPane.showMessageDialog(null, "Masukan alamat minimum 10 karakter",
                        "Warning", JOptionPane.WARNING_MESSAGE);
                continue;
            }
 
            bio.setData(fullname, usia, alamat);
            JOptionPane.showMessageDialog(null,
                    "Fullname : " + bio.getFullname() + "\n" +
                    "Usia     : " + bio.getUsia() + "\n" +
                    "Alamat   : " + bio.getAlamat(),
                    "Info", JOptionPane.INFORMATION_MESSAGE);
            break;
        }
    }
}
 