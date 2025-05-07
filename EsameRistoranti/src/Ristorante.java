
import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luigicirillo
 */
public class Ristorante {
    class Nodo{
        private Tavolo data;
        private Nodo next;
        
        public Nodo(Tavolo t){
            this.data=t;
            this.next=null;
        }
    }
    
    private final String nome;
    private int numTavoli;
    private Nodo testa;
    
    public Ristorante(String nome){
        this.nome=nome;
        this.numTavoli=0;
        this.testa=null;
    }
    private void push(Tavolo t){
        Nodo q = new Nodo(t);
        q.next = testa;
        testa = q;
    }
    
    
    public void addTable(Tavolo t){
        if (testa==null){
            push(t);
            return;
        }
        Nodo temp = testa;
        while(temp.next!=null){
            temp = temp.next;
        }
        Nodo q = new Nodo(t);
        temp.next=q;
    }
    
    public void LoadFromFile() {
        try(Scanner input = new Scanner (Paths.get("input.txt"))){
            this.numTavoli=input.nextInt();
            for (int i=0;i<numTavoli;i++){
                switch(input.next()){
                    case "Esterno":
                        var e = new Esterno(input.nextInt(), input.nextInt(), input.nextBoolean());
                        addTable(e);
                        break;
                    case "Interno":
                        var in = new Interno(input.nextInt(), input.nextInt(), input.nextBoolean());
                        addTable(in);
                        break;
                    default:
                        throw new IOException("Genere non valido");
                }
            }
        } catch (IOException ex){
            System.out.println("Errore in lettura: "+ex.getMessage());
        }
    }
    
    public void releaseTable(int num)throws NoSuchElementException {
        if (testa==null){
            throw new NoSuchElementException("Lista vuota");
        }
        if (!TableAt(num)){
            throw new NoSuchElementException("Tavolo non presente");
        }
        Nodo temp = testa;
        while(true){
            if (temp.data.getNumero()==num){
                temp.data.libera();
                return;
            }
            temp = temp.next;
        }
        
    }
    
    public void reserveTable(int numPosti) throws NoSuchElementException {
        Nodo temp = testa;
        
        while(temp!=null){
            if (temp.data.getNumPosti()==numPosti && !temp.data.isPrenotato()){
                temp.data.prenota();
                System.out.println(temp.data.toString());
                return;
            }
            temp = temp.next;
        }
        throw new NoSuchElementException("Nessun tavolo disponibile");
        
    }
    
    protected boolean TableAt(int num){
        Nodo temp = testa;
        while (temp!=null){
            if (temp.data.getNumero()==num){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    
    public boolean findTable(int num){
        Nodo temp = testa;
        while (temp!=null){
            if (temp.data.getNumPosti()==num){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    
    public void displayTables(){
        Nodo temp = testa;
        System.out.println("Ristorante "+nome);
        while (temp!=null){
            System.out.println(temp.data.toString());
            temp = temp.next;
        }
    }
    
}
