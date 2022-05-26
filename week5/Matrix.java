public class Matrix<T>{

    //Attribute m. Zeile und Spalten.
    private T[][] m;

    //Methode
    //Konstruktor
    public Matrix(T[][] m){
        this.m = m;
    }

    public int getNumRows(){
        return this.m.length;
    }

    public int getNumCols(){
        return this.m[0].length;
    }

    public T get(int i, int j){
        return this.m[i][j];
    }

    public void set(T val, int i, int j){
        this.m[i][j] = val;
    }

}
