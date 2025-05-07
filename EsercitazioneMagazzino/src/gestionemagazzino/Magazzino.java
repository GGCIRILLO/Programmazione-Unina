/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionemagazzino;

import gestioneprodotti.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Paths;
import java.util.Scanner;
import utilities.Searchable;

/**
 *
 * @author luigicirillo
 */
public class Magazzino implements Searchable {
    private PilaProdotti elencoProdotti;
    
    public Magazzino(){
        this.elencoProdotti = new PilaProdotti();
    }
    
    @Override
    public boolean searchForName(String name) {
        return elencoProdotti.searchNome(name);
    }

    @Override
    public boolean searchForCode(String codice) {
        return elencoProdotti.searchCodice(codice);
    }
    
    public void inserisciProdotto(Prodotto p) throws PilaException {
        if (searchForName(p.getNome())){
            throw new PilaException("Prodotto già presente");
        }
        elencoProdotti.append(p);
    }
    
    public void removeProdotto(int pos)throws PilaException{
        if (!searchForCode(elencoProdotti.top().getCodice()) || elencoProdotti.empty()){
            throw new PilaException("Prodotto non presente");
        }
        elencoProdotti.deleteinpos(pos);
    }
    
    public void print(){
        elencoProdotti.print();
    }
    
    public void salvaSuFile(String file) throws FileNotFoundException{
        PrintStream terminale;
        try (PrintStream output = new PrintStream(new FileOutputStream(file))) {
            terminale = System.out;
            System.setOut(output);
            elencoProdotti.print();
        }
        System.setOut(terminale);
    }
    public void caricaDaFile(String file) throws IOException {
        try (Scanner input = new Scanner(Paths.get(file))) {
            int num = input.nextInt();
            for (int i=0;i<num;i++){
                switch(input.next()){
                    case "Prodotto":
                        Prodotto p = new Prodotto(input.nextInt(), input.nextInt(), input.next(), input.next());
                        inserisciProdotto(p);
                        break;
                    case "ProdottoAlimentare":
                        ProdottoAlimentare pa = new ProdottoAlimentare(input.nextInt(), input.nextInt(), input.next(), input.next(), input.nextBoolean(), input.next());
                        inserisciProdotto(pa);
                        break;
                    default:
                        throw new IOException("Genere non valido");
                }
            }
        }
    }    
}
