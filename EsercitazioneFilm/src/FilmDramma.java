/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class FilmDramma extends Film {

    public FilmDramma(String nome, String regista, int anno, int durata) {
        super(nome, regista, anno, durata);
    }

    @Override
    public int calcolaPrezzo() {
        return (int)super.getDurata()/13;
    }
    @Override 
    public String toString(){
        return super.toString()+" è un dramma";
    }
    
}
