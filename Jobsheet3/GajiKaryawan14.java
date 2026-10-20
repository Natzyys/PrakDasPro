import java.util.Scanner;

public class GajiKaryawan14 {
    public static void main(String[] args) {
        
        int gajiPokok;
        double totalGaji, bonus, tunjanganTransportasi = 600000, tunjanganMakan = 400000;

        Scanner input = new Scanner(System.in);

        System.out.print("masukkan gaji karyawan :");
        gajiPokok = input.nextInt();

        bonus = 0.05 * gajiPokok;
        totalGaji = gajiPokok + bonus + tunjanganMakan + tunjanganTransportasi - (0.1 * gajiPokok);
        
        System.out.println("Bonus bulanan anda adalah = " + bonus);
        System.out.println("Gaji yang diterima adalah = " + (int)totalGaji);
    }
}