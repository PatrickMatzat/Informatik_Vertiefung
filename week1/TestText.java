public class TestText{
    public static void main(String[] args){
    
        Text t1;
        Text t2;
        String text1 = "Text1";
        String text2 = "Text2";
        Wort w1 = new Wort(text1);
        Wort w2 = new Wort(text2);
        w1.append(t1);
        w2.append(t2);

        //Append Wort1 to Wort2
        w2.append(t2);

    }
}
