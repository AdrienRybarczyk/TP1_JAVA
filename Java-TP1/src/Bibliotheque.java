
import java.util.ArrayList;


public class Bibliotheque {
    private ArrayList<Livre> library;
    public Bibliotheque(ArrayList<Livre> biblio){
        this.library=biblio;
    }
    public void addBook(Livre l){
        library.add(l);
    }
    public String containsBook(Livre l){
        if(library.contains(l)){
            return "This library contains the book : "+l.toString();
        }
        else{
            return "This library does not contain the book : "+l.toString();
        }
        
    }
    public void displayBooksByAuthor(String author){
        for(Livre book:this.library){
            if(book.getAuteur().equals(author)){
                System.out.println(book.toString());
            }
        }
    }
    
}
