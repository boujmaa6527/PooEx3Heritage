package fr.fms.entities;

public class Employe extends Personne{
	
		private double salaire; 
		private String entreprise;
		//private City villeNaissance;  
		
		public Employe(String nom, String prenom, int age, String adresse, Capitale villeNaissance) {
			//super(nameCity,country, nbrOfPeople,nom, age, prenom, adresse);
			super(nom, prenom, age, adresse, villeNaissance);
//			this.monument = monument;
//			this.salaire = salaire;
//			this.entreprise = entreprise;
			
		}
		public Employe(String nom, String prenom, int age, String adresse, Capitale villeNaissance, String entreprise, double salaire) {
			//super(nameCity,country, nbrOfPeople,nom, age, prenom, adresse);
			super(nom, prenom, age, adresse, villeNaissance);
			this.salaire = salaire;
			this.entreprise = entreprise;
			
		}
		
		
		public String getEntreprise() {
			return entreprise;
		}
		public void setEntreprise(String entreprise) {
			this.entreprise = entreprise;
		}
		
		
		// rajout de tous les attribut de la class Mere a cause l 'Héritage.
//		public Employe(String nom, String prenom, int age, String adresse,String nameCity, String country, int nbrOfPeople, String monument, String entreprise, double salaire) {
//			super(nameCity,country, nbrOfPeople,nom, age, prenom, adresse);
//			
//			this.salaire = salaire;
//			this.entreprise = entreprise;
//			this.monument = monument;
//		}
		
		
		
		public double getSalaire() {
			return salaire;
		}
		public void setSalaire(double salaire) {
			this.salaire = salaire;
		}
		@Override
		public String toString() {
			return getNom() + ", "+
					getPrenom() + ", "+
					getAge() + ", Habitant à "+
							getAdresse() + " "+
								getCapitale() + " "+
										" "+
											", Entreprise: "+
												getEntreprise() + ", salaire: "+
													getSalaire();
														
												
													
									
								
							
		}
		
		
}
