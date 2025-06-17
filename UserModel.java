import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;


public class UserModel {
    
    private String name;
    private LocalDate birthDay;
    private ArrayList<BookModel> books = new ArrayList<BookModel>();

    UserModel(String name, String birthDay){
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    public void borrow(BookModel book){
        this.books.add(book);
     }

     public String borrowedBooks(){
        return this.books.toString();
     }

     public String getName(){
        return this.name;
     }

     public String getBirthDay(){
        return this.birthDay.toString();
     }

    public int age() {
        Period age = Period.between(this.birthDay, 
        LocalDate.now());

        return age.getYears();

        
    }
}
