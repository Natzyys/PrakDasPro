import java.util.Scanner;

public class UTS14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sudut pertama (derajat): ");
        double s1 = scanner.nextDouble();
        
        System.out.print("Masukkan sudut kedua (derajat): ");
        double s2 = scanner.nextDouble();
        
        System.out.print("Masukkan sudut ketiga (derajat): ");
        double s3 = scanner.nextDouble();

        String hasil = tentukanJenisSegitiga(s1, s2, s3);
        System.out.println("Jenis Segitiga: " + hasil);

        scanner.close();
    }
        public static String tentukanJenisSegitiga(double sudut1, double sudut2, double sudut3) {
        if ((sudut1 + sudut2 + sudut3 != 180) || (sudut1 <= 0 || sudut2 <= 0 || sudut3 <= 0)) {
            return "Bukan Segitiga";
        }
        if (sudut1 == sudut2 && sudut2 == sudut3) {
            return "Segitiga Sama Sisi";
        }
        else if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90) {
            return "Segitiga Siku-siku";
        }
        else if (sudut1 == sudut2 || sudut2 == sudut3 || sudut1 == sudut3) {
            return "Segitiga Sama Kaki";
        }
        else {
            return "Segitiga Sembarang (Lancip / Tumpul)";
        }
    }
}