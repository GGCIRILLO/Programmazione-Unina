/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public abstract class Film {
    private final String nome;
    private final String regista;
    private final int anno;
    private final int durata;
    
    public Film(String nome, String regista, int anno, int durata){
        this.anno=anno;
        this.nome=nome;
        this.regista=regista;
        this.durata=durata;
    }
    public String getNome(){
        return this.nome;
    }
    public String getRegista(){
        return this.regista;
    }
    public int getAnno(){
        return this.anno;
    }
    public int getDurata(){
        return this.durata;
    }
    public abstract int calcolaPrezzo();
    
    @Override 
    public String toString(){
        return nome+" di "+regista+" dell'anno "+anno;
    }
}
