/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public abstract class Imbarcazione implements Comparable<Imbarcazione>{
    private int numeroPasseggeri;
    private int stazza;
    private String nome;
    
    public Imbarcazione(int numPass, int stazza, String nome){
        this.numeroPasseggeri = numPass;
        this.stazza = stazza;
        this.nome = nome;
    }
    
    // get 
    public int getNumPass(){
        return this.numeroPasseggeri;
    }
    
    public int getStazza (){
        return this.stazza;
    }
    
    public String getNome (){
        return this.nome;
    }
    
    
    // set 
    public void setNumPass(int np){
        this.numeroPasseggeri = np;
    }
    
    public void setStazza(int s){
        this.stazza = s;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        
        if (obj==null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        final Imbarcazione imb = (Imbarcazione) obj;
        
        return this.nome.equals(imb.nome);
    }
    
    public abstract int notificaPasseggeri();

    // override to string
    @Override
    public String toString(){
        return "Nome: "+this.nome+" Numero passeggeri: "+this.numeroPasseggeri+" Stazza: "+this.stazza;
    }
    
    @Override
    public int compareTo(Imbarcazione imb){
        return this.stazza-imb.stazza;
    }
}
