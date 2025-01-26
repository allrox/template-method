public class Main {
    public static void main(String[] args) {

        // These are the instances of the PDFDocument, WordDocument, and HTMLDocument classes. They receive a title and a content as arguments.
        Document pdf = new PDFDocument(
            "I'm the PDF title", 
            "This is your PDF document content.");
        Document word = new WordDocument(
            "I'm the Word document title",
            "This is your Word document content.");
        Document html = new HTMLDocument(
            "I'm the HTML title", 
            "This is your HTML document content.");

        pdf.print();
        word.print();
        html.print();

    }
}