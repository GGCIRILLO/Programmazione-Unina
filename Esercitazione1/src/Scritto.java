/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class Scritto extends Esame {
    public Scritto(String materia, int crediti){
        super(materia, crediti);
    }

    @Override
    public int tempoNecessario() {
        return super.getCrediti()*3;
    } 
    @Override
    public String toString(){
        return super.toString()+" ed è Scritto";
    }
}
