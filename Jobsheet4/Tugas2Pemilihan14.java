import java.util.Scanner;

public class Tugas2Pemilihan14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahSks;
        System.out.println("--- Validasi Jumlah SKS ---");
        System.out.print("Masukkan jumlah SKS: ");
        jumlahSks = input.nextInt();

        if (jumlahSks <= 24) {
            System.out.println("KRS valid");
        } else {
            System.out.println("KRS melebihi batas");
        }
    }
    
}
