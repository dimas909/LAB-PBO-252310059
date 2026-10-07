package Pembelajaran_01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Latihan03 {
    public static void main(String[] args) {
        Locale indo = Locale.forLanguageTag("id-ID");
        final int HARGA = 6300;

        Scanner scanner = new Scanner(System.in);
    
        System.out.println("     TOKO SERBAGUNA IBIK");
        System.out.print("Masukan jumlah produk yang dibeli : ");
        int qty = scanner.nextInt();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)", indo);
        System.out.println(LocalDateTime.now().format(format));

        long total = (long) qty * HARGA;
        int diskon = (qty % 3 == 0) ? 5 : 0;
        long subTotal = total - (total * diskon / 100);

        System.out.printf("%-15s %-5s %-12s %s%n", "ITEM", "QTY", "HARGA", "TOTAL");
        System.out.printf("%-15s %-5d Rp %-9s Rp %s%n", "ROTI ENAK", qty,
                String.format(indo, "%,d,-", HARGA), String.format(indo, "%,d", total));
        System.out.println("Diskon    : " + diskon + "%");
        System.out.println("Sub Total : Rp " + String.format(indo, "%,d", subTotal) + ",-");

        scanner.close();
    }
}