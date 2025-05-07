
import java.util.NoSuchElementException;

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
        PokemonFuoco r1 = new PokemonFuoco("Charizard", 75);
        PokemonFuoco r2 = new PokemonFuoco("Moltres", 55);
        PokemonAcqua a1 = new PokemonAcqua("Gyrados", 44);
        PokemonAcqua a2 = new PokemonAcqua("Blastoise", 60);
        PokemonErba e1 = new PokemonErba("Venosaur", 67);
        PokemonErba e2 = new PokemonErba("Arceus", 99);
        PokemonAcqua a3 = new PokemonAcqua("Magikarp", 10);

        Palestra p = new Palestra("Kanto");
        
        System.out.println("Aggiungo i pokemon alla palestra...");
        p.aggiungiPokemon(r1);
        p.aggiungiPokemon(r2);
        p.aggiungiPokemon(a1);
        p.aggiungiPokemon(a2);
        p.aggiungiPokemon(e1);
        p.aggiungiPokemon(e2);
        p.aggiungiPokemon(a3);
        System.out.println("Aggiunti");

        System.out.println("Attuali pokemon nella palestra...");
        p.print();

        System.out.println("\nCerco " + r1.getNome());
        String esito = p.cercaPokemon(r1) ? "trovato" : "non trovato";
        System.out.println(r1.getNome() + " " + esito);

        System.out.println("\nRimuovo " + a3.getNome() + "...");
        p.rimuoviPokemon(a3);

        System.out.println("\nCerco " + a3.getNome());
        String esito2 = p.cercaPokemon(a3) ? "trovato" : "non trovato";
        System.out.println(a3.getNome() + " " + esito2);

        System.out.println("\nAttuali pokemon nella palestra...");
        p.print();

        System.out.println("\nAttuale livello medio nella palestra..." + p.calcolaLivelloMedio());

        try {
            System.out.println("\nCombattimento " + r1.getNome() + " vs " + a2.getNome());
            p.combattimento(r1, a2);
        } catch (NoSuchElementException ex) {
            System.out.println("errore " + ex.getMessage());
        }
        System.out.println("\nCombattimento terminato. Attuali pokemon in palestra...");
        p.print();

        try {
            System.out.println("\nCombattimento " + r1.getNome() + " vs " + a2.getNome());
            p.combattimento(r1, a2);
        } catch (NoSuchElementException ex) {
            System.out.println("errore " + ex.getMessage());
        }
        System.out.println("\nCombattimento terminato. Attuali pokemon in palestra...");
        p.print();

        try {
            System.out.println("\nCombattimento " + e1.getNome() + " vs " + e2.getNome());
            p.combattimento(e1, e2);
        } catch (NoSuchElementException ex) {
            System.out.println("errore " + ex.getMessage());
        }
        System.out.println("\nCombattimento terminato. Attuali pokemon in palestra...");
        p.print();
        
        System.out.println("\nCarico da file altri pokemon nella palestra...");
        p.caricaPokemonDaFile("input.txt");
        
        System.out.println("\nSalvo i pokemon attuali su file output.txt");
        p.salvaSuFile("output.txt");
        
        

    }

}
