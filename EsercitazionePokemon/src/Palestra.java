
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author luigicirillo
 */
public class Palestra {

    private final String nome;
    private OrderedLinkedList lista;

    public Palestra(String nome) {
        this.nome = nome;
        this.lista = new OrderedLinkedList();
    }

    public String getNome() {
        return this.nome;
    }

    public void aggiungiPokemon(Pokemon p) {
        lista.inserisci(p);
    }

    public void rimuoviPokemon(Pokemon p) throws NoSuchElementException {
        lista.rimuovi(p);
    }

    public boolean cercaPokemon(Pokemon p) {
        return lista.cerca(p);
    }

    public void visualizzaPokemon() {
        lista.print();
    }

    public void caricaPokemonDaFile(String file) {
        try {
            Scanner input = new Scanner(Paths.get(file));
            int num = input.nextInt();
            for (int i = 0; i < num; i++) {
                switch (input.next()) {
                    case "PokemonFuoco":
                        PokemonFuoco f = new PokemonFuoco(input.next(), input.nextInt());
                        lista.inserisci(f);
                        break;
                    case "PokemonAcqua":
                        PokemonAcqua a = new PokemonAcqua(input.next(), input.nextInt());
                        lista.inserisci(a);
                        break;
                    case "PokemonErba":
                        PokemonErba e = new PokemonErba(input.next(), input.nextInt());
                        lista.inserisci(e);
                        break;
                    default:
                        throw new IOException("Tipo non valido");
                }
            }
        } catch (IOException ex) {
            System.out.println("errore " + ex.getMessage());
        } catch (InputMismatchException err) {
            System.out.println("File non valido" + err.getMessage());
        }
    }

    public void salvaSuFile(String file) {
        try {
            PrintStream output = new PrintStream(new FileOutputStream(file));
            PrintStream terminale = System.out;
            System.setOut(output);
            lista.print();
            System.setOut(terminale);
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato: " + e.getMessage());
        }
    }

    public double calcolaLivelloMedio() {
        return lista.calcolaLivelloMedio();
    }

    public int contaPokemonPerTipo(String tipo) {
        return lista.contaPokemonPerTipo(tipo);
    }

    public void combattimento(Pokemon p1, Pokemon p2) throws NoSuchElementException {
        if (!lista.cerca(p2) || !lista.cerca(p1)) {
            throw new NoSuchElementException("Pokemon non in palestra...");
        }

        while (p1.getSalute() > 0 && p2.getSalute() > 0) {
            p1.attacca(p2);
            p2.attacca(p1);
        }
        if (p1.getSalute() <= 0) {
            System.out.println(p1.getNome() + " ha esaurito le energie");
            lista.rimuovi(p1);
        } else if (p2.getSalute() <= 0) {
            System.out.println(p2.getNome() + " ha esaurito le energie");
            lista.rimuovi(p2);
        }
    }

    public void print() {
        lista.print();
    }

}
