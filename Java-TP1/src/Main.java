
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) throws Exception {
		//Test des methodes de la classe Livre
                Livre l=new Livre("1984","George Orwell",1949);
                Personnage p=new Personnage("Winston Smith","wow");
                System.out.println(l.toString());
                //l.ajoutPersonnage(p);
                //l.affichePersonnage();
                //System.out.println(l.contientPersonnage(p));
                
                //Test des methodes de la classe Bibliotheque
                ArrayList<Livre> collection=new ArrayList<>();
                Bibliotheque library=new Bibliotheque(collection);
                library.addBook(l);
                System.out.println(library.containsBook(l));
                library.displayBooksByAuthor("George Orwell");
	}
}
