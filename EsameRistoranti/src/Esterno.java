/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class Esterno extends Tavolo {
    private boolean isSottoPortico;
    
    public Esterno(int numero, int numPosti, boolean sp){
        super(numero, numPosti);
        this.isSottoPortico=sp;
    }
    
    public boolean isSottoTettoia(){
        return this.isSottoPortico;
    }
    @Override
    public String toString(){
        String pos = (this.isSottoPortico) ? " è sotto portico" : " non è sotto portico";
        return super.toString()+" Esterno"+pos;
    }

    @Override
    protected void specificaPrenotazione() {
        System.out.println("Controllo le condizioni atmosferoche...");
    }
    
}
