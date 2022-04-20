import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class ProjectII {

	private static final boolean False = false;

	@Test
	public void compare() {
		int a = 2;
		int b = 2;
		boolean False;
		 False = a==b;

		assertFalse (False,"content of variables should not be equal");
	}

	@Test
	public void compareReferenceTypes () {

		String s1 = "Apple";
		String s2 = "Apple";

		if ( s1==s2);{

			assertTrue (true, "As it compares memory location");


		}

	}

	@Test 

	public void compareReferenceTypes1 () {

		String a = new String ("Apple");
		String b = new String("Apple");

		if (a.equals(b)) {
			assertTrue (true,"As it use for content comparison");
		}
	
	}

	@Test

	public void AndOperator () {
		

		final boolean TRUE = true;
		final boolean FALSE = false;

		boolean resultOfTrueAndTrue = TRUE && TRUE;
		boolean resultOfFalseAndFalse = FALSE && FALSE;
		boolean resultOfTrueAndFalse = TRUE && FALSE;

		assertEquals(resultOfTrueAndTrue, "true && true values should be true.");
		assertEquals(resultOfFalseAndFalse, "true && false values should be false.");
		assertEquals(resultOfTrueAndFalse, "true && false values should be false.");
		  
	}

	@Test

	public void OrOperator () {
		
		final boolean TRUE = true;
		final boolean FALSE = false;

		boolean resultOfTrueOrTrue = TRUE || TRUE;
		boolean resultOfTrueOrFalse = TRUE || FALSE;
		boolean resultOfFalseOrFalse = FALSE || FALSE;

		assertEquals(resultOfTrueOrTrue, "true || true values should be true.");
		assertEquals(resultOfTrueOrFalse, "true || false values should be true.");
		assertEquals(resultOfFalseOrFalse, "false || false values should be false.");
	}

	@Test

	public void PostUnary () {

		int one = 1;
		int expectedValue = 1;

		int result = one++;

		assertEquals(result, expectedValue, "the number should be incremented after getting the value.");
		
		
	}
   @ Test
   public void Preunary () {
	   int one = 1;
		int expectedValue = 0;

		int result = --one;

		assertEquals(result, expectedValue, "the number should be decremented before getting the value.");
   }


	@Test

	public void NotOperator () {
		int a = 5;
		int b = 5;
		int c= 10;
		boolean d = true;	   

		if( !(a+b== c) &&( d== true));

		assertEquals(false,false);
	}

	@Test

	public void TwoIf () {

		boolean isTrue = true;
		boolean isFalse = false;
		boolean didFirstDecisionExecute = false;
		boolean didSecondDecisionExecute = false;

		if(isTrue) {
			didFirstDecisionExecute = true;
		}
		if(isFalse) {
			didSecondDecisionExecute = true;
		}

		assertTrue(didFirstDecisionExecute, "the first decision statement should be executed.");
		assertFalse(didSecondDecisionExecute, "the second decision statement should not be executed.");
	}


	@Test 
	public void IfElse () {
   
		boolean didFirstDecisionExecute = false;
		boolean didSecondDecisionExecute = false;

		if(False) {
			didFirstDecisionExecute = true;
		}
		else {
			didSecondDecisionExecute = true;
		}

		assertFalse(didFirstDecisionExecute, "the first decision statement should be executed.");
		assertTrue(didSecondDecisionExecute, "the second decision statement should not be executed.");


	}
	@Test
	public void NestedLoop ( ) {
		int loopCounter = 0;
		int loopLimit = 10;
		int nestedLoopCounter = 0;
		int nestedLoopLimit = 20;

		int expectedLoopCount = loopLimit;
		int expectedNestedLoopCount = loopLimit * nestedLoopLimit;

		for(int i = 0; i < loopLimit; i++) {
			loopCounter++;

			for(int j = 0; j < nestedLoopLimit; j++) {
				nestedLoopCounter++;
			}
		}

		assertEquals(loopCounter, expectedLoopCount, "outer loop should iterate up to the limit.");
		assertEquals(nestedLoopCounter, expectedNestedLoopCount, "nested loop should iterate to the nested loop limit for each outer loop iteration.");
	}


	@Test

	public void TryException () {

		boolean doesThrowException = false;

		try {
			throw new UnsupportedOperationException();
		}
		catch (UnsupportedOperationException ex) {
			doesThrowException = true;
		}

		assertTrue(doesThrowException, "the exception should be caught.");
		
	}

	@Test

	public void ForEach () {
		List <String> cars = new ArrayList<String>();
		List<String> newcars = new ArrayList<String>();
		newcars.add("BMW");
		newcars.add("Dodge");
		newcars.add("Ferrai");
		 for (String car1:newcars) {
	             cars.add(car1);
	

	}
		 assertEquals(cars,newcars, "should go through each item");
}
	


}