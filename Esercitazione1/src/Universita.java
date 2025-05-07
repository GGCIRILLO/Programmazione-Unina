/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class Universita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creazione di un oggetto di tipo Studente
        Studente s = new Studente("Mario", "Rossi");
        Esame e1 = new Scritto("Analisi 1", 9);
        Esame e2 = new Orale("Fisica 1", 6);
        Esame e3 = new Scritto("Informatica", 12);
        Esame e4 = new Orale("Anatomia", 12);

        try {
            s.preparaEsame(e1, 10);
        } catch (PreparazioneEsame e) {
            System.out.println(e.getMessage());
        }
        try {
            s.preparaEsame(e2, 15);
        } catch (PreparazioneEsame e) {
            System.out.println(e.getMessage());
        }
        try {
            s.preparaEsame(e3, 40);
        } catch (PreparazioneEsame e) {
            System.out.println(e.getMessage());
        }

        // stampa esami preparati 
        System.out.println("Esami preparati: ");
        s.printEsamiPreparati();

        // sostieni esami
        System.out.println("Sostengo gli esami...");
        try {
            s.sostieniEsame(e1, 30);
        } catch (PreparazioneEsame e) {
            System.out.println(e.getMessage());
        }
        try {
            s.sostieniEsame(e2, 28);
        } catch (PreparazioneEsame e) {
            System.out.println(e.getMessage());
        }
        try {
            s.sostieniEsame(e3, 16);
        } catch (PreparazioneEsame e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Esami sostenuti: ");
        s.printEsamiSostenuti();

        System.out.println();
        
        // rimuovo un esame
        try {
            System.out.println("Rifiuto il voto di "+e3.toString());
            s.rimuoviEsame(e3);
        } catch (Esame404 e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Rifiuto il voto di "+e4.toString());
            s.rimuoviEsame(e4);
        } catch (Esame404 e) {
            System.out.println(e.getMessage());
        }

        // stampa esami sostenuti
        System.out.println();
        System.out.println("Esami sostenuti: ");
        s.printEsamiSostenuti();

        // richiedi tesi
        if (s.richiediTesi()) {
            System.out.println("Puoi richiedere la tesi");
        } else {
            System.out.println("Non puoi richiedere la tesi");
        }

        // voto laurea
        System.out.println("Voto laurea attuale: " + s.votolaurea());
        System.out.println();

        // prepara esame
        try {
            s.preparaEsame(e1, 30);
            s.preparaEsame(e3, 37);
        } catch (PreparazioneEsame e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Esami preparati: ");
        s.printEsamiPreparati();
        // sostieni esame
        try {
            s.sostieniEsame(e1, 30);
            s.sostieniEsame(e3, 30);
        } catch (PreparazioneEsame e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Esami sostenuti: ");
        s.printEsamiSostenuti();

        // richiedi tesi
        if (s.richiediTesi()) {
            System.out.println("Puoi richiedere la tesi");
        } else {
            System.out.println("Non puoi richiedere la tesi");
        }

        // voto laurea
        System.out.println("Voto laurea attuale: " + s.votolaurea());




        
    }
    
}
