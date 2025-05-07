/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class Utente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parcheggio p = new Parcheggio();
        Moto m1 = new Moto("ED564TY");
        Moto m2 = new Moto("ST999ZX");
         
        Automobile a1 = new Automobile("ED567KY");
        Automobile a2 = new Automobile("AA564TY");
        Automobile a3 = new Automobile("BC711UY");
        Automobile a4 = new Automobile("ZX111CV");
        


        // test eccezione 
        System.out.println("Inserisco veicoli in coda...");
        try {
            if (!p.codaAttesaPiena()) p.accetta(m1);
            if (!p.codaAttesaPiena()) p.accetta(m2);
            if (!p.codaAttesaPiena()) p.accetta(a1);
            if (!p.codaAttesaPiena()) p.accetta(a2);
            if (!p.codaAttesaPiena()) p.accetta(a3);
            p.accetta(a4);

        } catch (CodaPiena e){
            System.out.println(e.getMessage());
        }
        // test codaAttesaPiena
        System.out.println("La coda d'attesa è piena: "+p.codaAttesaPiena());
        // print coda
        System.out.println("I veicoli attualmente in coda sono: ");
        p.printCoda();

        System.out.println("Faccio entrare i veicoli...");
        // test faiEntrare e parcheggia
        Veicolo v = p.faiEntrare(10);
        p.parcheggia(v);
        v = p.faiEntrare(11);
        p.parcheggia(v);
        v = p.faiEntrare(12);
        p.parcheggia(v);
        v = p.faiEntrare(13);
        p.parcheggia(v);
        v = p.faiEntrare(14);
        p.parcheggia(v);
        v = p.faiEntrare(15);

        System.out.println();
        System.out.println("I veicoli attualmente parcheggiati sono: ");
        p.printParcheggio();

        // test posto disponibile
        System.out.println();
        System.out.println("Posto disponibile per auto: "+p.postoDisponibile(a2));
        System.out.println("Posto disponibile per moto: "+p.postoDisponibile(m2));

        // test codaAttesaPiena
        System.out.println("La coda d'attesa è piena: "+p.codaAttesaPiena());
        System.out.println();
        
        // test uscita
        System.out.println("Faccio uscire dei veicoli...");
        p.uscita(a2, 16);
        p.uscita(m1, 17);

        System.out.println();
        System.out.println("I veicoli attualmente parcheggiati sono: ");
        p.printParcheggio();
    }
    
}
