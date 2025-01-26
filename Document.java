// This is an abstract class that will be extended by diferent document classes. It has a title, content, and a print method that will be implemented by the subclasses. It's important remembering that once it's an abstract class, it can't be instanced directly. 

// Note that it's very usefull when you need to stablish a common behavior for a group of classes that have some common attributes and methods. In this case, the Document class has a title and a content, and a print method that will be implemented by the subclasses, as they have different ways to print the document.

public abstract class Document {
    
    // These are the attributes of the Document class. As they are private, can only be accessed by the Document class itself.
    private String title;
    private String content;

    // This block of code is the constructor of the Document class. It receives a title and a content as arguments and assigns them to the attributes of the class.
    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }
    
    // This is an abstract method that will be implemented by the subclasses.
    public abstract void print();

    // These are the methods of the Document class. They print the title, content, and footer of the document.
    public void PrintHeader(){
        System.out.println("Document: " + title);
    }

    public void PrintContent(){
        System.out.println(content);
    }

    public void PrintFooter(){
        System.out.println("End of Document");
    }

    // These are the getters of the Document class. They allow the access to the attributes of the class.
    public String getContent(){
        return content;
    }

    public String getTitle(){
        return title;
    }

}
