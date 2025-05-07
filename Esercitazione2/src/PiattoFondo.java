/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class PiattoFondo extends Piatto {
    private int profondita;
    
    public PiattoFondo(String materiale, int prof){
        super(materiale);
        this.profondita = prof;
    }
    
    public int getProfondita(){
        return this.profondita;
    }
    
    public void setProfondita(int p){
        profondita = p;
    }
    

    @Override
    public int saponeNecessario() {
        return profondita*2;
    }
    
    @Override
    public String toString(){
        return super.toString()+ " è un "+this.getClass().getName()+" di profondita "+profondita; 
    }
    
    
    
}
