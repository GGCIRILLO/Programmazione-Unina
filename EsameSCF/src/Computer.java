/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author luigicirillo
 */
public class Computer extends SCFPlayer {
    private String filemoves;
    private String[] sequenzaMosse;
    private int maxmosse;
    private int prossimaMossa;

    public Computer(String nickname) {
        super(nickname);
        this.prossimaMossa=0;
        this.filemoves="input.txt";
        super.stato=loadFromFile();
    }
    
    private boolean loadFromFile(){
        try(Scanner input = new Scanner(Paths.get(this.filemoves))){
            this.maxmosse=input.nextInt();
            this.sequenzaMosse = new String[maxmosse];
            int i = 0;
            while(input.hasNext() && i<maxmosse){
                String mossa = input.next();
                if (!super.checkMove(mossa)) {
                    System.out.println("Mossa non valida");
                    continue;  
                }
                sequenzaMosse[i] = mossa;
                i++;
            }
            if (i < 5) {
                System.out.println("Errore: Non ci sono abbastanza mosse valide nel file.");
                return false;
            }
        } catch (IOException ex){
            System.out.println("Errore: "+ex.getMessage());
            return false;
        }
        return true;
    }
    

    @Override
    public void move() throws IllegalArgumentException {
        String mossa = sequenzaMosse[prossimaMossa];
        System.out.println(super.nickname+ " gioca: "+mossa);
        prossimaMossa++;
        super.mossa=mossa;
    }
    
}
