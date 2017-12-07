import by.gsu.model.Channel;
import by.gsu.parser.dom.DOMParser;

public class Runner {
    private static final String URI = "https://news.tut.by/rss/index.rss";
    public static void main(String[] args) {
        Channel domPasesChanel = DOMParser.parse(URI);
        System.out.println(domPasesChanel);
    }
}
