package by.gsu.parser.stax;

import by.gsu.model.Channel;
import by.gsu.model.Item;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.LinkedList;


public class StAXParser {
    public static Channel parse(String uri) {
        Channel channel = null;
        try (InputStream is = new URL(uri).openConnection().getInputStream()) {
            channel = new Channel();
            LinkedList<Item> items = new LinkedList<>();
            String thisElement="";

            String title="";
            String link="";
            String description="";
            String pubDate="";
            String category="";
            String guId="";
            boolean isChannel=false;
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLEventReader eventReader = factory.createXMLEventReader(is);
            while (eventReader.hasNext()){
                XMLEvent event = eventReader.nextEvent();
                switch (event.getEventType()){
                    case XMLStreamConstants.START_ELEMENT:
                        thisElement = event.asStartElement().getName().getLocalPart();
                        String prefix = event.asStartElement().getName().getPrefix();
                        if(!prefix.isEmpty()){
                            thisElement=prefix+":"+thisElement;
                        }
                        switch (thisElement){
                            case "channel":
                                isChannel = true;
                                break;
                            case "item":
                                isChannel = false;
                                break;
                        }
                        break;

                    case XMLStreamConstants.CHARACTERS:
                        String value = event.asCharacters().getData();
                        if (isChannel){
                            switch (thisElement){
                                case "link":
                                    channel.setLink(value);
                                    break;
                                case "description":
                                    channel.setDescription(value);
                                    break;
                                case "language":
                                    channel.setLanguage(value);
                                    break;
                            }
                        }else {
                            switch (thisElement){
                                case "title":
                                    title = value;
                                    break;
                                case "link":
                                    link = value;
                                    break;
                                case "description":
                                    description = value;
                                    break;
                                case "pubDate":
                                    pubDate = value;
                                    break;
                                case "category":
                                    category = value;
                                    break;
                                case "guid":
                                    guId = value;
                                    break;
                            }
                        }
                        break;

                    case XMLStreamConstants.END_ELEMENT:
                        switch (event.asEndElement().getName().toString()){
                            case "channel":
                                channel.setItems(items);
                                break;
                            case "item":
                                items.add(new Item(title, link, description, pubDate, category, guId));
                                title="";
                                link="";
                                description="";
                                pubDate="";
                                category="";
                                guId="";
                                break;
                        }
                        thisElement = "";
                        break;
                }

            }
        } catch (IOException | XMLStreamException e) {
            e.printStackTrace();
        }
        return channel;
    }

}
