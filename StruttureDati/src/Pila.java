/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class Pila {
    private int testa;
    private int max;
    private int[] c;
    
    public Pila(int dim){
        this.testa=0;
        this.max=dim;
        this.c = new int[max];
    }
    public boolean empty(){
        return testa==0;
    }
    public boolean full(){
        return testa==max;
    }
    public void push(int e){
        c[testa++]=e;
    }
    public int pop(){
        return c[--testa];
    }
    public boolean cerca(int e){
        for(int i=testa-1;i>=0;i--){
            if (c[i]==e){
                return true;
            }
        }
        return false;
    }
    public int top(){
        return c[testa-1];
    }
    public void print(){
        for(int i=testa-1;i>=0;i--){
            System.out.println(c[i]);
        }
    }
}
