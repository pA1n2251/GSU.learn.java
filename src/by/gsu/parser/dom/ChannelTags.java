package by.gsu.parser.dom;

import by.gsu.model.Channel;
import org.w3c.dom.Node;

public enum ChannelTags {
    TITLE ("title"){
        @Override
        protected void parseTag(Channel channel, Node node) {
            channel.setTitle(node.getTextContent());
        }
    },
    LINK ("link"){
        @Override
        protected void parseTag(Channel channel, Node node) {
            channel.setLink(node.getTextContent());
        }
    },
    DESCRIPTION ("description"){
        @Override
        protected void parseTag(Channel channel, Node node) {
            channel.setDescription(node.getTextContent());
        }
    },
    LANGUAGE("language") {
        @Override
        protected void parseTag(Channel channel, Node node) {
            channel.setLanguage(node.getTextContent());
        }
    },
    TTL("ttl"){
        @Override
        protected void parseTag(Channel channel, Node node) {
            channel.setTtl(node.getTextContent());
        }
    },
    ITEM("item") {
        @Override
        protected void parseTag(Channel channel, Node node) {
        }
    };

    private String tagName;

    ChannelTags(String tag) {
        this.tagName = tag;
    }

    protected abstract void parseTag(Channel channel, Node node);

    public static void parseNode(Channel channel, Node node){
        String nodeName = node.getNodeName();
        for (ChannelTags tag:ChannelTags.values()){
            if(tag.tagName.equals(nodeName)) {
                tag.parseTag(channel, node);
                break;
            }
        }
    }
}
