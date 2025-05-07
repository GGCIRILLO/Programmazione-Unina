/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class CodaVeicoli {
    
    private int testa;
    private int coda;
    private int nelem;
    private int max;
    private Veicolo[] veicoli;
    
    public CodaVeicoli(){
        this.max=5;
        this.coda=0;
        this.nelem=0;
        this.testa=0;
        this.veicoli = new Veicolo[max];
    }
    
    public void append(Veicolo e){
        veicoli[coda]=e;
        coda=(coda+1)%max;
        nelem++;
    }
    
    public Veicolo pop(){
        Veicolo e = veicoli[testa];
        testa=(testa+1)%max;
        nelem--;
        return e;
    }
    
    public boolean isEmpty(){
        return nelem==0;
    }
    
    public boolean isFull(){
        return nelem==max;
    }
    
    public void printCoda() {
        for(int i=0; i<nelem; i++) {
            System.out.println(veicoli[(testa+i)%max]);
        }
    }
    
    
    
}
