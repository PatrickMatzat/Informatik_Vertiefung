public class Film  {
    
    // Attribute
    public String titel;
    public double preis; // in EUR
    public int    laenge; // in min
    public String beschreibung;
    public String erscheinungsdatum; // ISO-8601 (JJJJ-MM-TT)
    
    // Konstruktor
    public Film(String titel, double preis, int laenge, String beschreibung, String erscheinungsdatum) {
        this.titel = titel;
        this.preis = preis;
        this.laenge = laenge;
        this.beschreibung = beschreibung;
        this.erscheinungsdatum = erscheinungsdatum;
    }
    
    // Methoden
    
    //Ganze Information eines Films in ein String ausspielen
    public String toString(){
        String info = this.titel+", "+this.preis+", "+this.laenge+", "+this.beschreibung+", "+this.erscheinungsdatum;
        return info;
    }

    //Erscheinungsdatum von 2 Filme vergleichen
    public int compareTo(Film o){
        
        return this.erscheinungsdatum.compareTo(o.erscheinungsdatum);

    }

}
