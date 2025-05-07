/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class FilmAzione extends Film {

    public FilmAzione(String nome, String regista, int anno, int durata) {
        super(nome, regista, anno, durata);
    }

    @Override
    public int calcolaPrezzo(){
        return (int)super.getDurata()/10;
    }
    
    @Override 
    public String toString(){
        return super.toString()+" è un film d'azione";
    }
    
}
