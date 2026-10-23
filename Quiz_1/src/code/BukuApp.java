package code;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BukuApp {
	public static void main(String[] args) {
		ArrayList<String> buku = new ArrayList<String>();
		JOptionPane jop = new JOptionPane();
		int pilih;

		do {
			String input = jop.showInputDialog(null,
					"1. Input Buku\n2. Hapus Buku\n3. Output Seluruh Data Buku\n4. Keluar\n\nPilih menu:");
			if (input == null) {
				break;
			}
			pilih = Integer.parseInt(input);

			switch (pilih) {
			case 1:
				String judul = jop.showInputDialog(null, "Masukkan judul buku:");
				buku.add(judul);
				jop.showMessageDialog(null, "Buku disimpan");
				break;
			case 2:
				int idx = Integer.parseInt(jop.showInputDialog(null, "Masukkan index buku yang dihapus:"));
				if (idx >= 0 && idx < buku.size()) {
					buku.remove(idx);
					jop.showMessageDialog(null, "Buku dihapus");
				} else {
					jop.showMessageDialog(null, "Index tidak valid");
				}
				break;
			case 3:
				String hasil = "Data Buku:\n";
				for (int i = 1; i < buku.size(); i++) {
					hasil += i + ". " + buku.get(i) + "\n";
				}
				jop.showMessageDialog(null, hasil);
				break;
			case 4:
				jop.showMessageDialog(null, "Keluar dari program");
				break;
			default:
				jop.showMessageDialog(null, "Menu tidak valid");
			}
		} while (pilih != 4);
	}
}