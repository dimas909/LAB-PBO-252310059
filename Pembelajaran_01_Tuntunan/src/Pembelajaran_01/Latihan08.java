package Pembelajaran_01;

import java.util.Scanner;

public class Latihan08 {
    static Student myBio = new Student();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NPM          : ");
        Integer npm = myBio.getNPM(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Masukkan Nama Lengkap : ");
        String nama = myBio.getFullname(scanner.nextLine());

        System.out.print("Masukkan Nama Kelas   : ");
        String kelas = myBio.getClassName(scanner.nextLine());

        System.out.print("Masukkan Semester     : ");
        Integer semester = myBio.getSemester(scanner.nextInt());

        System.out.print("Masukkan IPK          : ");
        Float ipk = myBio.getGPA(scanner.nextFloat());

        System.out.println("NPM          : " + npm);
        System.out.println("Nama Lengkap : " + nama);
        System.out.println("Nama Kelas   : " + kelas);
        System.out.println("Semester     : " + semester);
        System.out.println("IPK          : " + ipk);

        scanner.close();
    }
}