/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class Studente {
    private final String nome;
    private final String cognome;
    private double media;
    private Esame[] esamiPreparati;
    private ListaEsami esamiSostenuti;
    
    public Studente(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
        this.media = 0.0;
        this.esamiPreparati = new Esame[3];
        this.esamiSostenuti = new ListaEsami();
    }
    
    // get
    public String getNome(){
        return this.nome;
    }
    
    public String getCognome(){
        return this.cognome;
    }
    
    public double getMedia(){
        return this.media;
    }
    
    public void printEsamiPreparati(){
        for (int i=0;i<3;i++){
            if (esamiPreparati[i]!=null){
                System.out.println(esamiPreparati[i]);
            }
        }
    }
    
    public void printEsamiSostenuti(){
        this.esamiSostenuti.stampa();
    }
    
    public void preparaEsame(Esame e, int giorni) throws PreparazioneEsame{
        if (e.tempoNecessario()>giorni){
            throw new PreparazioneEsame("Non hai abbastanza tempo per preparare l'esame");
        }
        e.setVoto(0);
        for (int i=0;i<3;i++){
            if (esamiPreparati[i]==null){
                esamiPreparati[i]=e;
                break;
            }
        }
        System.out.println("Esame preparato");
    }
    
    public void sostieniEsame(Esame e, int voto) throws PreparazioneEsame {
        for (int i=0;i<3;i++){
            if (esamiPreparati[i]!=null && esamiPreparati[i].equals(e)){
                esamiPreparati[i]=null;
                e.setVoto(voto);
                esamiSostenuti.insert(e);
                this.media = esamiSostenuti.calcoloMedia();
                return;
            }
        }
        throw new PreparazioneEsame("Esame non preparato");
    }

    public void rimuoviEsame(Esame e) throws Esame404 {
        esamiSostenuti.delete(e);
    }
    
    public boolean richiediTesi(){
        int cfu = esamiSostenuti.cfuAccumulati();
        if (cfu>=20){
            return true;
        }
        return false;
    }
    
    public double votolaurea(){
        return (this.media*11)/3;
    }
    
}
