package homework3;

public abstract class Personaggio {
    private int x;
    private int y;
    protected boolean vivo;

    public Personaggio(){}

    public Personaggio(int x, int y, boolean vivo){
        this.x = x;
        this.y = y;
        this.vivo = vivo;
    }
    public Personaggio(Personaggio p){
        this.x = p.x;
        this.y = p.y;
        this.vivo = p.vivo;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public abstract void move(Campo campo);
    protected abstract void die();
}
