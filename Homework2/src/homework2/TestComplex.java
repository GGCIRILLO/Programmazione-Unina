package homework2;

public class TestComplex {
    public static void main(String[] args) {
        //test costruttori 
        Complex c1 = new Complex();
        Complex c2 = new Complex(7.7, 2.5);
        Complex c3 = new Complex(c2);
        
        //test stampa
        System.out.println("Stampa dei 3 complessi");
        System.out.println("c1: ");
        c1.stampa();
        System.out.println("c2: ");
        c2.stampa();
        System.out.println("c3: ");
        c3.stampa();

        //test get e set
        System.out.println("Test get e set");
        System.out.println("Re di c2: "+c2.getRe());
        System.out.println("Imm di c2: "+c2.getImm());
        c2.setRe(3.3);
        c2.setImm(4.4);
        System.out.println("Re di c2 dopo set: "+c2.getRe());
        System.out.println("Imm di c2 dopo set: "+c2.getImm());

        //test modulo
        System.out.println("Test modulo");
        System.out.println("Modulo di c2: "+c2.modulo());

        //test somma
        System.out.println("Test somma");
        Complex c4 = c2.somma(c3);
        System.out.println("Somma di c2 e c3: ");
        c4.stampa();

        //test prodotto
        System.out.println("Test prodotto");
        Complex c5 = c2.prodotto(c3);
        System.out.println("Prodotto di c2 e c3: ");
        c5.stampa();
        
    }
}
