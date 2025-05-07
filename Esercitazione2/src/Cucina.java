/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class Cucina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crea un lavapiatti
        Lavapiatti lavapiatti = new Lavapiatti("Ciro");
        // crea piatti da lavare
        PiattoFondo p1 = new PiattoFondo("ceramica", 5);
        PiattoFondo p2 = new PiattoFondo("ceramica", 9);
        PiattoPiano p3 = new PiattoPiano("porcellana", 25);
        PiattoPiano p4 = new PiattoPiano("porcellana", 21);
        Bicchiere b = new Bicchiere("vetro", 15);

        // assegna i piatti da lavare
        try {
            lavapiatti.aggiungiPiatto(p1);
            lavapiatti.aggiungiPiatto(p2);
            lavapiatti.aggiungiPiatto(p3);
            lavapiatti.aggiungiPiatto(p4);
            lavapiatti.aggiungiPiatto(b);
            lavapiatti.aggiungiPiatto(p2);
        } catch (ExceptionPila e) {
            System.out.println(e.getMessage());
        }

        // stampa i piatti da lavare
        lavapiatti.printPiatti();

        // lava i piatti
        try {
            lavapiatti.lavaPiatto();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // aggiungi sapone
        lavapiatti.aggiungiSapone(300);
        System.out.println("Lavo i piatti...");
        // lava i piatti
        try {
            for (int i=0;i<7;i++){
                lavapiatti.lavaPiatto();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // stampa i piatti da lavare
        lavapiatti.printPiatti();


    }
    
}
