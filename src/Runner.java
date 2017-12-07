import by.gsu.model.Channel;
import by.gsu.parser.dom.DOMParser;
import by.gsu.parser.stax.StAXParser;

public class Runner {
    private static final String URI = "https://news.tut.by/rss/index.rss";
    public static void main(String[] args) {
        Channel domParsesChanel = DOMParser.parse(URI);
        Channel staxParser = StAXParser.parse(URI);
        System.out.println(staxParser);
    }
}
