
package queuelinkedlist;

class Node{
    private String element;
    private Node next;
    
    public String getElement(){
        return element;
    }
    public void setElement(String e){
        element = e;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node n){
        next = n;
    }
    Node(String e, Node n){
        element = e;
        next = n;
    }
    
}
class Queue{
    Node head;
    Node tail; 
    
    boolean isEmpty(){
      return (head==null);
    }
    
    Queue(){
        head = null;
        tail = null;
    }
    public void enqueue(String data){
        Node temp = new Node(data, null);
        if(isEmpty()){
            head = temp;
            tail = temp;
        }
        else{
            tail.setNext(temp);
            tail = temp;
        }
    }
    public String dequeue(){
        String temp;
        temp = head.getElement();
        head = head.getNext();
        return temp;
    }
}