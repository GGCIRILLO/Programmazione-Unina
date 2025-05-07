/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class PilaFilm {
    private int testa;
    private int max;
    private Film[] pila;
    
    public PilaFilm(int dim){
        this.testa=0;
        this.max=dim;
        this.pila = new Film[dim];
    }
    
    public boolean isEmpty(){
        return testa==0;
    }
    public boolean isFull(){
        return testa==max;
    }
    
    public void append(Film f){
        pila[testa++]=f;
    }
    
    public Film pop(){
        return pila[--testa];
    }
    
    public Film top(){
        return pila[testa-1];
    }
    
    public void print(){
        for (int i=testa-1;i>=0;i--){
            System.out.println(pila[i].toString());
        }
    }
    public int contaFilmGenere(String genere){
        int n=0;
        for (int i=testa-1;i>=0;i--){
            if (pila[i].getClass().getName().equals(genere)){
                n++;
            }
        }
        return n;
    }
    
    public double annoMedio(){
        int anni = 0;
        if (testa==0){
            return 0;
        }
        for (int i=testa-1;i>=0;i--){
          anni+=pila[i].getAnno();
        }
        return (double)anni/testa;
    }
    
}
