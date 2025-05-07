public class Romanzo extends Libro {

    private String genere;
    private int targetEta;

    public Romanzo(String titolo, String autore, int anno, String isbn, String genere, int targetEta) {
        super(titolo, autore, anno, isbn);
        this.genere = genere;
        this.targetEta = targetEta;
    }

    public String getGenere() {
        return genere;
    }


    public void setGenere(String genere) {
        this.genere = genere;
    }


    public int getTargetEta() {
        return targetEta;
    }


    public void setTargetEta(int targetEta) {
        this.targetEta = targetEta;
    }

    @Override
    public void visualizzaInformazioni() {
        super.toString();
        System.out.println("è un Romanzo di genere "+this.genere+" e target "+this.targetEta);
        System.out.println();
    }
    
}
