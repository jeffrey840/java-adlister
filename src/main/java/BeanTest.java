
import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {

        Album emptyAlbum = new Album();
        Album hitAlbum = new Album(1, "Michael Jackson", "Thriller", 1982, 50.2, "Pop, post-disco, funk, rock");

        Author WD = new Author(1, "Walt", "Disney");
        Author TR = new Author(2, "Tony", "Robbins");

        Quote TRQ = new Quote(1, TR, "The way to get started is to quit talking and begin doing.");
        Quote WDQ = new Quote(2, WD, "The only impossible journey is the one you never begin.");

        ArrayList<Quote> someQuotes = new ArrayList<>();
        someQuotes.add(TRQ);
        someQuotes.add(WDQ);

        for (Quote quote : someQuotes){
            System.out.println(quote.getContent() + "\n - " + quote.getAuthor().getFirstName() + " " + quote.getAuthor().getLastName());
        }

    }
}

//The way to get started is to quit talking and begin doing. -Walt Disney
//"The only impossible journey is the one you never begin." -Tony Robbins