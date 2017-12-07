package by.gsu.model;

public class Item {
    private String title;
    private String link;
    private String description;
    private String category;
    private String guId;
    private String pubDate;

    public Item() {
    }

    public Item(String title, String link, String description, String category, String guId, String pubDate) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.category = category;
        this.guId = guId;
        this.pubDate = pubDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGuId() {
        return guId;
    }

    public void setGuId(String guId) {
        this.guId = guId;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", guId='" + guId + '\'' +
                ", pubDate='" + pubDate + '\'' +
                "}\n";
    }
}
