import java.util.Scanner;

public class Tugas1Pemilihan14 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("apakah UKT sudah lunas? (true/false): ");

        boolean uktLunas = input.nextBoolean();
        // String pesan = "Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA";

        String pesan = (uktLunas) ? "Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA" : "Silahkan melunasi pembayaran UKT terlebih dahulu"; 
        System.out.println(pesan);
    }
}