/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class LinkedList {
    class Nodo{
        private int data;
        private Nodo next;
        
        Nodo(int a){
            this.data=a;
            this.next=null;
        }
    }
    private Nodo testa;
    public LinkedList(){
        this.testa=null;
    }
    public boolean empty(){
        return testa==null;
    }
    private void push(int s){
        Nodo q = new Nodo(s);
        q.next = testa;
        testa = q;
    }
    public int pop(){
        int e = testa.data;
        testa = testa.next;
        return e;
    }
    public void append(int e){
        if (empty()){
            push(e);
            return;
        }
        Nodo temp = testa;
        while(temp.next!=null){
            temp = temp.next;
        }
        Nodo nuovo = new Nodo(e);
        temp.next=nuovo;
    }
    public void inserisci(int e){
        if(empty()||testa.data<e){
            push(e);
            return;
        }
        Nodo temp = testa;
        while(temp.next!=null && temp.next.data>=e){
            temp = temp.next;
        }
        Nodo q = new Nodo(e);
        q.next = temp.next;
        temp.next=q;
    }
    public void rimuovi(int e){
        if (empty()){
            return;
        }
        if (testa.data==e){
            pop();
            return;
        }
        Nodo temp = testa;
        while(temp.next!=null && temp.next.data!=e){
            temp = temp.next;
        }
        if (temp.next==null){
            return;
        }
        temp.next = temp.next.next;
    }
    public boolean cerca(int e){
        Nodo temp = testa;
        while(temp!=null){
            if(temp.data==e){
                return true;
            }
        }
        return false;
    }
    
    public void print(){
        Nodo temp = testa;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    
}
