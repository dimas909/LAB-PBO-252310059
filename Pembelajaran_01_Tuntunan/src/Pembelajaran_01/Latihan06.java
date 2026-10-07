package Pembelajaran_01;

import java.util.Scanner;

public class Latihan06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama lengkap: ");
        String nama = scanner.nextLine();

        String hasil = nama.replaceAll("[aiueoAIUEO]", "X");
        System.out.println("Hasil: " + hasil);

        scanner.close();
    }
}