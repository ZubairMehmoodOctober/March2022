import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ProjectII {

	@Test
	public void compare() {
		int a = 2;
		int b = 3;
		int c=  5;
		int result = a+b;

		assertEquals (c,result);
	}


	@Test
	public void compareReferenceTypes () {

		String s1 = "Apple";
		String s2 = "Apple";

		if ( s1==s2);{

			assertEquals (true, true);


		}








	}

	@Test 

	public void compareReferenceTypes1 () {

		String a = new String ("Apple");
		String b = new String("Apple");

		if (a.equals(b)) {
			assertequals (true,true);
		}
	}


	private void assertequals(boolean b, boolean c) {


	}

	@Test

	public void AndOperator () {

		int a = 5;
		int b = 5;
		int c = 10;	   

		if( (a+b== c) &&( c== a+b));

		assertEquals (true,true);




	}

	@Test

	public void OrOperator () {

		int a =3;
		boolean b=true;


		if ((a==4) || (b==true) );

		assertEquals (true,true);
	}

	@Test

	public void indde() {


		int a;
		int b;
		int c;
		int result=20;

		a=10;
		a++;
		b=10;
		--b;
		c= a+b;

		System.out.println (c);

		assertEquals (c,result);

	}



	@Test

	public void NotOperator () {
		int a = 5;
		int b = 5;
		int c= 10;
		boolean d = true;	   

		if( !(a+b== c) &&( d== true));

		assertEquals (false,false);
	}

	@Test

	public void TwoIf () {
		int temp = 98;
		boolean sunny = true;

		if (temp > 90 ) 
			System.out.println ("it is hot outside");
		if (sunny == true)
			System.out.println ("It is also sunny");
		assertEquals (true,true);
	}
	@Test 
	public void IfElse () {

		String word = "found word";
		String word1 = "we have not found the word";
		if (word.contains ("river")) {
			System.out.println ("we have found the word");
		}

		else {
			System.out.println ("we have not found the word");

		}


	}
	@Test
	public void NestedLoop ( ) {
		int t=1;
		int result=1;
		for (int i=1;i<=1;i++);
		for (int j=1;j<=2;j++ );{
			System.out.println (t+ " ");
		}
		assertEquals (t,result);
	}


	@Test

	public void TryException () {

		int a =5;
		int b=0;
		int c ;
		String d = "cant divide by zero";
		try {
			c= a/b;
		}
		catch (Exception e){
			System.out.println ("cant divide by zero");
		}


	}

	@Test

	public void ForEach () {
		String [] Cars = {"BMW","Ferrai","Dodge"};
		String [] result = {"BMW","Ferrai","Dodge"};
		for (String Car : Cars) {
			System.out.println ( Car);
		}
		assertEquals  (result, Cars);

	}
}



