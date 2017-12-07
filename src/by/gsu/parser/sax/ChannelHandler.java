package by.gsu.parser.sax;

import by.gsu.model.Channel;
import by.gsu.model.Item;
import jdk.internal.org.xml.sax.Attributes;
import jdk.internal.org.xml.sax.SAXException;
import jdk.internal.org.xml.sax.helpers.DefaultHandler;

import java.util.LinkedList;

public class ChannelHandler extends DefaultHandler {
    private boolean isChannel;
    private Channel channel;
    private LinkedList<Item> items;

    private String thisElement;

    private String title;
    private String link;
    private String description;
    private String pubDate;
    private String category;
    private String guId;

    @Override
    public void startDocument() throws SAXException {
        this.channel = new Channel();
        items = new LinkedList<>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        thisElement = qName;
        switch (qName){
            case "channel":
                this.isChannel = true;
                break;
            case "item":
                this.isChannel = false;
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName){
            case "channel":
                this.channel.setItems(items);
                break;
            case "item":
                this.items.add(new Item(title, link, description, pubDate, category, guId));
                this.title="";
                this.link="";
                this.description="";
                this.pubDate="";
                this.category="";
                this.guId="";
                break;
        }
        thisElement = "";
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length);
        if (isChannel){
            switch (thisElement){
                case "link":
                    this.channel.setLink(value);
                    break;
                case "description":
                    this.channel.setDescription(value);
                    break;
                case "language":
                    this.channel.setLanguage(value);
                    break;
            }
        }else {
            switch (thisElement){
                case "title":
                    this.title = value;
                    break;
                case "link":
                    this.link = value;
                    break;
                case "description":
                    this.description = value;
                    break;
                case "pubDate":
                    this.pubDate = value;
                    break;
                case "category":
                    this.category = value;
                    break;
                case "guid":
                    this.guId = value;
                    break;
            }
        }

    }

    public Channel getChannel() {
        return channel;
    }

}
