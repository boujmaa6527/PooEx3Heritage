package fr.fms.entities;

public class Capitale extends City{

	public String monument;
	
	public Capitale( String name, String country, int nbrOfpeople, String monument) {
		super(name, country, nbrOfpeople);
		this.monument = monument; 
	}
	public Capitale (String monument) {
		super("");
		this.monument = monument; 
	}
	
	public String getMonument() {
		return monument; 
	}
	
	public void setMonument(String monu) {
		this.monument = monu;
	}
	public String toString() {
		
		return  "Ville de naissance: "+getNameCity() +", "  +getCountry() + " , " + getNbrOfPeople() + " d'habitant, monument: "+ getMonument();
				
				
	}
	
}
