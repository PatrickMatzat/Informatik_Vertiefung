public class TestMatrix{
    public static void main(String[] args){

        //Deklarieren und initialisieren ein Double-Array
        Double[][] array = { {1.0, 2.0}, {3.0, 4.0} };

        //Erstellen Matrixklasse Objekt
        Matrix M = new Matrix( array );

        //Anzahl der Matrix-Zeilen ausspielen
        System.out.println("Matrix-Zeilen: " + M.getNumRows());
        //Anzahl der Matrix-Spalten ausspielen
        System.out.println("Matrix-Spalten: " + M.getNumCols());

        //Ändern ein einzelnes Matrix-Element.
        M.set(10.0, 1, 1);
        //Einzelnes Matrix-Element ausspielen
        System.out.println("Matrix-Element: " + M.get(1,1));

        //Komplette Matrix ausspielen
        for(int i=0;i<M.getNumRows();i++){
            for(int j=0;j<M.getNumCols();j++){
                System.out.print(M.get(i,j) + " ");
            }
            System.out.println("");
        }
           
    }  
}