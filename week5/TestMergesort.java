public class TestMergesort {

    public static void main(String[] args) {
      int [] arr=new int [] {90,12,6,8,10,1,123}; 
      Mergesort.sort(arr);
      System.out.print("Array nach dem sortieren : ") ; 
      for (int i=0;i<arr.length;i++){
          System.out.print(""+arr[i]+" ");
      }

       System.out.println(); 
        
    }

}
