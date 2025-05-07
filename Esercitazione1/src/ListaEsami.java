/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class ListaEsami {
    class Nodo {
        private Esame data;
        private Nodo next;
        
        public Nodo(Esame e){
            this.data = e;
            this.next = null;
        }
    }
    
    private Nodo testa;
    
    public ListaEsami(){
        this.testa = null;
    }
    
    public boolean empty(){
        return testa==null;
    }
    
    private void push(Esame e){
        Nodo temp = new Nodo(e);
        temp.next = testa;
        testa=temp;
    }
    
    private Esame pop(){
        Esame e = testa.data;
        testa = testa.next;
        return e;
    }
    
    // insert lista ordinatata per crediti
    public void insert(Esame e){
        if (empty()){
            push(e);
            return;
        }
        if (testa.data.compareTo(e)>=0){
            push(e);
            return;
        }
        Nodo temp = testa;
        while(temp.next != null && temp.next.data.compareTo(e)<0){
            temp = temp.next;
        }
        Nodo nuovo = new Nodo(e);
        nuovo.next = temp.next;
        temp.next = nuovo;

    }
    
    public void delete (Esame e) throws Esame404 {
        if (empty()){
            throw new Esame404("Esame non trovato");
        }
        if (testa.data.equals(e)){
            pop();
            return;
        }
        Nodo temp = testa;
        while(temp.next != null && !temp.next.data.equals(e)){
            temp = temp.next;
        }
        if (temp.next == null){
            throw new Esame404("Esame non trovato");
        }
        temp.next = temp.next.next;        
    }
    
    public void stampa(){
        Nodo temp = testa;
        while(temp!=null){
            System.out.println(temp.data.toString());
            temp = temp.next;
        }
    }
    
    
    public double calcoloMedia(){
        double media;
        double votoxcfu=0;
        double cfu=0;
        
        Nodo temp = testa;
        while(temp.next != null){
            cfu += temp.data.getCrediti();
            votoxcfu += temp.data.getVoto()*temp.data.getCrediti();
            temp = temp.next;
        }
        media = votoxcfu/cfu;
        return media;
    }
    
    public int cfuAccumulati(){
        int somma = 0;
        Nodo temp = testa;
        while(temp.next!=null){
            somma += temp.data.getCrediti();
        }
        return somma;
    }
    
}
