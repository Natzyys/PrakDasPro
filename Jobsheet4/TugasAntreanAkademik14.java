import java.util.Scanner;

public class TugasAntreanAkademik14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kode;

        System.out.print("--- Jenis Layanan ---\n1. Legalisir Ijazah\n2. Surat Keterangan Aktif Kuliah\n3. Pembayaran UKT\n4. Pengajuan Cuti Akademik\nPilih Layanan (1-4): ");
        kode = input.nextInt();
        switch (kode) {
            case 1:
                System.out.println("Layanan Legalisir ijazah");
                System.out.println("Loket A");
                break;
            case 2:
                System.out.println("Layanan Surat Keterangan Aktif Kuliah");
                System.out.println("Loket B");
                break;
            case 3:
                System.out.println("Layanan Pembayaran UKT");
                System.out.println("Loket C");
                break;
            case 4:
                System.out.println("Layanan Pengajuan Cuti Akademik");
                System.out.println("Loket D");
                break;
            default:
                System.out.println("layanan tidak tersedia");
                break;
        }
    }   
}
