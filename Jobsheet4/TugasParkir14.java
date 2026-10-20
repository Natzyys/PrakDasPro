import java.util.Scanner;

public class TugasParkir14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Sistem Penghitungan Tarif Parkir ---");
        System.out.print("Masukkan lama parkir (dalam jam): ");
        int lamaParkir = input.nextInt();

        int totalTarif = 0;

        if (lamaParkir <= 0) {
            System.out.println("Lama parkir tidak valid!");
        } else if (lamaParkir <= 2) {
            totalTarif = 2000;
            System.out.println("Total tarif parkir: Rp " + totalTarif);
        } else {
            totalTarif = 2000 + ((lamaParkir - 2) * 1000);
            System.out.println("Total tarif parkir: Rp " + totalTarif);
        }
    }   
}
