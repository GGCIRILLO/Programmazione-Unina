/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class OrderedLinkedList {
    class Nodo {
        private Imbarcazione data;
        private Nodo next;
        
        public Nodo(Imbarcazione imb){
            this.data = imb;
            this.next = null;
        }
    }
    
    private Nodo testa;
    
    public OrderedLinkedList(){
        this.testa = null;
    }
    
    public boolean empty(){return testa==null;}
    public boolean full() {return false;}
    
    private void push(Imbarcazione e) {
        Nodo temp = new Nodo(e);
        temp.next = testa;
        testa = temp;
    }
    
    private Imbarcazione pop(){
        Imbarcazione imb = testa.data;
        testa = testa.next;
        return imb;
    }
    
    public void insert(Imbarcazione i){
        if (empty() || testa.data.compareTo(i)>=0){
            push(i);
            return;
        }
        Nodo temp = testa;
        while(temp.next != null && temp.next.data.compareTo(i)<0){
            temp = temp.next;
        }
        Nodo nuovo = new Nodo(i);
        nuovo.next = temp.next;
        temp.next = nuovo;
    }
    
    public void delete(Imbarcazione i) throws NoElementFound{
        if (testa.data.equals(i)){
            pop();
            return;
        }
        
        Nodo temp = testa;
       
        while(temp.next!=null && !temp.next.data.equals(i)){
            temp = temp.next;
        }
        if (temp.next==null){
            throw new NoElementFound("Eccezione: Nessun Imbarcazione trovata");
        }
        temp.next = temp.next.next;
    }

    private int size(){
        int n = 0;
        Nodo temp = testa;
        while (temp!=null){
            n++;
            temp = temp.next;
        }
        return n;
    }
    
    
    public Imbarcazione[] affollate(){
        int n = size();
        Imbarcazione[] imb = new Imbarcazione[n];
        Nodo temp = testa;
        if (empty()){
            return imb;
        }
        
        int max = 0;
        temp = testa;
        while (temp.next!=null){
            if (temp.data.getNumPass()>max){
                max = temp.data.getNumPass();
            }
            temp = temp.next;
        }
        
        temp = testa;
        int i=0;
        while (temp.next!=null){
            if (temp.data.getNumPass()==max){
                imb[i]=temp.data;
                i++;
            }
            temp = temp.next;
        }
        return imb;
    }

    public void print(){
        Nodo temp = testa;
        while(temp!=null){
            System.out.println(temp.data.toString());
            temp = temp.next;
        }
    }

    public int numeroContainer(){
        int n = 0;
        Nodo temp = testa;
        while (temp!=null){
            if (temp.data instanceof PortaContainer){
                PortaContainer pc = (PortaContainer) temp.data;
                n += pc.getNumCont();
            }
            temp = temp.next;
        }
        return n;
    }

    
    
    
    
    
    
    
    
    
    
}
