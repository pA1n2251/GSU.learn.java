package by.gsu.model;

import java.util.LinkedList;

public class Channel {
    private String title;
    private String link;
    private String description;
    private String language;
    private String ttl;
    private LinkedList<Item> items;

    public Channel() {
        items = new LinkedList<>();
    }

    public Channel(String title, String description, String language, String ttl, LinkedList<Item> items) {
        this.title = title;
        this.description = description;
        this.language = language;
        this.ttl = ttl;
        this.items = items;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public LinkedList<Item> getItems() {
        return items;
    }

    public void setItems(LinkedList<Item> items) {
        this.items = items;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", description='" + description + '\'' +
                ", language='" + language + '\'' +
                ", ttl='" + ttl + '\'' +
                ", items=" + items +
                '}';
    }
}
