public class Doubles {
    //Parameter definieren
    public double[] werte = new double[4];
    private double kleinstes;

    public Doubles(double array[]){
        //Array konstruieren
        for(int i = 0;i<array.length;i++){
            this.werte[i] = array[i];
        }
    }

    public double kleinere(double x, double y) {
        //Kleinere Parametern ausgeben
        if(Math.abs(x) < Math.abs(y)){
            return x;
        }else {
            return y;
        }
  }

    public void setKleinstes(){
        //Kleintes Parameter ausgeben
        this.kleinstes = this.werte[0];
        for(int i = 1;i<this.werte.length;i++){	
            this.kleinstes = kleinere(this.werte[i],this.kleinstes);
        }
    }

    void ausgabeRekursiv(int Index) {
        //Rekursiv Elemente des Arrays auspielen
        System.out.println(this.werte[Index]);
        if(Index != 0){
            ausgabeRekursiv(Index - 1);
        }

    }

}
