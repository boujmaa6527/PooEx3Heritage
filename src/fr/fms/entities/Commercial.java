package fr.fms.entities;

public class Commercial extends Personne {
	
		private double chiffreAffaire;

		public Commercial(String nom, String prenom, int age, String adresse, City city, double chiffreAffaire) {
			super(nom, prenom, age, adresse, city);
			this.chiffreAffaire = chiffreAffaire;
		}
//		public Commercial(String nom, String prenom, int age, String adresse, City city, double chiffreAffaire) {
//			super(nom, prenom, age, adresse, city);
//			this.chiffreAffaire = chiffreAffaire;
//		}

		public double getChiffreAffaire() {
			return chiffreAffaire;
		}

		public void setChiffreAffaire(double chiffreAffaire) {
			this.chiffreAffaire = chiffreAffaire;
		} 
		
//		public String toString() {
//			
//			return 
//		}

}
