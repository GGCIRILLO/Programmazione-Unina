
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Paths;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class Cinema {
    private final String nome;
    private PilaFilm pila;
    
    public Cinema(String nome,int films){
        this.nome=nome;
        this.pila=new PilaFilm(films);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void aggiungiFilm(Film f) throws PilaException{
        if (pila.isFull()){
            throw new PilaException("Pila piena");
        }
        pila.append(f);
    }
    public void rimuoviFilm() throws PilaException{
        if (pila.isEmpty()){
            throw new PilaException("Pila vuota");
        }
        pila.pop();
    }
    public Film vediFilm(){
        return pila.top();
    }
    
    public void programmaFilm(){
        pila.print();
    }
    public void caricaFilm(String file) throws IOException, PilaException {
        Scanner input = new Scanner(Paths.get(file));
        int num = input.nextInt();
        for (int i=0;i<num;i++){
            if (pila.isFull()){
                throw new PilaException("Pila Piena");
            }
            switch(input.next()){
                case "FilmAzione":
                    FilmAzione a = new FilmAzione(input.next(), input.next(), input.nextInt(), input.nextInt());
                    pila.append(a);
                    break;
                case "FilmCommedia":
                    FilmCommedia c = new FilmCommedia(input.next(), input.next(), input.nextInt(), input.nextInt());
                    pila.append(c);
                    break;
                case "FilmDramma":
                    FilmDramma d = new FilmDramma(input.next(), input.next(), input.nextInt(), input.nextInt());
                    pila.append(d);
                    break;
                default:
                    throw new IOException("Genere non valido");
            }
        }
    }
    
    public void salvaSuFile(String file) throws FileNotFoundException{
        PrintStream output = new PrintStream(new FileOutputStream(file));
        PrintStream terminale = System.out;
        System.setOut(output);
        pila.print();
        System.setOut(terminale);
    }
    
    public int contaFilmPerGenere(String genere){
        return pila.contaFilmGenere(genere);
    }
    public double annoMedio(){
        return pila.annoMedio();
    }
    
}
