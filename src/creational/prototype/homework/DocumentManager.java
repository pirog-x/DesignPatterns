package creational.prototype.homework;

import creational.prototype.homework.documents.Document;
import creational.prototype.homework.documents.SecureDocument;

public class DocumentManager {
    public Document createSecureCopy(final Document document) {
        Document copy = new SecureDocument(document.getId(), document.getTitle(),
                "SECURE COPY\n\n" + document.getContent());
        return copy;
    }
}
