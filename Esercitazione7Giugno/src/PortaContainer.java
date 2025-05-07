/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class PortaContainer extends Imbarcazione  {
    private int numContainer;
    
    public PortaContainer(int numCont, int numPass, int stazza, String nome){
        super(numPass, stazza, nome);
        this.numContainer = numCont;
    }
    
    public int getNumCont(){
        return this.numContainer;
    }

    @Override
    public int notificaPasseggeri() {
        return this.numContainer*2+super.getNumPass();
    }
}
