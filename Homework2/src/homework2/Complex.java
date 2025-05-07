package homework2;

public class Complex {
    private double Re;
    private double Imm;
    //costruttore vuoto
    public Complex(){
        
    }
    //costruttore con parametri
    public Complex(double Re, double Imm){
        this.Re=Re;
        this.Imm=Imm;
    }
    // costruttore di copia
    public Complex(Complex c){
        Re=c.Re;
        Imm=c.Imm;
    }
    //metodo get per Re
    public double getRe(){
        return Re;
    }
    //metodo set per Re
    public void setRe(double Re){
        this.Re=Re;
    }
    //metodo get per Imm
    public double getImm(){
        return Imm;
    }
    //metodo set per Imm
    public void setImm(double Im){
        this.Imm=Im;
    }
    //metodo per stampare Re e Imm
    public void stampa(){
        System.out.println("Re:"+Re+" Imm:"+Imm);
    }
    //metodo per calcolare il modulo
    public double modulo(){
        double modulo;
        modulo=Math.sqrt((Re*Re)+(Imm*Imm));
        return modulo;
    }
    //metodo per sommare due numeri complessi
    public Complex somma(Complex OP){
        Complex c=new Complex();
        double Reale=Re+OP.Re;
        double Immaginario=Imm+OP.Imm;
        c.setRe(Reale);
        c.setImm(Immaginario);
        return c;
    }
    //metodo per moltiplicare due numeri complessi
    public Complex prodotto(Complex OP){
        Complex c = new Complex();
        c.Re = Re*OP.Re-Imm*OP.Imm;//ac-bd
        c.Imm = Re*OP.Imm+OP.Re*Imm;//ad+bc
        return c;
    }
}
