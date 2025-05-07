/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author luigicirillo
 */
public class Interno extends Tavolo {
    private final boolean nearWindow;

    public Interno(int numero, int numPosti, boolean nw) {
        super(numero, numPosti);
        this.nearWindow=nw;
    }
    public boolean isNearWindow(){
        return this.nearWindow;
    }
    @Override
    public String toString(){
        String pos = this.nearWindow ? " è vicino alla finestra" : " non è vicino alla finestra";
        return super.toString()+" Interno"+ pos;
    }

    @Override
    protected void specificaPrenotazione() {
        System.out.println("Controllo posizione del tavolo...");
    }
    
    
}
