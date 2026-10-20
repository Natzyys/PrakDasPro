import java.util.Scanner;

public class StudiKasus2_14 {
    public static void main(String[] args) {
        
        int panjang_tanah, lebar_tanah, sisi_persegi, luas_tanah ; 
        double PHI = 3.14, sisa_tanah, luas_lingkaran, luas_persegi, D_lingkaran; 
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang tanah : ");
        panjang_tanah = input.nextInt();
        System.out.print("Masukkan lebar tanah : ");
        lebar_tanah = input.nextInt();
        System.out.print("Masukkan diameter lingkaran : ");
        D_lingkaran = input.nextInt();
        System.out.print("Masukkan sisi persegi : ");
        sisi_persegi = input.nextInt();

        luas_tanah = panjang_tanah * lebar_tanah;        
        luas_lingkaran = PHI * (D_lingkaran / 2) * (D_lingkaran / 2);
        luas_persegi = sisi_persegi * sisi_persegi;
        
        sisa_tanah = luas_tanah - luas_lingkaran - luas_persegi;

        System.out.println("sisa tanah yang tidak digunakan : " + sisa_tanah);

    }
}
