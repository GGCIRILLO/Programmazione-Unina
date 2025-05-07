/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class GestioneBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo un array di 5 libri
        Biblioteca libri = new Biblioteca();
        
        // Creo un oggetto di tipo Romanzo
        Romanzo r1 = new Romanzo("Il signore degli anelli", "J.R.R. Tolkien", 1954, "A1b23", "Fantasy", 14);
        Romanzo r2 = new Romanzo("1984", "George Orwell", 1949, "B2c34", "Distopia", 12);
        Romanzo r3= new Romanzo("Il vecchio e il mare", "Ernest Hemingway", 1952, "C3d45", "Avventura", 16);
        Manuale m1= new Manuale("Analisi 2", "Zecca", 2022, "Fgr45", "Matematica", "Avanzato");
        Manuale m2 = new Manuale("Java", "Deitel", 2021, "Ghj56", "Informatica", "Base");

        // Aggiungo i libri alla lista
        libri.append(r1);
        libri.append(r2);
        libri.append(r3);
        libri.append(m1);
        libri.append(m2);

        // stato attuale della lista
        System.out.println("Lista libri:");
        libri.print();


        // Creo un utente
        Utente utente = new Utente("Mario", "Rossi");

        // prendo libro in prestito
        System.out.println("Prendo in prestito un libro");
        
        try {
            utente.aggiungiLibro(r1);
            libri.remove(r1);
        } catch (MiaEccezione e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Lista libri:");
        libri.print();
        System.out.println();
        // stato attuale dei libri in prestito
        System.out.println("Libri in presitito all'utente: ");
        utente.visualizzaLibriInPrestito();


        // prendo in prestito un libro non presente
        try {
            utente.aggiungiLibro(r1);
        } catch (MiaEccezione e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        // restituisco un libro
        System.out.println("Restituisco un libro");
        try {
            utente.restituisciLibro(r1);
            libri.append(r1);
        } catch (MiaEccezione e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Lista libri:");
        libri.print();
        System.out.println();
        // stato attuale dei libri in prestito
        System.out.println("Libri in presitito all'utente: ");
        utente.visualizzaLibriInPrestito();


        // restituisco un libro non presente
        try {
            utente.restituisciLibro(r1);
        } catch (MiaEccezione e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        // provo a prendere in prestito piu libri 
        try {
            utente.aggiungiLibro(r2);
            libri.remove(r2);
            utente.aggiungiLibro(r3);
            libri.remove(r3);
            utente.aggiungiLibro(m1);
            libri.remove(m1);
            utente.aggiungiLibro(m2);
            libri.remove(m2);
        } catch (MiaEccezione e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Lista libri:");
        libri.print();
        System.out.println();
        // stato attuale dei libri in prestito
        System.out.println("Libri in presitito all'utente: ");
        utente.visualizzaLibriInPrestito();

        



        
        
    }
    
}
