public abstract class Libro {
    private String titolo;
    private String autore;
    private int anno;
    private String isbn;

    public Libro(String titolo, String autore, int anno, String isbn) {
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
        this.isbn = isbn;
    }

    // metodi get e set
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public abstract void visualizzaInformazioni();

    @Override
    public String toString() {
        return "Libro{" + "titolo:" + titolo + ", autore:" + autore + ", anno:" + anno + ", isbn:" + isbn + '}';
    }

}
