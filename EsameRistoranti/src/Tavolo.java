/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author luigicirillo
 */
public abstract class Tavolo implements Reservable {
    private int numero;
    private int numPosti;
    private boolean prenotato;
    
    public Tavolo(int numero, int numPosti){
        this.numero=numero;
        this.numPosti=numPosti;
        this.prenotato=false;
    }
    
    public int getNumero(){
        return this.numero;
    }
    public int getNumPosti(){
        return this.numPosti;
    }
    private void setPrenotato(boolean b){
        this.prenotato=b;
    }

    @Override
    public void prenota() {
        specificaPrenotazione();
        setPrenotato(true);
    }

    @Override
    public void libera() {
        setPrenotato(false);
    }

    @Override
    public boolean isPrenotato() {
        return this.prenotato;
    }
    @Override
    public String toString(){
        return "Tavolo "+numero+" con "+numPosti+" posti è prenotato: "+prenotato;
    }
    
    protected abstract void specificaPrenotazione();
}
