import java.util.ArrayList;

public class Personnage {
	private String nom;
	private String description;
	private ArrayList<Pouvoir_Magique> spells;
	private ArrayList<Equipement> equipments;	
	/** 
	 * Constructor
	 * @param nom
	 * @param description
	 */
	public Personnage(String nom, String description) {
		this.nom = nom;
		this.description = description;
		this.spells=new ArrayList<Pouvoir_Magique>();
		this.equipments=new ArrayList<Equipement>();
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
	 *  test if the character has the spell in parameter
	 * @param pm
	 * @return String with the name of the spell in parameter
	 */
	public String gotSpell(Pouvoir_Magique pm) {
		if(spells.equals(pm)) {
			return "This caracter has this spell : "+pm.toString();
		}
		else {
			return "This caracter does not have this spell : "+pm.toString();
		}
	}
	/**
	 * add a new spell for the current character
	 * @param p
	 */
	public void addPouvoirMagique(Pouvoir_Magique p) {
		this.spells.add(p);
	}
	/**
	 * delete a spell for the current character
	 * @param p
	 */
	public void removePouvoirMagique(Pouvoir_Magique p) {
		this.spells.remove(p);
	}
	/**
	 * display the spells for the current character
	 */
	public void affichePouvoir(){
        for(Pouvoir_Magique p:spells) {
        	System.out.println(p.toString());
        }
    }
	public String getPouvoir() {
		return spells.toString();
	}
	public String gotEquipment(Equipement eq) {
		if(equipments.equals(eq)) {
			return "This caracter has this equipment : "+eq.toString();
		}
		else {
			return "This caracter does not have this equipment : "+eq.toString();
		}
	}
	/**
	 * add a new equipment for the current character
	 * @param p
	 */
	public void addEquipment(Equipement e) {
		this.equipments.add(e);
	}
	/**
	 * delete a equipment for the current character
	 * @param p
	 */
	public void removeEquipment(Equipement e) {
		this.equipments.remove(e);
	}
	/**
	 * display the equipments for the current character
	 */
	public void afficheEquipement(){
        for(Equipement e:equipments) {
        	System.out.println(e.toString());
        }
    }
	public String getEquipement() {
		return equipments.toString();
	}
	
	@Override
	public String toString() {
		return "Character\n name: " + nom + "\n description: " + description;
	}
	
}
