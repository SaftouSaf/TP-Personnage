package Personnage;

/** 
* À l'aide du programme contenue dans le fichier jeuPersonnage.java nous devons créer un fichier Personnage.java car celui-ci utilise la classe Personnage. 
* Après avoir examiné le code nous pouvons en déduire que pour que le code fonctionne correctement, nous devons avoir une classe Personnage qui a des méthodes telles que LaVie, LeNom, AugmenterVie, et Attaque. 
* @author AFFANE Safouane
*/

public class Personnage {
	// Attributs de la classe
	private String nom; // Nom du personnage
	private int vie; // Points de vie du personnage
	
	/** Constructeur de la classe Personnage. 
	 * Cela permet d'instancier un objet de la classe Personnage ou en dans notre cas précis de créer un nouveau personnage.
	 * @param nom le nom du personnage
	 * @param vie la vie du personnage
	*/ 
	public Personnage(String nom, int vie) {
		this.nom = nom;
		this.vie = vie;
    }
	
	/** Méthode pour récupérer le nom du personnage.
	 * @return le nom du personnage
	*/ 
	public String LeNom() {
		return nom;
    }
	
	/** Méthode pour récupérer les points de vie du personnage.
	 * @return la vie du personnage */ 
	public int LaVie() {
        return vie;
    }
	
	/** Méthode pour augmenter les points de vie du personnage
	 * @param quantite la quantité de vie que l'on souhaite récupérer
	*/ 
	public void AugmenterVie(int quantite) {
        vie += quantite;
    }
	
	/** Méthode pour gérer une attaque du personnage sur une cible.
	 * La méthode inflige la moitié des dégats aux personnages cible mais également à l'attaquant.
	 * @param cible le personnage visé par l'attaque
	 * @param degats les dégats que l'on souhaite infliger au personnage cible
	*/ 
	public void Attaque(Personnage cible, int degats) {
        cible.vie-=degats / 2;
   		this.vie-=degats / 2;
	}
}

