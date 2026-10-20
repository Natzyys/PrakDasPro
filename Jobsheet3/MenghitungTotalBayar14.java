import java.util.Scanner;

public class MenghitungTotalBayar14 {
    public static void main(String[] args) {
        
        double harga;
        double potongan, jml_bayar, diskon = 0.15;
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan harga = ");
        harga = input.nextInt();

        potongan = diskon * harga;
        jml_bayar = harga - potongan;

        System.out.println(harga + " - " + potongan);
        System.out.println("total pembayaran = " + jml_bayar);
    }
}
