/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.ip;

/**
 *
 * @author diko
 */
public class sorting2 {
    public static void mengurutkansecaracepat(double[] X, int left,int right){
        int i=left,j=right;
        double tmp;
        double pivot = X[(left+right)/2];
        
        while(i<=j){
            while (X[i] < pivot)
                  i++;
            while (X[j] > pivot)
                  j--;
            if (i <= j) {
                  tmp = X[i];
                  X[i] = X[j];
                  X[j] = tmp;
                  i++;
                  j--;
            }
        }
        
        if (left < j)
            mengurutkansecaracepat(X, left, j);
        if (i < right)
            mengurutkansecaracepat(X, i, right);
    }
    
}
