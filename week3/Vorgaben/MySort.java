public class MySort {
    //Methode
    //Konstruktor
    public static void mySort(Comparable[] f){

        //Initializierung von vorne und hinten arrays
        Comparable vorne[] = new Comparable[f.length];
        Comparable[] hinten = new Comparable[f.length];

        //Erzeugung von hinten array
        for(int i=0; i<f.length ;i++){
            hinten[i] = f[i];
        }

        for(int i=f.length-1; i>0; i--){
            int pos = i;
            int comp = 1;
            int austausche = 1;
            Comparable kleinsten = hinten[i];
            for(int j=0; j<=i; j++){
                if(kleinsten.compareTo(hinten[j]) > 0){
                    pos = j; //Speichere Position von kleinsten Element
                }

                System.out.println("Anzahl compareTo Anrufe: "+comp);
                comp++;
            }
            //Tauschen von kleinste Element
            vorne[f.length-1-i] = hinten[pos];
            hinten[pos] = hinten[i];
            hinten[i] = null; //Array hinten length reduzieren. Wie genau?
            System.out.println("Anzahl von Austausche: "+austausche);
            austausche++;

        }
    }
}
