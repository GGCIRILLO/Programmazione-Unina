/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class PokemonErba extends Pokemon {

    public PokemonErba(String nome, int livello) {
        super(nome, livello);
    }

    @Override
    public void attacca(Pokemon p) {
        int salute = p.getSalute();
        int danno = super.getLivello() - p.getLivello();
        if (danno <= 0) {
            danno = 5;
        }
        if ("PokemonFuoco".equals(p.getClass().getName())) {
            p.setSalute(salute - (int) (danno / 2));
        } else if ("PokemonAcqua".equals(p.getClass().getName())) {
            p.setSalute(salute - (danno * 2));
        }
        else if ("PokemonErba".equals(p.getClass().getName())) {
            p.setSalute(salute - danno);
        }
    }
    
    @Override
    public String toString(){
        return super.toString()+" è di tipo Erba";
    }
    
}
