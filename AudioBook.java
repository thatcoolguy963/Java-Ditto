public class AudioBook extends BookModel {
    
    private String title;
    private String author;
    private int pageCount;
    private int runTime;

    AudioBook(String title, String author, int pageCount, int runTime) {
        super(title, author, pageCount);
        this.runTime = runTime;
        
    }
}
