public class Wort implements Text{
    private String w;

    public Wort(String wort){
        this.w = wort;
    }

    public String getText(){
        return this.w;
    }

    public void append(Text text){
        if (text instanceof Wort){
            Wort wort = (Wort)text;
            this.w = this.w + wort.getText();
        }
        
    }

}