/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class LinkedList {
    class Nodo {
        private String data;
        private Nodo next;
        
        private Nodo(String s){
            this.data=s;
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
    public void push(String s){
        Nodo q = new Nodo(s);
        q.next = testa;
        testa=q;
    }
    public String pop(){
        String s = testa.data;
        testa = testa.next;
        return s;
    }
    public int contaOccorrenze(String s){
       Nodo temp = testa;
       int n = 0;
       while(temp!=null){
           if (temp.data.equals(s)){
               n++;
           }
           temp = temp.next;
       }
       return n;
    }
}
