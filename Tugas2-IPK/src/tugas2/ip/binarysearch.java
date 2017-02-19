package tugas2.ip;


import java.util.Scanner;

/**
 *
 * @author diko
 */
public class binarysearch {
    Scanner scan = new Scanner(System.in);

    void mencari(double[] X) {
        int awal, akhir, tengah, n = X.length;
        double cari;
        

        System.out.println("Masukkan IPK yg ingin dicari:");
        cari = scan.nextDouble();
        awal = 0;
        akhir = n - 1;
        tengah = (awal + akhir) / 2;

        while (awal <= akhir) {
            if (X[tengah] < cari) {
                awal = tengah + 1;
            } else if (X[tengah] == cari) {
                System.out.println(cari + " Ditemukan " + " di baris ke  " + (tengah + 1) + ".");
                break;
            } else {
                akhir = tengah - 1;
            }

            tengah = (awal + akhir) / 2;
        }
        if (awal > akhir) {
            System.out.println(cari + " Data tidak ditemukan \n");
        }
 
   }

}
