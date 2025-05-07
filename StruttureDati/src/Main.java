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
//        LinkedList lista = new LinkedList();
//        lista.inserisci(3);
//        lista.inserisci(7);
//        lista.inserisci(0);
//        lista.inserisci(10);
//        lista.print();
//        lista.pop();
//        lista.rimuovi(0);
//        System.out.println();
//        lista.print();
//
//        Pila p = new Pila(5);
//        p.push(0);
//        p.push(3);
//        p.push(6);
//        p.push(1);
//        p.push(5);
//        p.print();
//        System.out.println("");
//        p.pop();
//        System.out.println(p.cerca(0));
//        p.print();
          
          Coda c = new Coda(5);
          c.append(1);
          c.append(0);
          c.append(3);
          c.print();
          System.out.println("");
          c.append(9);
          c.append(13);
          c.print();
          System.out.println("");
          c.pop();
          c.print();

    }

}
