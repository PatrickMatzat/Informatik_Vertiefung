public class TestDoubles{
    public static void main(String[] args){
        //Array initializieren
           Doubles array[] = new Doubles[20];
           //Elemente des Arrays laufen
           for(int i=0; i<20; i++){
               //Parameter definieren und damit Objekt konstruieren
               double[] param = {0.4 + i, -0.2 - i * 0.2, 14.1 - i, -11 + i * 1.1};
               array[i] = new Doubles(param);
               //Ganzes Array rekursiv für jedes Schritt auspielen.
               System.out.println("Double Element "+i+":");
               array[i].ausgabeRekursiv(3);
           }
           
    }  
}