import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		//Test des methodes de la classe Livre
		Auteur a=new Auteur("Orwell","George","English");
        Livre l=new Livre("1984",a,1949);
        Auteur a2=new Auteur("Lee","Harper","English");
        Livre l2=new Livre("To Kill a Mockingbird",a2,1960);
        a.ajoutLivre(l2);
                
        Personnage p=new Personnage("Winston Smith","wow");
        System.out.println(l.toString());
        l.ajoutPersonnage(p);
        l.affichePersonnages();
        System.out.println(l.contientPersonnage("Winston Smith"));
        System.out.println(l.contientPersonnage("Sebastien Zecchinon"));
              
        //Test des methodes de la classe Bibliotheque
        Bibliotheque library=new Bibliotheque();
        library.addBook(l);
        System.out.println(library.containsBook(l));
        library.displayBooksByAuthor("George Orwell");
        l2.afficheAuteurs();
        //Test des methodes de la classe Auteur
        System.out.println(a.toString());
        //Test des methodes des pouvoirs magiques
        Pouvoir_Magique pm=new Pouvoir_Magique("Abracadabra","casual spell");
        p.addPouvoirMagique(pm);
        p.affichePouvoir();
        Equipement e1=new Equipement("Sword","A fire sword",52);
        Equipement e2=new Equipement("Shield","A wool shield",42);
        p.addEquipment(e2);
        p.addEquipment(e1);
        p.afficheEquipement();
        
        //Un petite histoire
        System.out.println("Nom :");
        String nomPerso=sc.next();
        System.out.println("Description :");
        String descPerso=sc.next();
        Personnage perso=new Personnage(nomPerso,descPerso);
        System.out.println("Objet :");
        String nomEquip=sc.next();
        System.out.println("Description de cette objet :");
        String descEquip=sc.next();
        System.out.println("Numero :");
        int dura=sc.nextInt();
        perso.addEquipment(new Equipement(nomEquip,descEquip,dura));
        System.out.println("Nom d'un sort :");
        String nomPower=sc.next();
        System.out.println("Description de ce sort :");
        String descPower=sc.next();
        p.addPouvoirMagique(new Pouvoir_Magique(nomPower,descPower));
        System.out.println(l.histoire(perso));
        
        
	}
}