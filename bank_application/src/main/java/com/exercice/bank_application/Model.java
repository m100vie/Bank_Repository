package com.exercice.bank_application;



public class Model {


	int nbCheque = 0, nbVirement = 0 ,nbCB = 0, nbDebit = 0;


	float prctCB, prctCheque, prctVirement;


	public float setPrctCB(float prctCB) {
		return this.prctCB = prctCB;
	}

	public float setPrctCheque(float prctCheque) {
		return this.prctCheque = prctCheque;
	}

	public float setPrctVirement(float prctVirement) {
		return this.prctVirement = prctVirement;
	}

	public int getNbCB() {
		return nbCB;
	}

	public float setNbCB(int nbCB) {
		return this.nbCB = nbCB;
	}

	public int getNbCheque() {
		return nbCheque;
	}

	public float setNbCheque(int nbCheque) {
		return this.nbCheque = nbCheque;
	}

	public int getNbVirement() {
		return nbVirement;
	}

	public float setNbVirement(int nbVirement) {
		return this.nbVirement = nbVirement;
	}

	public int getNbDebit() {
		return nbDebit;
	}

	public float setNbDebit(int nbCheque, int nbCB, int  nbVirement) {
		return this.nbDebit = nbCB + nbCheque + nbVirement;
	}

	public float getPrctCB() {
		return prctCB;
	}



	public float getPrctCheque() {
		return prctCheque;
	}



	public float getPrctVirement() {
		return prctVirement;
	}

	public float calculPrct(int debit, int nb) {
		return (float) nb / debit * 100;
	}


}
