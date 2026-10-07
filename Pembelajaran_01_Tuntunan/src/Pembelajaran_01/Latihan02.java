package Pembelajaran_01;

import java.util.Scanner;

public class Latihan02 {

    static final double PI = 3.14159265358979;
    static Scanner scanner = new Scanner(System.in);

    static double luasKerucut(double r, double t) {
        double s = Math.sqrt(r * r + t * t);
        return PI * r * (r + s);
    }

    static double volumeKerucut(double r, double t) {
        return PI * r * r * t / 3;
    }

    static void hitungKerucut() {
        System.out.print("Jari-jari (r): ");
        double r = scanner.nextDouble();
        System.out.print("Tinggi (t): ");
        double t = scanner.nextDouble();
        System.out.println("Luas permukaan kerucut : " + luasKerucut(r, t));
        System.out.println("Volume kerucut         : " + volumeKerucut(r, t));
    }

    static double luasTabung(double r, double t) {
        return 2 * PI * r * (r + t);
    }

    static double volumeTabung(double r, double t) {
        return PI * r * r * t;
    }

    static void hitungTabung() {
        System.out.print("Jari-jari (r): ");
        double r = scanner.nextDouble();
        System.out.print("Tinggi (t): ");
        double t = scanner.nextDouble();
        System.out.println("Luas permukaan tabung : " + luasTabung(r, t));
        System.out.println("Volume tabung         : " + volumeTabung(r, t));
    }

    static double luasLayang(double d1, double d2) {
        return d1 * d2 / 2;
    }

    static double kelilingLayang(double a, double b) {
        return 2 * (a + b);
    }

    static void hitungLayang() {
        System.out.print("Diagonal 1: ");
        double d1 = scanner.nextDouble();
        System.out.print("Diagonal 2: ");
        double d2 = scanner.nextDouble();
        System.out.print("Sisi pendek: ");
        double a = scanner.nextDouble();
        System.out.print("Sisi panjang: ");
        double b = scanner.nextDouble();
        System.out.println("Luas layang-layang     : " + luasLayang(d1, d2));
        System.out.println("Keliling layang-layang : " + kelilingLayang(a, b));
    }

    static double luasAlas(double alas, double tinggiSegitiga) {
        return alas * tinggiSegitiga / 2;
    }

    static double luasPrisma(double a, double ts, double b, double c, double tp) {
        double kelilingAlas = a + b + c;
        return 2 * luasAlas(a, ts) + kelilingAlas * tp;
    }

    static double volumePrisma(double a, double ts, double tp) {
        return luasAlas(a, ts) * tp;
    }

    static void hitungPrisma() {
        System.out.print("Alas segitiga: ");
        double a = scanner.nextDouble();
        System.out.print("Tinggi segitiga: ");
        double ts = scanner.nextDouble();
        System.out.print("Sisi ke-2: ");
        double b = scanner.nextDouble();
        System.out.print("Sisi ke-3: ");
        double c = scanner.nextDouble();
        System.out.print("Tinggi prisma: ");
        double tp = scanner.nextDouble();
        System.out.println("Luas permukaan prisma : " + luasPrisma(a, ts, b, c, tp));
        System.out.println("Volume prisma         : " + volumePrisma(a, ts, tp));
    }

    public static void main(String[] args) {
        System.out.print("Masukkan NPM: ");
        String npm = scanner.next();
        int digitTerakhir = Character.getNumericValue(npm.charAt(npm.length() - 1));

        if (digitTerakhir % 2 == 1) {
            System.out.println("-- Kerucut --");
            hitungKerucut();
            System.out.println("-- Tabung --");
            hitungTabung();
        } else {
            System.out.println("-- Layang-layang --");
            hitungLayang();
            System.out.println("-- Prisma Segitiga --");
            hitungPrisma();
        }
        scanner.close();
    }
}
