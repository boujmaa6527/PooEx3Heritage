package fr.fms.entities;

public class City {
	
		protected String nameCity;
		private String country;
		private int nbrOfPeople;
	//	
		
		public City(String nameCity, String country, int nbr) {
			this.nameCity =  nameCity;
			this.country = country; 
			this.nbrOfPeople =  nbr; 
			
		}
		//exercice 1.3
		public City(String nameCity, int nbrPeople) {
			this.nameCity = nameCity;
			this.nbrOfPeople = nbrPeople;
			this.country = "Inconnue"; 
		}
		public City(String nameCity, String country) {
			this.country = country;
			this.nameCity = nameCity;
			
		}
		public City(String nameCity) {
			this.nameCity = nameCity;
			
		}
		
		public String getNameCity() {
			return nameCity; 
		}
		public void SetName(String nameCity) {
			this.nameCity = nameCity; 
		}
		public String getCountry() {
			return country;
		}
		public void SetCountry(String country) {
			this.country =  country; 
		}
		public double getNbrOfPeople() {
			return nbrOfPeople; 
		}
		public void SetNbrPeople(int nbrOfPeople) {
			if(nbrOfPeople < 0) {
				throw new RuntimeException("Erreur : nombre négatif non autorisé"); 
			}
			this.nbrOfPeople = nbrOfPeople; 
		}
		public String toString() {
			return getNameCity() +" "
					+ getCountry()+ " "+
					getNbrOfPeople();
		}

}
