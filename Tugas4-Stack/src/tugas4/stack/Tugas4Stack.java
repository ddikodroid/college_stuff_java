package tugas4.stack;
import java.util.Scanner;
import java.util.Stack;

public class Tugas4Stack {

    
    public static void main(String[] args) {
    
    Stack kandang = new Stack();
    Scanner scan = new Scanner(System.in);
        System.out.print("Apa hewan ternak yang mau dimasukkan ke kandang?\n(Maksimal 5 hewan ternak)");
        System.out.println("\n1.Ayam   6.Kambing\n2.Domba  7.Sapi\n3.Angsa  8.Bebek\n4.Babi   9.Kerbau\n5.Kuda  10.Keledai");
        
        for(int i=0; i<5;i++){
            System.out.print("Pilih nomor: ");
            int hewan = scan.nextInt();
            switch(hewan){
            case 1: kandang.push("Ayam"); break;
            case 2: kandang.push("Domba"); break;
            case 3: kandang.push("Angsa"); break;
            case 4: kandang.push("Babi"); break;
            case 5: kandang.push("Kuda"); break;
            case 6: kandang.push("Kambing"); break;
            case 7: kandang.push("Sapi"); break;
            case 8: kandang.push("Bebek"); break;
            case 9: kandang.push("Kerbau"); break;
            case 10: kandang.push("Keledai"); break;
            default: System.out.println("Maaf, hanya tersedia 10 jenis hewan ternak.");
            }
            if(i==5){
                System.out.print("Kandang telah terisi penuh.");
            }
        }
        
        System.out.print("Apa yang ingin kamu lakukan selanjutnya?");
        System.out.println("\n1.Mengecek isi kandang\n2.Mengeluarkan hewan ternak\n3.Keluar program");
        System.out.print("Pilih aksi: ");
        boolean p = true;
            while(p){
                 int pilih = scan.nextInt();  
                    if(pilih !=3){
                    if(pilih == 1){
                        System.out.println("Kandang terisi oleh:" + kandang);
                        System.out.print("Pilih aksi: ");
                    }
                    if(pilih == 2){
                        kandang.pop();
                        System.out.print("Pilih aksi: ");
                    }
                    //pilih = scan.nextInt();
                }
                else break;
                }
                
            }
    }    

    

