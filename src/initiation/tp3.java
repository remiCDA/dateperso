package initiation;

import initiation.Clavier;

public class tp3 {

	public static void main(String[] args) {
		tp35variantedeux();

	}

	public static void tp31() {
		{
			System.out.println("Un");
			System.out.println("Deux");
			System.out.println("Trois");
		}
		System.out.println("Exit");
	}
/**
 * fonction pour tester Clavier
 */
	public static void tp32() {
		int i;
		System.out.println("saisissez un nombre");
		i = Clavier.lireInt();
		if (i != 1) {
			System.out.println("Vous avez saisi :" + i);
			System.exit(-1);
		} else {
			System.out.println("bravo");
		}
	}

	/**
	 * fonction pour tester le if reduit
	 */
	public static void tp33() {
		int i;
		System.out.println("saisissez un nombre");
		i = Clavier.lireInt();
		System.out.println(i != 1 ? "vous avez saisi :" + i : "bravo");
	}

	/**
	 * fonction pourdéfinir la "position" en fonction de la note
	 */
	public static void tp34() {
		int i;
		System.out.println(" Veuillez saisir la note");
		i = Clavier.lireInt();
		if (i >= 10) {
			System.out.println("Vous êtes admis(e)");
			if (i < 12) {
				System.out.println("Votre mention est assez bien");
			} else if (i < 14) {
				System.out.println("Votre mention est bien");
			} else {
				System.out.println("Votre mention est très bien");
			}
		} else if (i >= 8) {
			System.out.println("Vous êtes sur liste d'attente");
		} else {
			System.out.println("Vous êtes refusé(e)");
		}

	}

	/**
	 * fonction pour trouver la plus grande valeurs entre deux avec un if ... else
	 */
	public static void tp35() {
		int i;
		System.out.println(" Veuillez saisir la premiere valeur");
		i = Clavier.lireInt();
		int y;
		System.out.println(" Veuillez saisir la deuxieme valeur");
		y = Clavier.lireInt();
		if (i < y) {
			System.out.println("la plus grande valeur est : " + y);
		} else {
			System.out.println("la plus grande valeur est : " + i);
		}
	}

	/**
	 * fonction pour trouver la plus grande valeurs entre deux avec juste un if
	 */
	public static void tp35variante() {
		int i;
		System.out.println(" Veuillez saisir la premiere valeur");
		i = Clavier.lireInt();
		int y;
		System.out.println(" Veuillez saisir la deuxieme valeur");
		y = Clavier.lireInt();
		int z = i;
		if (i < y) {
			z = y;
		}
		System.out.println("la plus grande valeur est : " + z);

	}

	/**
	 * Fonction pour trouver la plus grande valeurs entre 4
	 */
	public static void tp35variantedeux() {

		System.out.println(" Veuillez saisir la premiere valeur");
		int i = Clavier.lireInt();
		System.out.println(" Veuillez saisir la deuxieme valeur");
		int y = Clavier.lireInt();
		System.out.println(" Veuillez saisir la deuxieme valeur");
		int z = Clavier.lireInt();
		System.out.println(" Veuillez saisir la deuxieme valeur");
		int za = Clavier.lireInt();
		if (i < y && z < y && za < y) {
			System.out.println("la plus grande valeur est : " + y);
		} else if (y < i && z < i && za < i) {
			System.out.println("la plus grande valeur est : " + i);
		} else if (y < z && i < z && za < z) {
			System.out.println("la plus grande valeur est : " + z);
		} else {
			System.out.println("la plus grande valeur est : " + za);
		}

	}
}
