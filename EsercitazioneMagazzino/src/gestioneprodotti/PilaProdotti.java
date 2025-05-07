/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioneprodotti;

/**
 *
 * @author luigicirillo
 */
public class PilaProdotti {
    private int testa;
    private int max ;
    private Prodotto[] pila;
    
    public PilaProdotti(){
        this.testa=0;
        this.max=50;
        this.pila = new Prodotto[max];
    }
    public boolean empty(){
        return testa==0;
    }
    public boolean full(){
        return testa==max;
    }
    public void append(Prodotto p) throws PilaException {
        if (full()){
            throw new PilaException("Pila piena");
        }
        pila[testa++]=p;
    }
    public Prodotto pop(){
        return pila[--testa];
    }
    
    public Prodotto top(){
        return pila[testa-1];
    }
    public int getTesta(){
        return this.testa;
    }
    
    public void deleteinpos(int pos) throws PilaException {
        if (pos>=testa){
            throw new PilaException("Posizione non esistente");
        }
        for (int i = pos; i < testa-1; i++) {
            pila[i]=pila[i+1];
        }
        testa--;
        
    }

    public void print() {
        for (int i = 0; i < testa; i++) {
            System.out.println(pila[i].toString());
        }
    }
    
    public boolean searchNome(String nome){
        for (int i = 0; i < testa; i++) {
            if (pila[i].getNome().equals(nome)){
                return true;
            }
        }
        return false;
    }
    public boolean searchCodice(String codice){
        for (int i = 0; i < testa; i++) {
            if (pila[i].getCodice().equals(codice)){
                return true;
            }
        }
        return false;
    }
        
}
