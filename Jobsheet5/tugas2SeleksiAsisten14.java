import java.util.Scanner;

public class tugas2SeleksiAsisten14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isMhsAktif, isSanksi, isSertif;
        int nilaiDasPro, nilaiWawancara;

        System.out.print("apakah anda mahasiswa aktif? (true/false): ");
        isMhsAktif = input.nextBoolean();
        System.out.print("apakah anda sedang di sanksi? (true/false): ");
        isSanksi = input.nextBoolean();

        if (isMhsAktif && !isSanksi) {
            System.out.print("nilai DasPro anda: ");
            nilaiDasPro = input.nextInt();
            System.out.print("apakah anda punya sertifikat? (true/false): ");
            isSertif = input.nextBoolean();
            if (nilaiDasPro >= 80 || isSertif) {
                System.out.println("Selamat Anda dipersilahkan mengikuti wawancara");
                System.out.print("input nilai wawancara anda: ");
                nilaiWawancara = input.nextInt();
                if (nilaiWawancara >= 75) {
                    System.out.println("SELAMAT anda LOLOS menjadi asisten praktikum");
                } else {
                    System.out.println("MOHON MAAF anda TIDAK LOLOS menjadi asisten praktikum");
                }
            } else {
                System.out.println("nilai Daspro anda < 80/anda tidak mempunyai sertifikat kompetensi");
            }
        } else {
            System.out.println("Anda bukan mahasiswa aktif/anda sedang di sanksi");
        }
    }
}
