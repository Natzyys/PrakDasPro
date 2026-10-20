import java.util.Scanner;

public class CicilanLaptop14 {
    public static void main(String[] args) {

    double x, y, z, sisa_harga, bunga, cicilan_pokok, cicilan_bulanan;
    Scanner input = new Scanner(System.in);

    System.out.print("masukkan harga laptop :");
    x = input.nextFloat();
    System.out.print("masukkan pembayaran uang muka :");
    y = input.nextFloat();
    System.out.print("masukkan waktu perbulan :");
    z = input.nextFloat();

    sisa_harga = x - y;
    bunga = 0.02 * sisa_harga;
    cicilan_pokok = sisa_harga / z;
    cicilan_bulanan = cicilan_pokok + bunga;
    
    System.out.println("cicilan_bulanan = " + cicilan_bulanan);
    

    }
}
