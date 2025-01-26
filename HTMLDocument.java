// This is the HTMLDocument class that extends the Document class. It has a constructor that receives a title and a content, and it overrides the print method from the Document class. The print method prints the title and the content of the HTML document.

public class HTMLDocument extends Document {
    
    // This block of code is the constructor of the HTMLDocument class. It receives a title and a content and calls the constructor of the superclass, passing the title and the content as arguments.
    public HTMLDocument(String title, String content) {
        super(title, content);
    }
    
    @Override
    public void print() {
        System.out.println("Printing HTML Document: " + getTitle());
        System.out.println(getContent()+"\n");
    }
    
}
