public class Manuale extends Libro {
    private String materia;
    private String livello;
    
    public Manuale(String titolo, String autore, int anno, String isbn, String materia, String livello){
        super(titolo, autore, anno, isbn);
        this.materia = materia;
        this.livello = livello;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getLivello() {
        return livello;
    }

    public void setLivello(String livello) {
        this.livello = livello;
    }

    @Override
    public void visualizzaInformazioni() {
        super.toString();
        System.out.println("è un Manuale di materia "+this.materia+" e livello "+this.livello);
        System.out.println();
    }
    
}
