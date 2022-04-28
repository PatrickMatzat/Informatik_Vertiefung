public class TestDoubles{
    public static void main(String[] args){
           Doubles array[] = new Doubles[20];
           for(int i=0; i<20; i++){
               double[] param = {0.4 + i, -0.2 - i * 0.2, 14.1 - i, -11 + i * 1.1};
               array[i] = new Doubles(param);
               array[i].ausgabeRekursiv(3);
           }
           
    }  
}