
package tugas2.ip;

/**
 *
 * @author diko
 */
public class sorting {
    
    void mengurutkan(double[] X){
        for (int i = 0; i < X.length; i++) {
            for (int j = i + 1; j < X.length; j++){
                if (X[i] > X[j]){
                    double temp = X[i];
                    X[i] = X[j];
                    X[j] = temp;
                }
            }
        }
    }
}
