package Pembelajaran_01;

import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Usia      : ");
        String usia = scanner.next();
        System.out.print("Masukkan Firstname : ");
        String firstname = scanner.next();
        System.out.print("Masukkan Lastname  : ");
        String lastname = scanner.next();
        System.out.print("Masukkan NPM       : ");
        String npm = scanner.next();

        String hasil = usia.concat(firstname).concat(lastname).concat(npm);
        System.out.println("Output: " + hasil);

        scanner.close();
    }
}
