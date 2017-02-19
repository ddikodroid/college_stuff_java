package testing;

import java.util.*;
public class Ramalan {

    
    
    public static void main(String[] args) {
        String sifatbaik[] = {"Cerdas" , "Pintar" , "Pandai" , "Dermawan" , "Jenius" , "Tekun" , "Rajin" , "Bijaksana" , "Amanah" , "Teliti"};
        String sifatburuk[] = {"Berburuk Sangka" , "Tidak Sopan" , "Emosional" , "Keras Kepala" , "Sombong" , "Jorok" , "Gegabah" , "Kasar" , "Penakut" , "Tidak Tahu Malu"}; 
                
        String nama;
        int tgl, bulan, tahun;
        Scanner scan= new Scanner(System.in);
        System.out.println("Masukkan nama Anda:");
        nama = scan.nextLine();
        System.out.println("Masukkan tanggal lahir Anda");
        tgl = scan.nextInt();
        System.out.println("Masukkan bulan lahir Anda (Dengan angka)");
        bulan = scan.nextInt();
        System.out.println("Masukkan tahun lahir Anda");
        tahun = scan.nextInt();
        
        
        System.out.println("Anda Mempunyai Sifat " + sifatbaik[nama.length()%10] + ", Namun Anda Juga Mempunyai Sifat " + sifatburuk[(tgl+bulan+tahun)%10] + ".");
    }
    
}
