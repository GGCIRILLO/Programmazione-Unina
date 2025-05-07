
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author luigicirillo
 */
public class Human extends SCFPlayer {
    private String nome;
    
    public Human(String nome, String nickname){
        super(nickname);
        this.nome=nome;
    }

    @Override
    public void move(){
        try{
            Scanner input = new Scanner(System.in);
            System.out.println(super.nickname+ " gioca: ");
            String mossa = input.next();
            if (!super.checkMove(mossa)){
                throw new IllegalArgumentException("Mossa non valida");
            }
            super.mossa=mossa;
            super.stato=true;
        } catch (IllegalArgumentException ex ){
            System.out.println("Errore "+ex.getMessage());
        }
    }    
    
}
