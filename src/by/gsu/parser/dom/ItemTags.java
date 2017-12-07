package by.gsu.parser.dom;

import by.gsu.model.Item;
import org.w3c.dom.Node;

public enum ItemTags{
    TITLE ("title"){
        @Override
        protected void parseTag(Item item, Node node) {
            item.setTitle(node.getTextContent());
        }
    },
    LINK ("link") {
        @Override
        protected void parseTag(Item item, Node node) {
            item.setLink(node.getTextContent());
        }
    },
    DESCRIPTION("description") {
        @Override
        protected void parseTag(Item item, Node node) {
            item.setDescription(node.getTextContent());
        }
    },
    CATEGORY("category"){
        @Override
        protected void parseTag(Item item, Node node) {
            item.setCategory(node.getTextContent());
        }
    },
    GUID ("guid"){
        @Override
        protected void parseTag(Item item, Node node) {
            item.setGuId(node.getTextContent());
        }
    },
    PUB_DATE("pubDate") {
        @Override
        protected void parseTag(Item item, Node node) {
            item.setPubDate(node.getTextContent());
        }
    };


    private String tagName;

    ItemTags(String tagName) {
        this.tagName = tagName;
    }

    protected abstract void parseTag(Item item, Node node);

    public static void parseNode(Item item, Node node){
        String nodeName = node.getNodeName();
        for (ItemTags itemTag : values()) {
            if (itemTag.tagName.equals(nodeName)) {
                itemTag.parseTag(item, node);
                break;
            }
        }
    }
}

