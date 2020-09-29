package initiation;


public class ExoDeux {
	public static void main(String[] args) {
		moyenne();

	}

	public static void moyenne() {
		float pouet = 0;
		float[] monTableau = new float[4];
		float somme = 0;
		for (int y = 0; y < 4; y++) {
			do {

				System.out.println("saisie " + (y + 1) + "ere note :");
				pouet = Clavier.lireFloat();

			} while (pouet > 20 || pouet < 0);
			monTableau[y] = pouet;
			somme = somme + monTableau[y];
		}
		float moy = somme / 4;

		System.out.println("la moyenne est de : " + moy);

		if (moy >= 10) {
			System.out.println("Admis");
		} else if (moy > 8) {
			System.out.println("admissible");
		} else {
			System.out.println("recalé");
		}

	}

}
