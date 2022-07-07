package com.exercice.bank_application;

import java.util.*;

import ch.qos.logback.core.boolex.Matcher;

public class Controller {

	public Controller() {

		Model model = new Model();


		System.out.println(" Nombre de paiements par Carte Bleue : " ); 
		model.setNbCB(numbFilter());
		System.out.println(" Nombre de chèques émis : ");
		model.setNbCheque(numbFilter());
		System.out.println(" Nombre de virements automatiques : ");
		model.setNbVirement(numbFilter());

		model.setNbDebit(model.getNbCB(),model.getNbCheque(),model.nbVirement);
		model.setPrctCB(model.calculPrct(model.getNbDebit(),model.getNbCB()));
		model.setPrctCheque(model.calculPrct(model.getNbDebit(),model.getNbCheque())); 
		model.setPrctVirement(model.calculPrct(model.getNbDebit(),model.getNbVirement())); 


		System.out.println(); 
		System.out.println(" _______________________" );
		System.out.println(); 
		System.out.println(" Vous avez emis " + model.getNbDebit() +" ordres de débit " );
		System.out.println(" dont :  - " + model.getPrctCB() + " % par Carte bleue " );
		System.out.println("         - " + model.getPrctCheque() + " % par cheque " );
		System.out.println("         - " + model.getPrctVirement() + " % par virement " );

	}

	public static  int numbFilter() {
		Scanner lectureClavier = new Scanner(System.in);
		String valeur ="";
		int i;

		do {
			try{
				//System.out.print("Veuillez renter un chiffre : ");
				valeur = lectureClavier.next();
			} 
			catch(Exception e ){
				System.out.println("Erreur de saisie");
			}
		}while (isInteger(valeur)==false);	

		return i=Integer.parseInt(valeur);  
	};


	public static boolean isInteger(String text) {

		if (text.matches("^[0-9]+$") && !text.contentEquals(" ")) {
			//System.out.println("saisie ok");
			return true;
		} 
		else
			System.out.println("erreur saisie ");
		return false;
	}

}
