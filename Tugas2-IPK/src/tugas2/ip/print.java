package tugas2.ip;


import java.text.*;

/**
 *
 * @author diko
 */
public class print {
    
    void mencetak(double[] X){
        System.out.println("Data IPK yg telah diurutkan:");

        for (int i = 0; i < X.length; i++) {
               System.out.println(X[i]);
        }
    }
}
