
public class Pouvoir_Magique {
	private String nom;
	private String description;
	/**
	 * constructor
	 * @param nom
	 * @param description
	 */
	public Pouvoir_Magique(String nom, String description) {
		this.nom = nom;
		this.description = description;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Pouvoir_Magique\n name: " + nom + "\n description: " + description;
	}
	
	
}
