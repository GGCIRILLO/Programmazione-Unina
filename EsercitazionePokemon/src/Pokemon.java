/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public abstract class Pokemon implements Comparable<Pokemon> {

    private String nome;
    private int livello;
    private int salute;

    public Pokemon(String nome, int livello) {
        this.nome = nome;
        this.livello = livello;
        this.salute = 100;
    }

    public String getNome() {
        return this.nome;
    }

    public int getLivello() {
        return this.livello;
    }

    public int getSalute() {
        return this.salute;
    }

    public void setNome(String n) {
        nome = n;
    }

    public void setLivello(int l) {
        livello = l;
    }

    public void setSalute(int hp) {
        salute = hp;
    }

    public abstract void attacca(Pokemon p);

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Pokemon p = (Pokemon) obj;
        return this.nome.equals(p.nome) && this.livello == (p.livello);
    }

    @Override
    public String toString() {
        return nome + " ha livello " + livello + " con " + salute + " hp";
    }

    @Override
    public int compareTo(Pokemon p) {
        return this.livello - p.livello;
    }

}
