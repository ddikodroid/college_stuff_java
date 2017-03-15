package tugas5.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;


public class Tugas5Queue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        Queue Q = new LinkedList();
        Queue Q1 = new LinkedList();
        Queue Q2 = new LinkedList();
        
        System.out.print("How many data: ");
        int maks = scan.nextInt();
        
        System.out.print("Input the data: ");
        
        //for random input
        /*for(int i=0 ; i<maks ; i++){
            char alp=(char)(r.nextInt(26)+65);
            Q.add(alp);
        } */
        
        
        //for input-by-user
        for(int i=1 ; i<=maks ; i++){
            Q.add(scan.next());
        }    
        
        System.out.println("Full Queue: "+Q);
        
        if(maks%2==1){
            for(int j1=0 ; j1< maks/2 ; j1++){
                Q1.add(Q.poll());
            }
            Q.poll();
            for(int j2=maks/2 +1 ; j2<maks ; j2++){
                Q2.add(Q.poll());
            }
        }
        else if(maks%2==0){
            for(int k1=0 ; k1< maks/2 ; k1++){
                Q1.add(Q.poll());
            }
            for(int k2=maks/2 ; k2<maks ; k2++){
                Q2.add(Q.poll());
            }
        }
        
            System.out.println("Divide into two...");
            System.out.println("Queue 1: "+Q1);
            System.out.println("Queue 2: "+Q2);
  
    }
    
}