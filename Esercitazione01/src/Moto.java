/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class Moto extends Veicolo {
    public Moto(String targa){
        super(targa);
    }
    
    @Override
    public String toString(){
        return "Moto con "+super.toString();
    }

    @Override
    public int calcolaPrezzo() {
        return (super.getUscita()-super.getIngresso()+1)*2;
    }
    
    
}
