package praktikum1;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        System.out.println("Program Menghitung Harga Tanah");

        tanah tanah = new tanah();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Luas Tanah (m2): ");
        tanah.luas = scanner.nextDouble();

        System.out.println("Harga Tanah per m2: Rp 5.000.000");
        System.out.println("Harga Total Tanah: Rp " + tanah.getHargaTotal());
    }
}