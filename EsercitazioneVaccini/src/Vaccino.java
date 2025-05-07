/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class Vaccino {
    private String nome;
    private CodaPazienti coda;

    public Vaccino(String nome, int dim) {
        this.nome = nome;
        this.coda = new CodaPazienti(dim);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void aggiungiPaziente(Paziente p) throws Eccezione{
        if (coda.full()){
            throw new Eccezione("Coda piena");
        }
        coda.append(p);
    }

    public Paziente prossimoPaziente() throws Eccezione{
        if (coda.empty()){
            throw new Eccezione("Coda vuota");
        }
        return coda.pop();
    }

    public void print(){
        coda.print();
    }

    public double tempoAttesaMedio(){
        return coda.calcolaTempoAttesoMedio();
    }
}
