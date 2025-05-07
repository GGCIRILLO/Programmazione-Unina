/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class Parcheggio {
    private final int MAXAUTO = 3;
    private final int MAXMOTO = 2;
    
    private int numAuto;
    private int numMoto;
    private CodaVeicoli codaIngresso;
    private Veicolo[] veicoliPresenti;
    
    public Parcheggio(){
        this.numAuto=0;
        this.numMoto=0;
        this.codaIngresso = new CodaVeicoli();
        this.veicoliPresenti = new Veicolo[5];
    }
    
    public void accetta(Veicolo v) throws CodaPiena {
        if (codaAttesaPiena()){
            throw new CodaPiena("Posti in coda terminati");
        }
        
        if (v instanceof Automobile && numAuto<MAXAUTO){
            codaIngresso.append(v);
        } else if (v instanceof Moto && numMoto<MAXMOTO){
            codaIngresso.append(v);
        }        
    }
    
    public Veicolo faiEntrare(int oraIngresso) {
        Veicolo v = codaIngresso.pop();
        v.setIngresso(oraIngresso);
        return v;
    }
    
    public void parcheggia(Veicolo v){
        veicoliPresenti[numAuto+numMoto]=v;
        if (v instanceof Automobile){
            numAuto++;
        } else{
            numMoto++;
        }
    }
    
    public boolean postoDisponibile (Veicolo v){
        if (v instanceof Automobile){
            return MAXAUTO>numAuto;
        }
        return MAXMOTO>numMoto;
    }
    
     public boolean codaAttesaPiena() {
        return codaIngresso.isFull();
    }
     
    private int cerca(Veicolo v){
     
        for (int i=0; i<veicoliPresenti.length; i++){
            if (veicoliPresenti[i].equals(v)){
                return i;
            }
        }
     
        return -1;

    }
    
    private void rimuoviVeicolo(int pos){
        for (int i=pos;i<numAuto+numMoto-1;i++){
            veicoliPresenti[i]=veicoliPresenti[i+1];
        }
    }    
    public void uscita(Veicolo v, int oraUscita){
        int pos = cerca(v);
        if (pos==-1){
            System.out.println("Veicolo non trovato");
            return;
        }
        veicoliPresenti[pos].setUscita(oraUscita);
        System.out.println("Faccio uscire il veicolo: ");
        System.out.println(veicoliPresenti[pos].toString());
        System.out.println("ha pagato la sosta: " + veicoliPresenti[pos].calcolaPrezzo());
        rimuoviVeicolo(pos);
        
        if (v instanceof Automobile) numAuto--;
        else numMoto--;
    }

    public void printParcheggio(){
        for (int i=0; i<numAuto+numMoto; i++){
            System.out.println(veicoliPresenti[i].toString());
        }
    }
    
    public void printCoda(){
        codaIngresso.printCoda();
    }
}
