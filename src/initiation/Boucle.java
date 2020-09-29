package initiation;

import java.util.Scanner;

public class Boucle {
	public static void main(String[] args) {
		tp46();
	}

	public static void tpboucle() {
		for (int i = 1; i < 6; i++) {
			System.out.println(i);
		}
		// Comment afficher cette même boucle pour i variant de 5 à 10 ?
		for (int i = 5; i < 10; i++) {
			System.out.println(i);
		}
		// Comment afficher cette même boucle i variant de 0 à 10, mais allant de 2 en 2
		// ?
		for (int i = 0; i < 10; i += 2) {
			System.out.println(i);
		}
	}

	public static void tp42() {

		final int fin = 10;// ceci est une constante, mot clé final
		int somme = 0;
		int i = 0;
		while (i < fin) {
			somme += i;
			i++;
		}
		System.out.println("La somme vaut :" + somme);
	}

	public static void tp43() {
		Scanner sc = new Scanner(System.in);
		int valeur;
		String chaine_lue;
		try {
			do {
				// Lecture d'une ligne au clavier
				chaine_lue = sc.nextLine();
				// Conversion de la chaine en entier
				valeur = Integer.parseInt(chaine_lue);
			} while ((valeur < 5) || (valeur > 10));
		} catch (Exception e) {
			System.out.println("Erreur d'Entree/Sortie " + e.getMessage());
		}
	}

	public static void tp44() {
		int x = 1;
		float a;
		while (x <= 10) {
			x++;
			System.out.print("x = " + x);
			if (x == 7) {
				System.out.println("\tDivision par zero!");
				continue;
			}
			a = (float) 1 / (x - 7);
			System.out.println(" \ta = " + a);
		}
	}

	public static void tp45() {
		int x = 1;
		double a = 0;
		for (x = 1; x <= 10; x++) {
			a = x - 7;
			if (a == 0) {
				System.out.println("Division par 0");
				break;
			}
			System.out.println(1 / a);
		}
	}

	public static void tp46() {
		for (int i = 0; i < 12; i++) {
			switch (i) {
			case 9:
				System.out.println("Neuf");
				break;
			case 8:
				System.out.print("Huit");
				System.out.println("b");
				break;
			case 7: {
				System.out.println("Sept");
				System.out.println("a");
			}
				break;
			case 6:
				System.out.print("Six ");
			case 5:
				System.out.println("Cinq");
				break;
			case 4:
			case 3:
				System.out.print("Quatre Trois ");
			case 2:
				System.out.println("Deux");
				break;
			case 1:
				System.out.println("Un");
				break;
			default:
				System.out.println("Zero");
				break;
			}
		}
		System.out.println("Fin");
	}
}
