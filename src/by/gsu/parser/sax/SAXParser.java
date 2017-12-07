//package by.gsu.parser.sax;
//
//import by.gsu.model.*;
//import org.xml.sax.SAXException;
//
//
//import javax.xml.parsers.ParserConfigurationException;
//import javax.xml.parsers.SAXParserFactory;
//import java.io.IOException;
//
//
//public class SAXParser {
//    public static Channel parse(String uri){
//        ChannelHandler channelHandler = new ChannelHandler();
//        try {
//            SAXParserFactory factory = SAXParserFactory.newInstance();
//            javax.xml.parsers.SAXParser saxParser = factory.newSAXParser();
//            saxParser.parse(uri, channelHandler);
//        } catch (ParserConfigurationException | IOException | SAXException e) {
//            e.printStackTrace();
//        }
//        return channelHandler.getChannel();
//    }
//}
