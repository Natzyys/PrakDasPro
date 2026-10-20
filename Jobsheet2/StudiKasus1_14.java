import java.util.Scanner;

public class StudiKasus1_14 {
    public static void main(String[] args) {
        
        // int tambahan_uang_anak ,gaji_pokok = 5000000, jml_anak = 4, tunjangan_anak = 100000, gaji_kotor;
        // double simpanan_dana_pensiun = 0.10, potongan_asuransi, sisa_dana; 

        // tambahan_uang_anak = jml_anak * tunjangan_anak;
        // gaji_kotor = gaji_pokok + tambahan_uang_anak;
        // potongan_asuransi = gaji_pokok * simpanan_dana_pensiun;
        // sisa_dana = gaji_kotor - potongan_asuransi;
        
        // System.out.println("gaji pokok + tunjangan anak : " + gaji_pokok + " + " + tambahan_uang_anak + " = " + gaji_kotor);
        // System.out.println("dana yang bisa ditabung setiap bulan : " + gaji_kotor + " - " + potongan_asuransi + " = " + sisa_dana);
        
        StudiKasusModifikasi();
    }

    public static void StudiKasusModifikasi() {
        int tambahan_uang_anak, gaji_pokok, tunjangan_anak, jml_anak, gaji_kotor; 
        double simpanan_dana_pensiun, potongan_asuransi, sisa_dana;

        Scanner input = new Scanner(System.in);

        System.out.print("masukkan gaji pokok : ");
        gaji_pokok = input.nextInt();

        System.out.print("masukkan tunjangan per anak : ");
        tunjangan_anak = input.nextInt();

        System.out.print("masukkan jumlah anak : ");
        jml_anak = input.nextInt();

        System.out.print("masukkan dana pensiun : ");
        simpanan_dana_pensiun = input.nextDouble();

        tambahan_uang_anak = tunjangan_anak * jml_anak;
        gaji_kotor = gaji_pokok + tambahan_uang_anak;
        potongan_asuransi = gaji_pokok * simpanan_dana_pensiun;
        sisa_dana = gaji_kotor - potongan_asuransi;

        System.out.println(sisa_dana);
        System.out.println("gaji kotor : " + gaji_pokok + " + " + tambahan_uang_anak + " = " + gaji_kotor);
        System.out.print("sisa dana : " + gaji_kotor + " - " + potongan_asuransi + " = " + sisa_dana);



    }
}

