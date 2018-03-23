import java.util.ArrayList;

public class Livre {
	private String titre;
	private ArrayList<Auteur> auteurs;
	private int anneePremiereParution;
	private ArrayList<Personnage> personnage;
	/**
	 * constructor
	 * @param titre
	 * @param auteur
	 * @param anneePremiereParution
	 */
	public Livre(String titre, Auteur auteur, int anneePremiereParution) {
		this.titre = titre;
		this.auteurs=new ArrayList<Auteur>();
		this.auteurs.add(auteur);
		this.anneePremiereParution = anneePremiereParution;
		this.personnage=new ArrayList<Personnage>();
	}
	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}
	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
	/**
	 * @return the anneePremiereParution
	 */
	public int getAnneePremiereParution() {
		return anneePremiereParution;
	}
	/**
	 * @param anneePremiereParution the anneePremiereParution to set
	 */
	public void setAnneePremiereParution(int anneePremiereParution) {
		this.anneePremiereParution = anneePremiereParution;
	}
	
	/**
	 * @return the auteurs
	 */
	public ArrayList<Auteur> getAuteurs() {
		return auteurs;
	}
	/**
	 * display all characters
	 */
    public void affichePersonnages(){
        for(Personnage pers:personnage) {
        	System.out.println(pers.toString());
        }
    }
    /**
     * add a character in the list
     * @param unPersonnage
     */
    public void ajoutPersonnage(Personnage unPersonnage){
        personnage.add(unPersonnage);
    }
    /**
     * remove a character in the list
     * @param unPersonnage
     */
    public void supprimePersonnage(Personnage unPersonnage){
        personnage.remove(unPersonnage);
    }
    /**
     * test if the list contains the character
     * @param nom
     * @return
     */
    public boolean contientPersonnage(String nom){
    	for(Personnage pers:personnage) {
        	if(pers.getNom().equals(nom)) {
        		return true;
        	}
        }
    	return false;
    }
    /**
     * display all authors for a book
     */
    public void afficheAuteurs(){
        for(Auteur a:auteurs) {
        	System.out.println(a.toString());
        }
    }
    /**
     * add an author
     * @param unAuteur
     */
    public void ajoutAuteur(Auteur unAuteur){
        auteurs.add(unAuteur);
        if(!unAuteur.getLivres().contains(this)) {
        	unAuteur.ajoutLivre(this);
        }
    }
    /**
     * delete an author
     * @param unAuteur
     */
    public void supprimeAuteur(Auteur unAuteur){
        auteurs.remove(unAuteur);
    }
	
	@Override
	public String toString() {
		return "Book\n title: " + titre +"\n publication date: " + anneePremiereParution;
	}
	public String histoire(Personnage p) {
		return " Il �tait une fois un chevalier qui s�appelait "+p.getNom()+" . Il etait "+p.getDescription()+". Il se promenait dans la for�t .Un jour "+p.getNom()+" rencontra un autre chevalier. Apr�s avoir eu une discussion, "+p.getNom()+" demanda au chevalier :\r\n" + 
				"\r\n" + 
				"� Comment t�appelles- tu ? \r\n" + 
				"\r\n" + 
				"Celui-ci r�pondit :\r\n" + 
				"\r\n" + 
				"_ Je ne te dirai mon nom que si tu acceptes de me combattre.\r\n" + 
				"\r\n" + 
				"_ Mais tu es fou ! � r�pliqua "+p.getNom()+".\r\n" + 
				"\r\n" + 
				"Mais celui-ci insista, alors "+p.getNom()+" se r�solut :\r\n" + 
				"\r\n" + 
				"� J�accepte ce d�fi mais je vais me battre en vrai chevalier �.\r\n" + 
				"\r\n" + 
				"Les deux  hommes se mirent face � face et le combat commen�a. "+p.getNom()+" mit son/sa "+p.getEquipement()+" en avant, l�autre chevalier fit de m�me et ils s��lanc�rent. Le choc fut tellement violent que leurs armes se heurt�rent, se bris�rent, vol�rent en �clat et retomb�rent comme l�eau d�un torrent qui tomberait du ciel.\r\n" + 
				"\r\n" + 
				"Les deux hommes se relev�rent et continu�rent le combat � l��p�e. "+p.getNom()+" utilisa son sort "+p.getPouvoir()+", qui fut tellement puissant qu'il transper�a l��cu de l�autre chevalier. Il continua avec acharnement et finit par lui briser son heaume. Le chevalier dit � "+p.getNom()+" :\r\n" + 
				"\r\n" + 
				"� Je t�en prie, �pargne-moi et accorde-moi la gr�ce.\r\n" + 
				"\r\n" + 
				""+p.getNom()+" dit alors :\r\n" + 
				"\r\n" + 
				"_ C�est d�accord, je te laisse la vie sauve en te rendant gr�ce.   \r\n" + 
				"\r\n" + 
				"_  Je m�appelle Pablo �, reprit alors le chevalier plein de reconnaissance.\r\n" + 
				"\r\n" + 
				"C�est ainsi que les deux chevaliers "+p.getNom()+" et Pablo devinrent  amis pour l��ternit�. ";
	}
	
}
