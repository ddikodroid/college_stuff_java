package tugas2.ip;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author diko
 */
public class Tugas2Ip {

    public static Scanner scan = new Scanner(System.in); //for input
    
    public static Random rand = new Random(); //generate random number
    
    public static void main(String[] args) {
        
        int n;
        
        //input n numbers
        System.out.println("Masukkan banyaknya data IPK:");
        n = scan.nextInt();
         
        //declare array X
        double X[] = new double[n];
        
        //generating random value ipk as much as n number(s)
        for(int i=0; i<n; i++){
            X[i] = rand.nextDouble()*4.00;
            X[i] = Math.round(X[i]*100)/100.0d;
        }
        
        //sorting process
        sorting X1 = new sorting();
        X1.mengurutkan(X);
        
        //print in ascending order
        print X2 = new print();
        X2.mencetak(X);
        
        //performing binary search
        binarysearch X3 = new binarysearch();
        X3.mencari(X);
        
    }
}
            

