package pembelajaran_03;

import javax.swing.JOptionPane;
public class Latihan02 {
    public static void main(String[] args) {
        Biodata bio = new Biodata();

        String fullname = JOptionPane.showInputDialog(null, "Masukkan Fullname:");
        int usia = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Usia:"));
        String alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat:");

        bio.setData(fullname, usia, alamat);

        JOptionPane.showMessageDialog(null,
                "Fullname : " + bio.getFullname() + "\n" +
                "Usia     : " + bio.getUsia() + "\n" +
                "Alamat   : " + bio.getAlamat());
    }
}
