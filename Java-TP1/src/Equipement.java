
public class Equipement {
	private String nom;
	private String description;
	private int resistance;
	/**
	 * constructor
	 * @param nom
	 * @param description
	 */
	public Equipement(String nom, String description, int resistance) {
		this.nom = nom;
		this.description = description;
		this.resistance = resistance;
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
	/**
	 * @return the resistance
	 */
	public int getResistance() {
		return resistance;
	}
	/**
	 * @param resistance the resistance to set
	 */
	public void setResistance(int resistance) {
		this.resistance = resistance;
	}

	@Override
	public String toString() {
		return "Equipement\n name: " + nom + "\n description: " + description + "\n resistance: " + resistance;
	}


}
