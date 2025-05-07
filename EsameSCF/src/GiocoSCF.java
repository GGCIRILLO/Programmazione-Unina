/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class GiocoSCF {

    /**
     * @param args the command line arguments
     */
    public static int vh = 0;
    public static int vc = 0;
    
    public static void main(String[] args) {
        final int round = 5;
        LinkedList lista = new LinkedList();
        Human h = new Human("Luigi", "GG");
        Computer c = new Computer("ChatGPT");
        for(int i=0;i<round;i++){
            System.out.println("Round "+i+", muove "+h.getNickname());
            h.move();
            lista.push(h.mossa);
            System.out.println("Round "+i+", muove "+c.getNickname());
            c.move();
            lista.push(c.mossa);
            System.out.println(valutaMano(h, c));
        }
        System.out.println("\nVittorie di "+h.nickname+": "+vh);
        System.out.println("\nVittorie di "+c.nickname+": "+vc);
        System.out.println("\nPatte: "+(5-vh-vc));
        
        System.out.println("\nOccorrenze di carta "+lista.contaOccorrenze("carta"));
        System.out.println("\nOccorrenze di sasso "+lista.contaOccorrenze("sasso"));
        System.out.println("\nOccorrenze di forbici "+lista.contaOccorrenze("forbici"));
    }
    
    public static String valutaMano(Human p1, Computer p2){
        var m1 = p1.getMossa();
        var m2 = p2.getMossa();
        
        if ((m1.equals("sasso")&&m2.equals("forbici")) || (m1.equals("forbici")&&m2.equals("carta")) || (m1.equals("carta")&&m2.equals("sasso"))){
            vh++;
            return "Vince "+p1.getNickname();
        } else if ((m2.equals("sasso")&&m1.equals("forbici")) || (m2.equals("forbici")&&m1.equals("carta")) || (m2.equals("carta")&&m1.equals("sasso"))){
            vc++;
            return "Vince "+p2.getNickname();
        }
        return "Patta";
    }
    
}
