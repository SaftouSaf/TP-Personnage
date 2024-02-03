package Personnage2;
public class Personnage2 {
	// Attributs de la classe
	private String nom; // Nom du personnage
	private int vie; // Points de vie du personnage
	
	/** Constructeur de la classe Personnage. 
	 * Cela permet d'instancier un objet de la classe Personnage ou en dans notre cas précis de créer un nouveau personnage.
	 * @param nom le nom du personnage
	 * @param vie la vie du personnage
	*/ 
	public Personnage2(String nom, int vie) {
		this.nom = nom;
		this.vie = vie;
    }
	
	/** Méthode pour récupérer le nom du personnage.
	 * @return le nom du personnage
	*/ 	public String LeNom() {
		return nom;
    }
	
	/** Méthode pour récupérer les points de vie du personnage
	 * @return 0 si jamais la vie est inférieur à 0 
	 * @return les points de vie si celle-ci est supérieur à 0
	*/ 
	public int LaVie() {
		if (this.vie < 0) {
			return 0;
        }else{
			return vie;
		}
    }
	
	/** Méthode pour gérer une attaque du personnage sur une cible.
	 * La méthode inflige des dégats aux personnages cible mais également la moitié des dégats à l'attaquant.
	 * @param cible le personnage visé par l'attaque
	 * @param degats les dégats que l'on souhaite infliger au personnage cible
	*/ 
	public void Attaque(Personnage2 cible, int degats) {
        cible.vie-=degats;
   		this.vie-=degats / 2;
	}

	/** Méthode permettant de savoir si un personnage est mort ou non
	 * @return la vie du personnage inférieur ou égale à 0 */ 
	public boolean EstMort(){
		return this.vie <= 0;
	}
}

