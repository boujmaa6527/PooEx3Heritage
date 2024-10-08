package fr.fms.entities;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//City c1 = new City("marseille", "france", 500000);
		Capitale cap1 = new Capitale("marseille", "france", 500000, "stade santiago" );
		
		Employe e1 = new Employe("zidane", "zinedine", 55, "madrid", cap1, "real de madrid", 10000000);
		System.out.println(e1.toString());
	}
	//String nom, String prenom, int age, String adresse,String nameCity, String country, int nbrOfPeople, Capitale monument, String entreprise, double salaire
}
