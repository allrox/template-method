// This is the WordDocument class that extends the Document class. It has a constructor that receives a title and a content, and it overrides the print method from the Document class. The print method prints the title and the content of the Word document.

public class WordDocument extends Document {
    
    // This block of code is the constructor of the WordDocument class. It receives a title and a content and calls the constructor of the superclass, passing the title and the content as arguments.
    public WordDocument(String title, String content) {
        super(title, content);
    }
    
    @Override
    public void print() {
        System.out.println("Printing Word Document: " + getTitle());
        System.out.println(getContent()+"\n");
    }
    
}
