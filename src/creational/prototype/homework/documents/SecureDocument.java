package creational.prototype.homework.documents;

public class SecureDocument implements Document {
    private final long id;
    private String title;
    private String content;

    public SecureDocument(long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }


    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getContent() {
        return content;
    }
}
