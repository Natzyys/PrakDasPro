import java.util.Scanner;

public class BiayaCetakDokumen14 {
    public static void main(String[] args) {
        
        int x, biaya_cetak = 500, biaya_jilid = 5000, total_biaya;
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan banyaknya lembaran jilid :");
        x = input.nextInt();

        total_biaya = x * biaya_cetak + biaya_jilid;

        System.out.println("total biaya = " + total_biaya);

    }
}
