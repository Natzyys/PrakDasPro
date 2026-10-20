import java.util.Scanner;

public class nestedAksesLab14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mahasiswaAktif, sedangDisanksi, punyaIzinDosen, asistenLab;

        System.out.print("apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.print("apakah sedang disanksi? (true/false): ");
        sedangDisanksi = sc.nextBoolean();
        System.out.print("apakah punya izin dosen? (true/false): ");
        punyaIzinDosen = sc.nextBoolean();
        System.out.print("apakah asisten lab? (true/false): ");
        asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses Laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status sasisten lab");
            }
        } else {
            System.out.println("Akses ditolak: mahasiswa tidak memenuhi syarat");
        }
    }
}
