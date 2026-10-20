import java.util.Scanner;

public class aksesWifiKampus14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mahasiswa, dosen, akunDiblokir;

        System.out.print("apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = sc.nextBoolean();
        System.out.print("apakah pengguna dosen? (true/false): ");
        dosen = sc.nextBoolean();
        System.out.print("apakah akun sedang Diblokir? (true/false): ");
        akunDiblokir = sc.nextBoolean();

        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println("akses wifi diberikan");
        } else {
            System.out.println("akses wifi di tolak");
        }
    }
}
