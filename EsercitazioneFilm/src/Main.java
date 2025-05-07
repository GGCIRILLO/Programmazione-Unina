
import java.io.FileNotFoundException;
import java.io.IOException;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Film film1 = new FilmAzione("Azione Epica", "Mario Rossi", 2021, 120);
        Film film2 = new FilmCommedia("Commedia Divertente", "Luigi Bianchi", 2020, 90);
        Film film3 = new FilmDramma("Dramma Struggente", "Giulia Verdi", 2019, 100);
        Film film4 = new FilmCommedia("Commedia Pazzesca", "Giovanni Neri", 2001, 80);
        Film film5 = new FilmDramma("Piagnisteo", "Mara Russo", 1978, 98);
        
        Cinema cinema = new Cinema("Modernissimo", 4);
        System.out.println("Aggiungo Film...");
        try{
        cinema.aggiungiFilm(film1);
        cinema.aggiungiFilm(film2);
        cinema.aggiungiFilm(film3);
        cinema.aggiungiFilm(film4);
        cinema.aggiungiFilm(film5);
        } catch (PilaException err){
            System.out.println(err.getMessage());
        }
        
        System.out.println("Film presenti...");
        cinema.programmaFilm();
        
        System.out.println("\nVedo il prossimo film...");
        Film f = cinema.vediFilm();
        System.out.println("Ho visto "+f.getNome());
        
        System.out.println("Rimuovo il film dopo averlo visto...");
        cinema.rimuoviFilm();
        
        System.out.println("\nFilm presenti...");
        cinema.programmaFilm();
        
        System.out.println("Carico altri film da file...");
        try {
            cinema.caricaFilm("input.txt");
        } catch (IOException | PilaException ex) {
            System.out.println("Errore: "+ex.getMessage());
        } 
        System.out.println("\nFilm presenti: ");
        cinema.programmaFilm();
        
        System.out.println("\nConto i film d'azione...");
        int n = cinema.contaFilmPerGenere("FilmAzione");
        System.out.println("Ci sono "+n+" film d'azione");
        
        System.out.println("\nCalcolo anno medio di produzione...");
        System.out.println("L'anno medio è "+cinema.annoMedio());
        
        System.out.println("Salvo i film su file...");
        try {
            cinema.salvaSuFile("output.txt");
        } catch (FileNotFoundException ex){
            System.out.println("Errore: "+ex.getMessage());
        }
        
        
        
        

        
    }
    
}
