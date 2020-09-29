package initiation;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dateperso {

	public static String aujourdhui() {
		
		Date maDate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");// instancie l'objet avec le bon format
		String aujourdhui = formatter.format(maDate);
		return aujourdhui;
	}
	public static String maintenant() {
		Date maDate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("HH'h'mm");
		String heure = formatter.format(maDate);
		return heure;
	}
	public static Calendar saisirDate() {
		Scanner sc = new Scanner(System.in);
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
		return c1;
	}

}
