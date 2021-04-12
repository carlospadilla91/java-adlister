import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BeanTest {

    public static void main(String[] args) {

        Album album = new Album();

        Author author = new Author();
        author.setFirstName("Carlos");
        author.setLastName("Padilla");
        author.setId(1);

        Quote quote1 = new Quote();
        quote1.setContent("To be or not to be.");
        quote1.setAuthor("Hamlet");
        Quote quote2 = new Quote();
        quote2.setContent("Do or do not. There is no try.");
        quote2.setAuthor("Master Yoda");
        Quote quote3 = new Quote();
        quote3.setContent("You miss 100% of the shots you don't take.");
        quote3.setAuthor("Wayne Gretzky");


        List<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);

        for (Quote quote : quotes) {
            System.out.println(quote.getContent() + " - " + quote.getAuthor());
        }
    }
}
