import java.util.ArrayList;
import java.util.List;

public class CentroVaccinale {
    private String nome;
    private List<Vaccino> vaccini;

    public CentroVaccinale(String nome){
        this.nome = nome;
        vaccini = new ArrayList<Vaccino>();
    }

    public String getNome() {
        return nome;
    }
    
    public void aggiungiVaccino(Vaccino v){
        vaccini.add(v);
    }
    public void rimuoviVaccino(String nome){
        for (Vaccino v : vaccini){
            if (v.getNome().equals(nome)){
                vaccini.remove(v);
                return;
            }
        }
    }
    public void visualizzaVaccini(){
        for (Vaccino v : vaccini){
            System.out.println(v.getNome());
        }
    }

    public void visualizzaBeneficiVacciniAnziani(){
        for (Vaccino v : vaccini){
            if (v instanceof Pfizer){
                System.out.println(((Pfizer) v).beneficiAnziani());
            }
        }
    }
    public void visualizzaDosiRichiamoModerna(){
        for (Vaccino v : vaccini){
            if (v instanceof Moderna){
                System.out.println(((Moderna) v).dosaggio());
            }
        }
    }
    public void visualizzaControindicazioniGiovani(){
        for (Vaccino v : vaccini){
            if (v instanceof Astrazeneca){
                System.out.println(((Astrazeneca) v).controindicazioniGiovani());
            }
        }
    }

}
