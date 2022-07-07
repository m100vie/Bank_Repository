package com.exercice.bank_application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankTest {

	@Test
	void testCalculPrct() {
		//ARRANGE
		final int débit = 40;
		final int nbCB  = 10;
		final Model model = new Model();

		//ACT
		final float result = model.calculPrct(débit, nbCB);

		//ASSERT
		assertEquals(25,result);
	}
	
	@Test
	void testSetGetNbCB() {
		//ARRANGE
		final Model model = new Model();
		

		//ACT
		final float result = model.setNbCB(50);;

		//ASSERT
		assertEquals(model.getNbCB(),result);
	}
	
	@Test
	void testSetGetNbCheque() {
		//ARRANGE
		final Model model = new Model();
		

		//ACT
		final float result = model.setNbCheque(3);;

		//ASSERT
		assertEquals(model.getNbCheque(),result);
	}
	
	@Test
	void testSetGetNbVirement() {
		//ARRANGE
		final Model model = new Model();
		

		//ACT
		final float result = model.setNbVirement(30);;

		//ASSERT
		assertEquals(model.getNbVirement(),result);
	}
	
	@Test
	void testSetGetDebit() {
		//ARRANGE
		final Model model = new Model();
		

		//ACT
		final float result = model.setNbDebit(50,30,40);;

		//ASSERT
		assertEquals(model.getNbDebit(),result);
	}
	
	@Test
	void testSetGetPrctCB() {
		//ARRANGE
		final Model model = new Model();


		//ACT
		final float result = model.setPrctCB(50);;

		//ASSERT
		assertEquals(model.getPrctCB(),result);

	}

	@Test
	void testSetGetPrctCheque() {
		//ARRANGE
		final Model model = new Model();


		//ACT
		final float result = model.setPrctCheque(50);;

		//ASSERT
		assertEquals(model.getPrctCheque(),result);

	}

	@Test
	void testSetGetPrctVirement() {
		//ARRANGE
				final Model model = new Model();


				//ACT
				final float result = model.setPrctVirement(33);

				//ASSERT
				assertEquals(model.getPrctVirement(),result);
	}

	
}
