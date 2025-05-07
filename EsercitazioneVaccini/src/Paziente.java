/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class Paziente {
    private final String nome;
    private final int attesa;
    private final int eta;
    
    public Paziente(String nome, int attesa, int eta){
        this.nome=nome;
        this.attesa=attesa;
        this.eta=eta;
    }
    public String getNome(){
        return this.nome;
    }
    public int getEta(){
        return this.eta;
    }
    public int getAttesa(){
        return this.attesa;
    }
    
    @Override
    public String toString(){
        return nome+" ha "+eta+" anni e ha atteso "+attesa+" min";
    }
    
}
