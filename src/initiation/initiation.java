package initiation;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class initiation {

	public static void main(String[] args) {
		lancement();

	}

	/**
	 * method pour recuperer l'etat civil et l'afficher
	 */
	public static void etatcivil() {
		Scanner sc = new Scanner(System.in); // instancié l'objet scanner

		System.out.println("Veuillez saisir votre nom");// affiche dans la console le texte
		String name = sc.nextLine();// recupere la valeur saisie dans la console, ici le nom
		System.out.println("Veuillez saisir votre prenom");
		String surname = sc.nextLine();
		System.out.println("Veuillez saisir votre ville de naissance");
		String villeNaissance = sc.nextLine();
		System.out.println("Veuillez saisir votre jour de naissance");
		int jourNaissance = sc.nextInt();
		System.out.println("Veuillez saisir votre moi de naissance");
		int moiNaissance = sc.nextInt() - 1;
		System.out.println("Veuillez saisir votre année de naissance");
		int anneeNaissance = sc.nextInt();

		Calendar c1 = Calendar.getInstance();// creation calendrier
		c1.set(Calendar.MONTH, moiNaissance);// remplissage calendrier
		c1.set(Calendar.DATE, jourNaissance);
		c1.set(Calendar.YEAR, anneeNaissance);

		Date dateOne = c1.getTime();// recuperation du temps passer depuis 1970

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");// preformatage

		System.out.println(name + " " + surname);// affiche le nom que l'on a renseigné dans la console
		System.out.println(formatter.format(dateOne));// formate la date, puis l'affiche
		System.out.println(villeNaissance);

	}

	/**
	 * method pour afficher la date
	 */
	public static void aujourdhui() {
		Date maDate = new Date();// instancie l'objet date
		System.out.println("aujourd'hui nous sommes le " + maDate);// affiche la date du jour
		System.out.println("class avec Date : "+maDate.getClass());// affiche la class de maDate
		long time = maDate.getTime();// recupere la date d'aujourd'hui sous un autre format
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");// instancie l'objet avec le bon format
		String folderName = formatter.format(time);// formate la date contenu dans la variable time
		System.out.println("Date avec getTime() : " + folderName);// affiche la date formaté
		System.out.println("class avec getTime : "+folderName.getClass());// affiche la class de la date formaté
	}

	public static void lancement() {
		int randomNum = (int) (Math.random() * 101);
		if (randomNum == 42) {
			System.out.print("Non, j'ai pas envie.");
		} else {
		aujourdhui();
			etatcivil();
		}
	}
}
