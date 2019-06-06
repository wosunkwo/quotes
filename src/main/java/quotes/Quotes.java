package quotes;

public class Quotes {
    String[] tags;
    String author;
    String likes;
    String text;

    Quotes(String[] tags, String author, String likes, String text){
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    @Override
    public String toString(){
        return String.format("%s\n%s\n", author, text);
    }

}
