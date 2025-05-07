public class Utente {
    private String nome;
    private String cognome;
    private Libro[] libriInPrestito;

    public Utente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.libriInPrestito = new Libro[3];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Libro[] getLibriInPrestito() {
        return libriInPrestito;
    }

    public void setLibriInPrestito(Libro[] libriInPrestito) {
        this.libriInPrestito = libriInPrestito;
    }

    public void aggiungiLibro(Libro libro) throws MiaEccezione {
        boolean aggiunto = false;
        int i=0;
        while (!aggiunto && i<libriInPrestito.length) {
            if (libriInPrestito[i] == null) {
                libriInPrestito[i] = libro;
                aggiunto = true;
            }
            i++;
        }
        if (!aggiunto) {
            throw new MiaEccezione("Non è possibile aggiungere altri libri in prestito");
        }
    }

    public void restituisciLibro(Libro libro) throws MiaEccezione {
        boolean rimosso = false;
        int i = 0;
        while (!rimosso && i < libriInPrestito.length) {
            if (libriInPrestito[i] != null && libriInPrestito[i].equals(libro)) {
                libriInPrestito[i] = null;
                rimosso = true;
            }
            i++;
        }
        if (!rimosso) {
            throw new MiaEccezione("Libro non trovato");
        }
    }

    public void visualizzaLibriInPrestito() {
        for (Libro libro : libriInPrestito) {
            if (libro != null) {
                libro.toString();
            }
        }
    }
}
