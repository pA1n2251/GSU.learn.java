package by.gsu.parser.dom;

import by.gsu.model.Channel;
import by.gsu.model.Item;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class DOMParser {
    public static Channel parse(String uri){
        Channel channel = null;
        try (InputStream is = new URL(uri).openConnection().getInputStream()){
            DocumentBuilder builder = initParser();
            Document doc = builder.parse(is);
            NodeList nodeList = doc.getElementsByTagName("channel").item(0).getChildNodes();
            channel = parseChanel(nodeList);
        } catch (IOException | ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }
        return channel;
    }

    private static DocumentBuilder initParser() throws ParserConfigurationException{
        DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
        return f.newDocumentBuilder();
    }

    private static Channel parseChanel(NodeList channelList){
        Channel channel = new Channel();
        for (int i = 0; i<channelList.getLength(); i++){
            Node node = channelList.item(i);
            if ("item".equals(node.getNodeName())){
                Item item = parseItem(node.getChildNodes());
                channel.getItems().add(item);
            } else {
                ChannelTags.parseNode(channel, node);
            }
        }
        return channel;
    }

    private static Item parseItem(NodeList itemList){
        Item item = new Item();
        for (int i=0;i<itemList.getLength();i++){
            Node node = itemList.item(i);
            ItemTags.parseNode(item, node);
        }
        return item;
    }

}
