package Pembelajaran_01;

import java.util.Scanner;

public class Latihan04{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan teks: ");
        String teks = scanner.nextLine();

        System.out.println("Hasil huruf besar: " + teks.toUpperCase());

        scanner.close();
    }
}