
import java.util.NoSuchElementException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class GestioneTavoli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ristorante r = new Ristorante("Da Mario");
        r.LoadFromFile();
        r.displayTables();
        System.out.println();
        
        System.out.println("Aggiungo un altro tavolo...");
        var t = new Esterno(5, 2, false);
        r.addTable(t);
        r.displayTables();
        System.out.println();
        
        System.out.println("Riservo alcuni tavoli...");
        try{
            r.reserveTable(2);
            r.reserveTable(4);
            r.reserveTable(0);
        } catch (NoSuchElementException ex){
            System.out.println("Errore: "+ex.getMessage());
        }
        System.out.println();
        r.displayTables();
        
        System.out.println("\nRimuovo una prenotazione");
        
        try{
            r.releaseTable(2);
            r.releaseTable(5);
            r.releaseTable(0);
        } catch (NoSuchElementException ex){
            System.out.println("Errore: "+ex.getMessage());
        }
        
        r.displayTables();
        System.out.println("\nIl tavolo num 3 è presente "+r.TableAt(3));
        System.out.println("Il tavolo num 0 è presente "+r.TableAt(0));
        
        System.out.println("\nIl tavolo con 3 posti è presente "+ r.findTable(3));
        System.out.println("Il tavolo con 8 posti è presente "+ r.findTable(8));

        
    }
    
}
