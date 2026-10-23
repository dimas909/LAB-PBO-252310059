package Praktikum_04;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListApp {
	public static void main(String[] args) {
		ArrayList<String> nama = new ArrayList<String>();
		nama.add("Rafly"); //Memasukan nama
		System.out.println(nama.get(0));
		
		JOptionPane jop = new JOptionPane();
		nama.add(jop.showInputDialog(null, "Input nama:"));
		jop.showMessageDialog(null, "Nama: " + nama.getLast());
		
		nama.remove(0); // MENGHAPUSSSS
		System.out.println("Nama setelah dihapus: " + nama.get(0));
		
		//soal
		//System.out.println(nama.get(1));
		
		nama.add("Dimas");
		nama.add("BAMPUKI");
		for (int i = 0; i < nama.size(); i++) {
			System.out.println(nama.get(i));
		}
		
		nama.clear();//menghapus semua data 
		System.out.println(nama.size());
		}
	}

