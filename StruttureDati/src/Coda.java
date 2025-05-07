/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class Coda {
    private int testa;
    private int coda;
    private int riemp;
    private int max;
    private int[] c;
    
    public Coda(int dim){
        this.max=dim;
        this.coda=0;
        this.testa=0;
        this.riemp=0;
        this.c = new int[max];
    }
    
    public boolean empty(){
        return riemp==0;
    }
    public boolean full(){
        return riemp==max;
    }
    public void append(int e){
        c[coda]=e;
        coda=(coda+1)%max;
        riemp++;
    }
    public int pop(){
        int e = c[testa];
        testa=(testa+1)%max;
        riemp--;
        return e;
    }
    public void print(){
        for (int i=0; i<riemp;i++){
            System.out.println(c[(testa+i)%max]);
        }
    }
}
