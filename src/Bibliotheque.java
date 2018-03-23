import java.util.ArrayList;

public class Bibliotheque {
    private ArrayList<Livre> library;
    /**
     * constructor
     */
    public Bibliotheque(){
        this.library=new ArrayList<Livre>();
    }
    /**
     * add a book in the library
     * @param l
     */
    public void addBook(Livre l){
        this.library.add(l);
    }
    /** 
     * test if the library contains the book in parameter
     * @param l
     * @return String with the name of the book in parameter
     */
    public String containsBook(Livre l){
        if(this.library.contains(l)){
            return "This library contains the book : "+l.toString();
        }
        else{
            return "This library does not contain the book : "+l.toString();
        }
        
    }
    /*public void displayBooksByAuthor(String author){
        for(Livre book:this.library){
            if(book.getAuteur().equals(author)){
                System.out.println(book.toString());
            }
        }
    }*/
    /**
     * display the books that an author has written
     * @param author
     */
    public void displayBooksByAuthor(String author){
        for(Livre book:this.library){
        	Livre livre = this.library.get(this.library.indexOf(book));
        	for(Auteur a:livre.getAuteurs()) {
                if(a.getNom().equals(author)){
                    System.out.println(book.toString());
                }
        	}
        }
    }
}