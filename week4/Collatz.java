public class Collatz {

    //Iterative Collatz Methode
    public static int iterativ(int n){
        int i=0;
        while( n != 1){
            i++;
            if( n%2 == 0){
                n = n/2;
            }else{
                n = 3*n +1;
            }   
        }
        return i;
    }

    //Rekursive Collatz Funktion
    public static int rekursiv(int n){
        if( n == 1) return 0;
        if( n%2 == 0){ //Gerade
            return 1 + rekursiv( n/2 );
        }else {
            return 1 + rekursiv( 3*n + 1);
        }
        
    }

}
