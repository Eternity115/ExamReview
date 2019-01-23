
public class Slotmachine {
    int poc, poa, ttnp;
    
    public Slotmachine(int payoutcycle,int payoutamount,int timetillnextpay){
        poc = payoutcycle;
        poa = payoutamount;
        ttnp = timetillnextpay;
    }
    
    public void decreaseTime(){
        
        ttnp = ttnp-1;
    }
    
    public int getTurns(){
        return ttnp;
    }
    
    public void reset(){
        ttnp=poc;
    }
    
    public int getPayout(){
        return poa;
    }
}
