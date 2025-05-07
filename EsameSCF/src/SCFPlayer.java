/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author luigicirillo
 */
public abstract class SCFPlayer implements Player {
    
    protected String nickname;
    protected String mossa;
    protected boolean stato;
    
    public SCFPlayer(String nickname){
        this.nickname=nickname;
        this.stato=false;
    }
    
    
    public String getNickname(){
        return this.nickname;
    }
    public boolean getStato(){
        return this.stato;
    }
    public String getMossa(){
        return this.mossa;
    }
    public void setMossa(String mossa){
        this.mossa=mossa;
    }
    public void setStato(boolean s){
        stato=s;
    }
     
    @Override
    public abstract void move() throws IllegalArgumentException;

    @Override
    public boolean checkMove(String mossa) {
        if (mossa.equals("sasso")||mossa.equals("carta")||mossa.equals("forbici")){
            return true;
        }
        return false;
    }
    
}
