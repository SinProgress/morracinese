package it.morra;

public class MorraCinese {

    private StringBuilder mossa;

    protected static String SASSO="sasso";
    protected static String CARTA="carta";
    protected static String FORBICE="forbice";

    public MorraCinese(){
        this.mossa=new StringBuilder(7);
    }

    public MorraCinese(int n){
        this.mossa=new StringBuilder(7);
        if(n==0) this.mossa.append(SASSO);
        else if (n==1) this.mossa.append(CARTA);
        else this.mossa.append(FORBICE);
    }

    public void setMossa(int n) {
        this.mossa.delete(0,7);
        if(n==0) this.mossa.append(SASSO);
        else if (n==1) this.mossa.append(CARTA);
        else this.mossa.append(FORBICE);
    }
    public String getMossa() {
        return mossa.toString();
    }

    public int confronta(MorraCinese obj2){
        if(this.mossa.toString().equals(obj2.mossa.toString())) return 0;
        if(this.mossa.toString().equals(SASSO)&&obj2.mossa.toString().equals(FORBICE)) return 1;
        if(this.mossa.toString().equals(FORBICE)&&obj2.mossa.toString().equals(CARTA)) return 1;
        if(this.mossa.toString().equals(CARTA)&&obj2.mossa.toString().equals(SASSO)) return 1;
        return -1;
    }


}
