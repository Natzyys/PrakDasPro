import java.util.Scanner;

public class MenghitungLuasPersegiPanjang14 {
    public static void main(String[] args) {

        int panjang, lebar, luas;
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan panjang persegi :");
        panjang = input.nextInt();

        System.out.print("masukkan lebar persegi :");
        lebar = input.nextInt();

        luas = panjang * lebar;

        System.out.println("luas persegi panjang = " + luas);

    }
}
