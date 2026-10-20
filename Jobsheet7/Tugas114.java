import java.util.Scanner;

public class Tugas114 {
    public static void main(String[] args) {
        System.out.println("===Catatan penjualan tiket===");
        diskon();
    }

    public static void diskon() {
        Scanner input = new Scanner(System.in);
        int hargaTiket = 50000;
        int totalTiket = 0;
        int totalHarga = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            int jumTiket = input.nextInt();

            if (jumTiket < 0) {
                System.out.println("Silahkan masukkan jumlah yang valid!");
                continue;
            }

            if (jumTiket == 0) {
                break;
            }

            int harga = jumTiket * hargaTiket;
            if (jumTiket > 10) {
                System.out.println("anda mendapatkan diskon 15%");
                harga = harga * 85 / 100;
            } else if (jumTiket > 4) {
                System.out.println("anda mendapatkan diskon 10%");
                harga = harga * 90 / 100;
            }
            System.out.println("harga yang dibayar: Rp" + harga);

            totalTiket += jumTiket;
            totalHarga += harga;
        }

        System.out.println("total tiket yang terjual: " + totalTiket + " tiket");
        System.out.println("total penjualan harga tiket 1 hari: Rp" + totalHarga);
    }
}