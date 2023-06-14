package creational.prototype.homework;

import creational.prototype.homework.documents.Document;
import creational.prototype.homework.documents.SecureDocument;

public class DemoDocsPrototype {
    public static void main(String[] args) {
        DocumentManager documentManager = new DocumentManager();
        Document originalDocument = new SecureDocument(1, "Sample Document", "This is the original content");
        Document secureCopy = documentManager.createSecureCopy(originalDocument);

        System.out.println("Original Document:");
        System.out.println("ID: " + originalDocument.getId());
        System.out.println("Title: " + originalDocument.getTitle());
        System.out.println("Content: " + originalDocument.getContent());

        System.out.println("Secure Copy:");
        System.out.println("ID: " + secureCopy.getId());
        System.out.println("Title: " + secureCopy.getTitle());
        System.out.println("Content: " + secureCopy.getContent());

    }
}
