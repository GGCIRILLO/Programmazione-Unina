
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
public abstract class Attrazione {
    private final String nome;
    private CodaCircolare coda;
    private int divertimento;
    
    
    public Attrazione(String nome, int dim, int div){
        this.nome=nome;
        this.coda = new CodaCircolare(dim);
        this.divertimento=div;
    }
    
    public String getNome(){
        return this.nome;
    }
    public int getDivertimento(){
        return this.divertimento;
    }
    
    public void aggiungiOspite(Ospite o) throws CodaException {
        if (coda.full()){
            throw new CodaException("Coda piena");
        }
        coda.append(o);
    }
    
    public Ospite rimuoviOspite() throws CodaException {
        if (coda.empty()){
            throw new CodaException("Coda vuota");
        }
        return coda.pop();
    }
    
    public void ospitiInCoda(){
        coda.print();
    }
    
    public int numeroOspiti(){
        return coda.getNum();
    }
    
    public abstract int costoAttrazione();
    
    public void caricaDaFile(String file) throws  IOException, CodaException {
        Scanner input = new Scanner(Paths.get(file));
        int num = input.nextInt();
        for (int i=0;i<num;i++){
            if (coda.full()){
                throw new CodaException("Coda piena");
            }
            Ospite o = new Ospite(input.next(), input.nextInt());
            coda.append(o);
        }
    }
    
    public void salvaSuFile(String file) throws FileNotFoundException {
        PrintStream output = new PrintStream(new FileOutputStream(file));
        PrintStream terminale = System.out;
        System.setOut(output);
        coda.print();
        System.setOut(terminale);
    }
    
    public boolean faiUnGiro(){
        Ospite o = coda.peek();
        int costo = o.getGettoni()-this.costoAttrazione();
        if (costo>=0){
            o.setGettoni(costo);
            coda.pop();
            return true;
        }
        coda.pop();
        return false;
    }    
}
