import java.util.Scanner;

public class tugas1SistemTokoBuku14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenisBuku;
        int jumlahBuku;

        System.out.print("masukkan jenis buku: ");
        jenisBuku = input.nextLine();
        System.out.print("masukkan jumlah buku: ");
        jumlahBuku = input.nextInt();
        
        if (jenisBuku.equalsIgnoreCase("kamus")) {
            System.out.println("diskon sebesar 10%");
            if (jenisBuku.equalsIgnoreCase("kamus") && jumlahBuku > 2) {
                System.out.println("diskon menjadi 12% karena membeli lebih dari 2");
            } 
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            System.out.println("diskon sebesar 8%");
            if (jenisBuku.equalsIgnoreCase("novel")  && jumlahBuku > 3) {
                System.out.println("diskon menjadi 9% karena membeli lebih dari 3");
            }
        } else if (!jenisBuku.equalsIgnoreCase("kamus") && !jenisBuku.equalsIgnoreCase("novel") && jumlahBuku > 3) {
            System.out.println("mendapatkan diskon tambahan sebesar 5%");
        } else {
            System.out.println("Tidak ada tambahan diskon");
        }
    }
}