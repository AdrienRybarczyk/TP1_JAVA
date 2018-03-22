
public class Livre {
	private String titre;
	private String auteur;
	private int anneePremiereParution;
	
	public Livre(String titre, String auteur, int anneePremiereParution) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.anneePremiereParution = anneePremiereParution;
	}
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public int getAnneePremiereParution() {
		return anneePremiereParution;
	}
	public void setAnneePremiereParution(int anneePremiereParution) {
		this.anneePremiereParution = anneePremiereParution;
	}

	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + ", anneePremiereParution=" + anneePremiereParution
				+ "]";
	}
	
}
