public class Mergesort {

    // von aussen zugreifbare Sortier-Methode
    public static void sort(int[] arr) {
        int l=arr.length;
        int[] arr1=new int[l]; 
        SortRecrusiv(arr, arr1,0,l-1); 
    }

    private static void Mix(int[]a, int[] b, int anfang,int ende, int m){
      int i=anfang; 
      int j=m; 
      for (int s=anfang; s<=ende;s++){
          if (i<=m-1 && j<=ende){
              if (a[i]<=a[j]){
                  b[s]=a[i++]; 
                }
                 else {
                     b[s]=a[j++];
                 }
          
          
              } else {
                  if (i<=m-1){
                      b[s]=a[i++];
                  } else {
                      b[s]=a[j++];
                  }

              } 
            }

        for (int s=anfang; s<=ende;s++) {

        a[s]=b[s];
              

      }



    }

    private static void SortRecrusiv(int[] a, int [] b, int anfang, int ende ){

     if (anfang<ende){
         int m=(anfang+ende+1)/2; 
         SortRecrusiv(a, b, anfang, m-1);
         SortRecrusiv(a, b, m, ende);
         Mix(a, b, anfang, ende, m);
         
     }


    }


}
