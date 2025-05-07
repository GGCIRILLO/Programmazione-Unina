/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class CodaCircolare {
    private int testa;
    private int coda;
    private int num;
    private int max;
    private Ospite[] ospiti;
    
    public CodaCircolare(int dim){
        this.testa=0;
        this.coda=0;
        this.num=0;
        this.max=dim;
        this.ospiti = new Ospite[dim];
    }
    
    public int getNum(){
        return this.num;
    }
    
    public void append(Ospite o){
        ospiti[coda]=o;
        coda = (coda+1)%max;
        num++;
    }
    
    public Ospite peek(){
        return ospiti[testa];
    }
    
    public Ospite pop(){
        Ospite o = ospiti[testa];
        testa=(testa+1)%max;
        num--;
        return o;
    }
    
    public boolean empty(){
        return num==0;
    }
    public boolean full(){
        return num==max;
    }
    
    public void print(){
        for (int i=0;i<num;i++){
            System.out.println(ospiti[(testa+i)%max].toString());
        }
    }
    
}
