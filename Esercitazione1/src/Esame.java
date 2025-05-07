/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public abstract class Esame implements Comparable<Esame> {
    private final String materia;
    private int voto;
    private final int crediti;
    
    public Esame(String materia, int crediti){
        this.materia=materia;
        this.voto=0;
        this.crediti=crediti;
    }
    
    // get 
    public String getMateria(){
        return this.materia;
    }
    public int getVoto(){
        return this.voto;
    }
    public int getCrediti(){
        return this.crediti;
    }
    
    // set
    public void setVoto(int v){
        voto = v;
    }
    
    @Override
    public String toString(){
        return "Esame di "+ materia + ", voto "+voto+", crediti "+crediti;
    }
    
    public abstract int tempoNecessario();

    @Override
    public int compareTo(Esame e) {
        return this.crediti-e.getCrediti();
    }
    
    
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        
        if (obj==null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        final Esame e = (Esame) obj;
        return materia.equals(e.getMateria());
    }
}
