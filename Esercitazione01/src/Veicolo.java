/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public abstract class Veicolo {
    private String targa;
    private int ingresso;
    private int uscita;
    
    public Veicolo(String targa){
        this.targa= targa;
        this.ingresso = 0;
        this.uscita = 0;
    }
    
    // get 
    public String getTarga(){
        return this.targa;
    }
    
    public int getIngresso(){
        return this.ingresso;
    }
    
    public int getUscita(){
        return this.uscita;
    }
    
    // set
    public void setTarga(String t){
        targa = t;
    }
    
    public void setIngresso(int i){
        ingresso = i;
    }
    
    public void setUscita(int u){
        uscita=u;
    }
    
    @Override
    public String toString(){
        return "Targa: " + targa + ", ingresso: "+ingresso+", uscita: "+uscita;
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null || this.getClass()!=obj.getClass()){
            return false;
        }
        Veicolo vc = (Veicolo) obj;
        return vc.targa.equals(this.targa);
    }
    
    abstract public int calcolaPrezzo();
      
}
