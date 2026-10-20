import java.util.Scanner;

public class Tugas114 {
    public static void main(String[] args) {
        System.out.println("===Catatan penjualan tiket===");
        diskon();
    }

    public static void diskon() {
        int hargaTiket = 50000;
        boolean loop = true;
        while (loop) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan jumlah tiket: ");
            int jumTiket = input.nextInt();

            if (jumTiket < 0) {
                System.out.println("Silahkan masukkan jumlah yang valid!");
                continue;
            }

            if (jumTiket > 4) {
                if (jumTiket > 10) {
                    System.out.println("anda mendapatkan diskon 15%");
                    break;
                }
                System.out.println("anda mendapatkan diskon 10%");
            }
            System.out.println("tiket yang terjual: " + jumTiket + " tiket");
            System.out.println("penjualan harga tiket 1 hari: Rp" + jumTiket*hargaTiket);
        loop = false;
        }
    }
}
