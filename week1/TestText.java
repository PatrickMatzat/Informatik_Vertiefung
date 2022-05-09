public class TestText{
    public static void main(String[] args){
    
        Text t1;
        Text t2;
        String text1 = "Text1";
        String text2 = "Text2";

        //Wörter Objekte konstruieren
        Wort w1 = new Wort(text1);
        Wort w2 = new Wort(text2);

        //Append Wort1 to Wort2 bzw. Wort1 zu Wort2 zuweisen
        w2.append(w1);

        //Konkateniertes Wort 2 auspielen
        System.out.println(w2.getText());

        //Neues konkateniertes Wort 2 testen
        String result = w2.getText();
        if(result.equals("Text2Text1")){
            System.out.println("Test succesfully run!");
        }else {
            System.out.println("Test failed!");
        }

    }
}
