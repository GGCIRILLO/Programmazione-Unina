/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework3;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author luigicirillo
 */
public class Homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dim=5;
        Campo campo = new Campo(dim);
        

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        int test;
        do {
            System.out.println("Scegli test: 0.Test caso limite - 1.Test Normali");
            test = input.nextInt();
            if (test!=0 && test!=1) {
                System.out.println("Test non valido");
            }
        } while (test!=0 && test!=1);

        Personaggio a1 = new Alien(0, 0);
        Personaggio a2 = new Alien(0, 1);
        Personaggio z1 = new Zombie(0, 2);
        Personaggio z2 = new Zombie(0, 3);

        if (test == 0) {
            a1.setX(4);
            a2.setX(4);
            z1.setX(4);
            z2.setX(4);
            campo.placePersonaggio(4, 0, a1);
            campo.placePersonaggio(4, 1, a2);
            campo.placePersonaggio(4, 2, z1);
            campo.placePersonaggio(4, 3, z2);
        }else{
            campo.placePersonaggio(0, 0, a1);
            campo.placePersonaggio(0, 1, a2);
            campo.placePersonaggio(0, 2, z1);
            campo.placePersonaggio(0, 3, z2);
        }

        System.out.println("Inizio gioco. Stato attuale del campo: ");
        printGrid(campo);

        int scelta ;
        do {
            System.out.println("Scegli test: (0-4)");
            scelta = input.nextInt();
            if (scelta<0 || scelta>4) {
                System.out.println("Test non valido");
            }
        } while (scelta<0 || scelta>4);

        switch (scelta) {
            case 2:
                test2(campo, a1, a2, z1, z2);
                break;
            case 3:
                test3(campo, a1, a2, z1, z2);
                break;
            case 4:
                test4(campo, a1, a2, z1, z2);
                break;
            default:
                test1(campo, a1, a2, z1, z2);
                break;
        }
        input.close();
    }

    private static void printGrid(Campo campo) {
        Personaggio[][] grid = campo.getGrid();
        System.out.println("Stato attuale del campo: ");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] instanceof Zombie && grid[i][j].vivo) {
                    System.out.print("Z ");
                } else if (grid[i][j] instanceof Alien && grid[i][j].vivo) {
                    System.out.print("A ");
                } else{
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

    private static void test1(Campo campo, Personaggio a1, Personaggio a2, Personaggio z1, Personaggio z2){
        System.out.println("Sequenza di mosse: a1;z1;a2;z2;a1;a1;z1;z1");

        System.out.println("Muove : a1");
        actions(campo, a1);
        if (checkStatus(campo)) return;

        System.out.println("Muove : z1");
        actions(campo, z1);
        if (checkStatus(campo)) return;

        System.out.println("Muove : a2");
        actions(campo, a2);
        if (checkStatus(campo)) return;

        System.out.println("Muove : z2");
        actions(campo, z2);
        if (checkStatus(campo)) return;

        System.out.println("Muove : a1");
        actions(campo, a1);
        if (checkStatus(campo)) return;

        System.out.println("Muove : a1");
        actions(campo, a1);
        if (checkStatus(campo)) return;

        System.out.println("Muove : z1");
        actions(campo, z1);
        if (checkStatus(campo)) return;

        System.out.println("Muove : z1");
        actions(campo, z1);
        if (checkStatus(campo)){
            return;
        }else{
            System.out.println("Partita patta");
        }
    }

    private static void test2(Campo campo, Personaggio a1, Personaggio a2, Personaggio z1, Personaggio z2){
        
        System.out.println("Sequenza mosse:  a1;z1;a2;z2;z2;a2;z2;z2");
        System.out.println("Muove : a1");
        actions(campo, a1);
        if (checkStatus(campo)) return;

        System.out.println("Muove : z1");
        actions(campo, z1);
        if (checkStatus(campo)) return;

        System.out.println("Muove : a2");
        actions(campo, a2);
        if (checkStatus(campo)) return;

        System.out.println("Muove : z2");
        actions(campo, z2);
        if (checkStatus(campo)) return;

        System.out.println("Muove : z2");
        actions(campo, z2);
        if (checkStatus(campo)) return;

        System.out.println("Muove : a2");
        actions(campo, a2);
        if (checkStatus(campo)) return;

        System.out.println("Muove : z2");
        actions(campo, z2);
        if (checkStatus(campo)) return;

        System.out.println("Muove : z2");
        actions(campo, z2);
        if (checkStatus(campo)){
            return;
        }else{
            System.out.println("Partita patta");
        }

    }
    private static void test3(Campo campo, Personaggio a1, Personaggio a2, Personaggio z1, Personaggio z2){
        System.out.println("Sequenza mosse:  a1;a2;z1;z2;a1;a1;z2;z2");

        System.out.println("Muove : a1");
        actions(campo, a1);
        if (checkStatus(campo)) return;

        System.out.println("Muove : a2");
        actions(campo, a2);
        if (checkStatus(campo)) return;

        System.out.println("Muove : z1");
        actions(campo, z1);
        if (checkStatus(campo)) return;

        System.out.println("Muove : z2");
        actions(campo, z2);
        if (checkStatus(campo)) return;

        System.out.println("Muove : a1");
        actions(campo, a1);
        if (checkStatus(campo)) return;

        System.out.println("Muove : a1");
        actions(campo, a1);
        if (checkStatus(campo)) return;

        System.out.println("Muove : z2");
        actions(campo, z2);
        if (checkStatus(campo)) return;

        System.out.println("Muove : z2");
        actions(campo, z2);
        if (checkStatus(campo)){
            return;
        }else{
            System.out.println("Partita patta");
        }
    }
    private static void test4(Campo campo, Personaggio a1, Personaggio a2, Personaggio z1, Personaggio z2){
        System.out.println("Sequenza mosse:  z1;z2;z1;z2;z1;z2;a1;a2;");

        System.out.println("Muove : z1");
        actions(campo, z1);
        if (checkStatus(campo)) return;

        System.out.println("Muove : z2");
        actions(campo, z2);
        if (checkStatus(campo)) return;

        System.out.println("Muove : z1");
        actions(campo, z1);
        if (checkStatus(campo)) return;

        System.out.println("Muove : z2");
        actions(campo, z2);
        if (checkStatus(campo)) return;

        System.out.println("Muove : z1");
        actions(campo, z1);
        if (checkStatus(campo)) return;

        System.out.println("Muove : z2");
        actions(campo, z2);
        if (checkStatus(campo)) return;

        System.out.println("Muove : a1");
        actions(campo, a1);
        if (checkStatus(campo)) return;

        System.out.println("Muove : a2");
        actions(campo, a2);
        if (checkStatus(campo)){
            return;
        }else{
            System.out.println("Partita patta");
        }
    }
    
    private static boolean checkStatus(Campo campo){
        if (campo.gameOver()){
            System.out.println("Game Over");
            if (Zombie.getZombieCount() > Alien.getAlienCount()){
                System.out.println("Zombie Win");
            } else {
                System.out.println("Alien Win");
            }   
            return true;
        }
        return false;
    }

    private static void actions (Campo campo, Personaggio p){
        p.move(campo); // Move the character
        printGrid(campo); // Print the grid after the move
        System.out.println("-----------------");
    }
}
