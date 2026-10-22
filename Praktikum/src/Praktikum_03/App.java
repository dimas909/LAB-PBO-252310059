package Praktikum_03;

import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		String nama, npm;
		int umur;
		
		int confirm = 0;
		
		do {
			nama = jop.showInputDialog(
					null, 
					"Masukkan nama anda : ",
					"input",
					jop.QUESTION_MESSAGE 
					);
			confirm = jop.showConfirmDialog(
					null, 
					"Apakah anda yakin nama anda?" + nama
					);
			
		} while (confirm != 0);
	}
}