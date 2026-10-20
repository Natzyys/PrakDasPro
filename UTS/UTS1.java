import java.util.Scanner;
public class UTS1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sudut;
        String jenis;

        System.out.print("masukkan besaran sudut (derajat) : ");
        sudut = input.nextInt();

        switch (sudut) {
            case 90:
                jenis = "segitiga siku siku";
                break;
            case 60:
                jenis = "segitiga sama sisi";
                break;
            case 45:
                jenis = "segitiga sama kaki";
                break;
            default:
                jenis = "bukan segitiga";
                break;
        }
        System.out.println("jenis segitiga = " + jenis);
    }
}
