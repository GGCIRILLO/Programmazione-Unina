/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class Ospite {
    private final String nome;
    private int gettoni;
    
    public Ospite(String nome, int gettoni){
        this.nome=nome;
        this.gettoni=gettoni;
    }
    
    public String getNome(){
        return this.nome;
    }
    public int getGettoni(){
        return this.gettoni;
    }
    public void setGettoni(int g){
        gettoni = g;
    }
    
    @Override
    public String toString(){
        return nome+" ha "+gettoni+" gettoni";
    }
}
