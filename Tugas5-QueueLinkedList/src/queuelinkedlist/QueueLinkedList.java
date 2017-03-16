/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuelinkedlist;

import java.util.*;

/**
 *
 * @author diko
 */
public class QueueLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue Q = new Queue();
        Queue Q1 = new Queue();
        Queue Q2 = new Queue();
        System.out.print("Banyaknya data: ");
        int max = scan.nextInt();
        
        
        for(int i=0 ; i<max ; i++){
            Q.enqueue(scan.next());
        }
       
        if(max%2==0){
            for(int j=0; j<max/2 ; j++){
                Q1.enqueue(Q.dequeue());
            }
            for(int k=max/2; k<max ; k++){
                Q2.enqueue(Q.dequeue());
            }
        }
        if(max%2==1){
            for(int j=0; j<max/2 ; j++){
                Q1.enqueue(Q.dequeue());
            }
            Q.dequeue();
            for(int k=max/2+1; k<max ; k++){
                Q2.enqueue(Q.dequeue());
            }
        }
        System.out.print("Queue 1: ");
        while(!Q1.isEmpty()){
        System.out.print(" " + Q1.dequeue());
        }
        System.out.println();
        
        System.out.print("Queue 2: ");
        while(!Q2.isEmpty()){
        System.out.print(" " + Q2.dequeue());
        }
        
    }
    
}
