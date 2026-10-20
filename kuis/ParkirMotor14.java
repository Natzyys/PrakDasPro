import java.util.Scanner; 

public class ParkirMotor14 {
    public static void main(String[] args) {
        double totalBiayaParkir;
        int lamaParkir, parkir1Jam = 2000, parkir = 1000;
        
        System.out.println("*************PARKIR MOTOR KAMPUS*************");
        
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan lama parkir (jam) :");
        lamaParkir = input.nextInt();
        
        totalBiayaParkir = parkir1Jam + (lamaParkir - 1) * parkir;
        
        System.out.println("total biaya parkir = " + totalBiayaParkir);
        
        konversiDetik();
    }
    
    public static void konversiDetik() {
        int jam = 3600, detik, menit = 60, sisaDetik;
        
        System.out.println("\n*************Konversi Detik*************");
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan jumlah detik :");
        detik = input.nextInt();

        jam = detik / 3600;
        menit = detik % 3600 / 60;
        sisaDetik = detik % 3600 % 60;
        System.out.println("jumlah jam : " + jam + " jam");
        System.out.println("jumlah menit : " + menit + " menit");
        System.out.println("sisa detik : " + sisaDetik + " detik");
    }
}



