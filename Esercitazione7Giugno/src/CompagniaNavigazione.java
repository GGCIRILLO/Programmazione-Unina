/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class CompagniaNavigazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Traghetto t1 = new Traghetto(100, 200, 1000, "Traghetto1");
        Traghetto t2 = new Traghetto(200, 300, 2000, "Traghetto2");
        PortaContainer pc1 = new PortaContainer(30, 150, 5000, "PortaContainer1");
        PortaContainer pc2 = new PortaContainer(40, 300, 6000, "PortaContainer2");
        PortaContainer pc3 = new PortaContainer(50, 250, 7000, "PortaContainer3");


        OrderedLinkedList lista = new OrderedLinkedList();
        System.out.println("Inserisco le imbarcazioni...");
        lista.insert(t1);
        lista.insert(pc2);
        lista.insert(pc3);
        lista.insert(t2);
        lista.insert(pc1);

        System.out.println("Stato attuale della lista: ");
        lista.print();

        System.out.println("");

        System.out.println("Elimino un'imbarcazione presente...");
        try {
            lista.delete(pc1);
        } catch (NoElementFound e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Stato attuale della lista: ");
        lista.print();
        System.out.println("");

        System.out.println("Elimino un'imbarcazione non presente...");
        try {
            lista.delete(pc1);
        } catch (NoElementFound e) {
            System.out.println(e.getMessage());
        }

        System.out.println("");
        int num = lista.numeroContainer();
        System.out.println("Numero container presenti: " + num);

        System.out.println("");
        System.out.println("Controllo le imbarcazioni affollate...");
        Imbarcazione[] imb = lista.affollate();
        System.out.println("Le imbarcazioni più affollate sono: ");
        for (Imbarcazione i : imb) {
            if (i != null) {
                System.out.println(i.getNome());
            }
        }
        
        
        System.out.println("");
        System.out.println("Controllo i passeggeri e veicoli/container...");
        int pass1 = t1.notificaPasseggeri();
        int pass2 = pc2.notificaPasseggeri();
        System.out.println("Su "+t1.getNome()+" ci sono "+ pass1+ " passeggeri e veicoli");
        System.out.println("Su "+pc2.getNome()+" ci sono "+ pass2+ " passeggeri e container");
        

        System.out.println("");
        System.out.println("Programma terminato");

    


        
    }
    
}
