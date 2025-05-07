/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class Giostra extends Attrazione {

    public Giostra(String nome, int dim, int div ){
        super(nome, dim, div);
    }

    @Override
    public int costoAttrazione() {
        return super.getDivertimento()*2;
    }
    
}
