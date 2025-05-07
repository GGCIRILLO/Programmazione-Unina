package homework3;

public class Zombie extends Personaggio{
    private static int zombieCount = 0;

    public Zombie(int x, int y){
        super(x, y, true);
        zombieCount++;
    }


    @Override
    public void move(Campo campo) {
        int x = this.getX()+1;
        int y = this.getY();
        
        if (!this.vivo){
            System.out.println("Zombie morto");
            return;
        }
        if (!campo.isValidPosition(x, y)) {
            System.out.println("Posizione non valida");
            return;
        }
        if (campo.whois(x, y) instanceof Zombie){
            System.out.println("Zombie non può muovere su Zombie davanti");
            return;
        }
        if (campo.whois(x, y) instanceof Alien){
            campo.whois(x, y).die();
            campo.removePersonaggio(x, y); //remove next
            
        }
        campo.placePersonaggio(x, y, this);
        campo.removePersonaggio(x-1, y); //remove attuale
        this.setX(x);
    }

    @Override
    protected void die() {
        zombieCount--;
        this.vivo = false;
    }

    public static int getZombieCount(){
        return zombieCount;
    }    
    
}
