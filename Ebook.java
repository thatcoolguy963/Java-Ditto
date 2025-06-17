public class Ebook extends BookModel {
    
    private String format;
      private String title;
      private String author;
      private int pageCount;

    Ebook(String title, String author, int pageCount, String format) {
        super(title, author, pageCount);
        this.format = format;
        
    }
}
