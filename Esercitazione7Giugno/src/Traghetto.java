/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class Traghetto extends Imbarcazione {
    private int numAuto;
    
    public Traghetto(int numAuto, int numPass, int stazza, String nome){
        super(numPass, stazza, nome);
        this.numAuto = numAuto;
    }
    
    public int getNumAuto(){
        return this.numAuto;
    }

    @Override
    public int notificaPasseggeri() {
        return super.getNumPass()+this.numAuto;
    }
}
