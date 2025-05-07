/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class PilaPiatti {
    private int testa;
    private int max;
    private Piatto[] pila;
    
    public PilaPiatti(int dim){
        this.testa=0;
        this.max=dim;
        this.pila = new Piatto[dim];
    }
    
    public boolean isEmpty(){
       return testa==0;
    }
   
    public boolean isFull(){
       return testa==max;
    }
    
    public void push(Piatto p) {
        pila[testa]=p;
        testa++;
    }
    public Piatto pop() {
        return pila[--testa];
    }
    
    public Piatto top(){
        return pila[testa-1];
    }
    
    public void printPila(){
        for(int i=testa-1; i>=0; i--) 
         System.out.println(pila[i].toString()); 
    }
    
    public int calcolaSapone(){
        int somma=0;
        for(int i=testa-1; i>=0; i--){
            somma+=pila[i].saponeNecessario();
        }
        return somma;
    }
    
}
