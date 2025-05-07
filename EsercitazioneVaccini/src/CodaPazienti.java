/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class CodaPazienti {
    private int testa;
    private int coda;
    private int max;
    private int num;
    private Paziente[] pazienti;
    
    public CodaPazienti(int dim){
        this.max=dim;
        this.testa=0;
        this.coda=0;
        this.num=0;
        this.pazienti= new Paziente[dim];
    }
    
    public boolean empty(){
        return num==0;
    }
    public boolean full(){
        return num==max;
    }
    public void append(Paziente p){
        pazienti[coda]=p;
        coda=(coda+1)%max;
        num++;
    }
    public Paziente pop(){
        var p = pazienti[testa];
        testa=(testa+1)%max;
        num--;
        return p;
    }
    public void print(){
        for (int i=0;i<num;i++){
            System.out.println(pazienti[i].toString());
        }
    }
    
    public double calcolaTempoAttesoMedio(){
        if (num==0){
            return 0;
        }
        int somma=0;
        for (int i=0;i<num;i++){
            somma+= pazienti[i].getAttesa();
        }
        return (double)somma/num;
    }
}
