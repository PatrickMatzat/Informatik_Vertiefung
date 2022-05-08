public class Suche  {    
    // Suchmethode
    public static int binaereSuche(Film suchObjekt, Film[] array){
        int max = array.length -1;
        int min = 0;
        int index, diff;
        while(min <= max){
            index = min + (max - min)/2;
            diff = suchObjekt.compareTo(array[index]);
            if(diff == 0){
                return index;
            }else if(diff > 0){
                min = index + 1;
            }else{
                max = index - 1;
            }
        }
        return -1;
    }

}
