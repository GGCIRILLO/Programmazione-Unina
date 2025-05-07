
import java.util.NoSuchElementException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class OrderedLinkedList {
    class Nodo{
        private Pokemon data;
        private Nodo next;
        
        public Nodo(Pokemon p){
            this.data=p;
            this.next=null;
        }
    }
    
    private Nodo testa;
    public OrderedLinkedList(){
        this.testa=null;
    }
    
    public boolean empty(){
        return testa==null;
    }
    
    private void push(Pokemon p){
        Nodo nuovo = new Nodo(p);
        nuovo.next = testa;
        testa = nuovo;
    }
    private Pokemon pop(){
        Pokemon p = testa.data;
        testa = testa.next;
        return p;
    }
    
    public void inserisci(Pokemon p){
        if (empty()|| testa.data.compareTo(p)>=0){
            push(p);
            return;
        }
        Nodo temp = testa;
        while( temp.next != null && temp.next.data.compareTo(p)<0){
            temp = temp.next;
        }
        Nodo nuovo = new Nodo(p);
        nuovo.next = temp.next;
        temp.next = nuovo;
    }
    
    public void rimuovi(Pokemon p) throws NoSuchElementException {
        if (empty()){
            throw new NoSuchElementException("Lista vuota");
        }
        if (testa.data.equals(p)){
            pop();
            return;
        }
        Nodo temp = testa;
        while(temp.next!=null && !temp.next.data.equals(p)){
            temp=temp.next;
        }
        if (temp.next==null){
            throw new NoSuchElementException("Elemento non trovato");
        }
        temp.next = temp.next.next;
    }
    
    public boolean cerca(Pokemon p){
        Nodo temp = testa;
        while(temp!=null && temp.data.compareTo(p)<=0){
            if (temp.data.equals(p)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    
    public int contaPokemonPerTipo(String tipo){
        Nodo temp = testa;
        int n = 0;
        while(temp !=null){
            if (temp.data.getClass().getName().equals(tipo)){
                n++;
            }
            temp = temp.next;
        }
        return n;
    }
    
    public double calcolaLivelloMedio(){
        if (empty()){
            return 0;
        }
        Nodo temp = testa;
        int somma= 0;
        int size = 0;
        while(temp !=null){
            somma += temp.data.getLivello();
            size++;
            temp = temp.next;
        }
        return somma/size;
    }
    
    public void print(){
        Nodo temp = testa;
        while(temp!=null){
            System.out.println(temp.data.toString());
            temp = temp.next;
        }
    }

    // ricerca 
    

    
}
