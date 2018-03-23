import java.util.ArrayList;

public class Auteur {
	private String nom;
	private String prenom;
	private String langue;
	private ArrayList<Livre> livres;
	/**
	 * Constructor
	 * @param nom
	 * @param prenom
	 * @param langue
	 */
	public Auteur(String nom, String prenom, String langue) {
		this.nom = nom;
		this.prenom = prenom;
		this.langue = langue;
		this.livres=new ArrayList<Livre>();
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the langue
	 */
	public String getLangue() {
		return langue;
	}
	/**
	 * @param langue the langue to set
	 */
	public void setLangue(String langue) {
		this.langue = langue;
	}
	/**
	 * @return the livres
	 */
	public ArrayList<Livre> getLivres() {
		return livres;
	}
	/**
	 * display all books for the current author
	 */
	public void afficheLivres(){
        for(Livre l:livres) {
        	System.out.println(l.toString());
        }
    }
	/**
	 * add a book for the current author
	 * @param unLivre
	 */
    public void ajoutLivre(Livre unLivre){
        livres.add(unLivre);
        if(!unLivre.getAuteurs().contains(this)) {
        	unLivre.ajoutAuteur(this);
        }
    }
    /**
     * delete a book for the current author
     * @param unLivre
     */
    public void supprimeLivre(Livre unLivre){
        livres.remove(unLivre);
    }
	@Override
	public String toString() {
		return "Auteur\n name: " + nom + "\n prenom: " + prenom + "\n langue: " + langue;
	}  
}
