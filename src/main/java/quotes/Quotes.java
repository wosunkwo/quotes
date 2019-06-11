package quotes;

public class Quotes {
    String text;
    String starWarsQuote;

   public Quotes(String starWarsQuote, String text){
        this.starWarsQuote = starWarsQuote;
        this.text = text;
    }

    public String toString(){
       if(starWarsQuote != null){
           return String.format("%s\n", starWarsQuote);
       }else{
           return String.format("%s\n", text);
       }
    }
}
