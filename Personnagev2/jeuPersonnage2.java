import Personnage2.*;
import java.util.Scanner;
import java.util.Random;
public class jeuPersonnage2{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		// Nom du personnage 1 entrez par l'utilisateur
		System.out.print("Entrez le nom de votre premier personnage : ");
		String nom1 = scanner.next();

		// Nom personnage 2 entrez par l'utilisateur
		System.out.print("Entrez le nom de votre deuxiéme personnage : ");
		String nom2 = scanner.next();
		scanner.close();

		// Création tableau stockant des messages de défaites
		String[] msgs ={
			" a cassé sa pipe !",
			" a périt sous les coups !",
			" a mordu la poussiére !",
			" a subit une défaite amère !",
			" obtiendra sa revanche !",
			" n'avait pas la chance de son côté !",
			" a perdu la bataille mais pas la guerre !",
			" n'avait pas ce qu'il fallait !",
			" devrait retourner s'entraîner !",
			" a un profil plus intellectuel !",
			" devrait retourner à l'école !",
			" devrait aller pleurer chez sa maman !"
		};
		// Séléction aléatoire d'un message de défaite 
		Random random = new Random();
		int index = random.nextInt(msgs.length);
		String msg =  msgs[index];

		// Déclaration vie et nom du premier personnage
		Personnage2 personnage1 = new Personnage2(nom1,100);
		System.out.println("Le nom du premier personnage est " + personnage1.LeNom());
		System.out.println("La vie de " + personnage1.LeNom() + " est de " + personnage1.LaVie() + " pv.");

		// Déclaration vie et nom du deuxième personnage
		Personnage2 personnage2 = new Personnage2(nom2,100);
		System.out.println("Le nom du deuxième personnage est " + personnage2.LeNom());
		System.out.println("La vie de " + personnage2.LeNom() + " est de " + personnage2.LaVie() + " pv.");

		// Les deux personnages s'attaquent jusqu'à ce que l'un des deux meurt
		while (!personnage1.EstMort() && !personnage2.EstMort()){
			// Quantité de dégats infligés aléatoirement entre 0 et 20
			int dgt = random.nextInt(20);
			// Séléction aléatoire du personnage attaquant 
			int pers = random.nextInt(2);

			// Si le personnage 1 est selectionné alors celui-ci attaque le personnage 2
			if (pers == 0) {
				personnage1.Attaque(personnage2,dgt);
				System.out.println(personnage1.LeNom() + " attaque " + personnage2.LeNom() + " ...");
				System.out.println("Après l'attaque, la vie de " + personnage2.LeNom() + " est de " + personnage2.LaVie() + " pv.");
				System.out.println("Après l'attaque, la vie de " + personnage1.LeNom() + " est de " + personnage1.LaVie() + " pv.");
			} // Si le personnage 2 est selectionné alors celui-ci le personnage 1
			else{
				personnage2.Attaque(personnage1,dgt);
				System.out.println(personnage2.LeNom() + " attaque " + personnage1.LeNom() + " ...");
				System.out.println("Après l'attaque, la vie de " + personnage1.LeNom() + " est de " + personnage1.LaVie() + " pv.");
				System.out.println("Après l'attaque, la vie de " + personnage2.LeNom() + " est de " + personnage2.LaVie() + " pv.");
			}
			
			// Si le personange 1 meurt alors affiché un message de défaite aléatoire
			if (personnage1.EstMort()) {
				System.out.println(personnage1.LeNom() + msg);
			}

			// Si le personnage 2 meurt alors affiché un message de défaite aléatoire
			if (personnage2.EstMort()) {
				System.out.println(personnage2.LeNom() + msg);
			}
		}                                                                                                                          
	}
}
