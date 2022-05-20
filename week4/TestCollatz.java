public class TestCollatz{
    public static void main(String[] args){
        //Collatz Klasse initialisieren
            //Iterative Collatz Ergebnisse ausspielen
            System.out.println("Iterativ mit n=4 : " + Collatz.iterativ(4));
            System.out.println("Iterativ mit n=129 : " + Collatz.iterativ(129));
           //Rekursive Collatz Ergebnisse ausspielen
            System.out.println("Rekursiv mit n=4 : " + Collatz.rekursiv(4));
            System.out.println("Rekursriv mit n=129 : " + Collatz.rekursiv(129));
           
           
    }  
}