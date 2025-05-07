/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var centro = new CentroVaccinale("Basile");
        var pfizer = new Pfizer("Pfizer", 3);
        var moderna = new Moderna("Moderna", 2);
        var astrazeneca = new Astrazeneca("Astrazeneca", 4);
        centro.aggiungiVaccino(pfizer);
        centro.aggiungiVaccino(moderna);
        centro.aggiungiVaccino(astrazeneca);
        centro.visualizzaVaccini();
        centro.visualizzaBeneficiVacciniAnziani();
        centro.visualizzaDosiRichiamoModerna();
        centro.visualizzaControindicazioniGiovani();

        
        var p1 = new Paziente("Luigi", 10, 20);
        var p2 = new Paziente("Giovanni", 20, 15);
        var p3 = new Paziente("Maria", 30, 25);
        var p4 = new Paziente("Anna", 40, 30);
        var p5 = new Paziente("Giuseppe", 50, 35);
        var p6 = new Paziente("Giovanna", 60, 40);
        var p7 = new Paziente("Giovanni", 50, 45);
        var p8 = new Paziente("Marco", 20, 50);
        var p9 = new Paziente("Luca", 10, 60);


        //aggiungo pazienti
        try{
            pfizer.aggiungiPaziente(p1);
            pfizer.aggiungiPaziente(p2);
            pfizer.aggiungiPaziente(p3);
            pfizer.aggiungiPaziente(p4);
        }  catch (Eccezione e){
            System.out.println(e.getMessage());
        } 
        try { 
            moderna.aggiungiPaziente(p5); 
            moderna.aggiungiPaziente(p6); 
        } catch (Eccezione e){
            System.out.println(e.getMessage());
        } 

        try { 
            astrazeneca.aggiungiPaziente(p7); 
            astrazeneca.aggiungiPaziente(p8); 
            astrazeneca.aggiungiPaziente(p9); 
        } catch (Eccezione e){
            System.out.println(e.getMessage());
        }

        // visualizzo code
        pfizer.print();
        moderna.print();
        astrazeneca.print();

        //prossimo paziente
        try{
            System.out.println(pfizer.prossimoPaziente().toString());
        } catch (Eccezione e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(moderna.prossimoPaziente().toString());
        } catch (Eccezione e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(astrazeneca.prossimoPaziente().toString());
        } catch (Eccezione e){
            System.out.println(e.getMessage());
        }

    }
    
}
