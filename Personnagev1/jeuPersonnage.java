import Personnage.*;
public class jeuPersonnage{
    public static void main(String args[]) {
       Personnage UnSorcier = new Personnage("Sorcier",70);
       System.out.println("La vie du sorcier est " + UnSorcier.LaVie());

       Personnage UnMagicien = new Personnage("Magicien",100);
       System.out.println("La vie du magicien est " + UnMagicien.LaVie());

       System.out.println("Le nom du sorcier = " + UnSorcier.LeNom());
       System.out.println("Le nom du magicien = " + UnMagicien.LeNom());

       System.out.println("La vie du sorcier est " + UnSorcier.LaVie());
       UnSorcier.AugmenterVie(10);
       System.out.println("Apres la vie du sorcier est " + UnSorcier.LaVie());

       System.out.println("le magicien attaque le sorcier ...");
       UnMagicien.Attaque(UnSorcier,40);
       System.out.println("Atak La vie du magicien est " + UnMagicien.LaVie());
       System.out.println("Atak La vie du sorcier est " + UnSorcier.LaVie());
	}
}