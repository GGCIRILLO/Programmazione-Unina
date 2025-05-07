/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class PiattoPiano extends Piatto{
    private int diametro;
    
    public PiattoPiano(String mat, int diam){
        super(mat);
        this.diametro = diam;
    }
    
    public int getDiametro(){
        return this.diametro;
    }
    
    public void setDiametro(int d){
        diametro = d;
    }

    @Override
    public int saponeNecessario() {
        return diametro*2;
    }
    @Override
    public String toString(){
        return super.toString()+" è un "+this.getClass().getName()+" con diametro "+diametro;
    }
}
