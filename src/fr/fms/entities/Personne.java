package fr.fms.entities;

public class Personne {
	
		private  String nom;
		private String prenom;
		private  int age;
		private String adresse;
		private City city; 
		private Capitale capitale; 
		
		

		public Personne(String nom, String prenom, int age, String adresse,  City city) {
			this.nom = nom; 
			this.prenom = prenom;
			this.age = age;
			this.adresse = adresse; 
			this.city = city;
			
		}
		public Personne(String nom, String prenom, int age, String adresse,  Capitale cap) {
			this.nom = nom; 
			this.prenom = prenom;
			this.age = age;
			this.adresse = adresse; 
			this.capitale = cap;
			
		}
		



		public Capitale getCapitale() {
			return capitale;
		}
		public void setCapitale(Capitale capiatle) {
			this.capitale = capiatle;
		}
		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getAdresse() {
			return adresse;
		}

		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		public City getCity() {
			return city;
		}




		public void setCity(City city) {
			this.city = city;
		}

}
