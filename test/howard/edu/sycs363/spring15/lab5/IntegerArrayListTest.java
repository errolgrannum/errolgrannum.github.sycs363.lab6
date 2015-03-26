package howard.edu.sycs363.spring15.lab5;

import static org.junit.Assert.*;
import howard.edu.sycs363.spring15.lab3.IntegerArrayList;

import org.junit.Test;

public class IntegerArrayListTest {

	@Test
	 /*
	  * Tests the add method that adds an integer value to the end of the list
	  */
	public void testAdd() {
		IntegerArrayList tester = new IntegerArrayList();
		tester.add(10);
		tester.add(20);
		tester.add(4);
		
		
		// Tests
		assertEquals("Should return 10", 10, tester.get(0));
		assertEquals("Should return 20", 20, tester.get(1));
		assertEquals("Should return 4", 4, tester.get(2));
	}
	
	
	@Test
	/*
	 * // Tests the add method that adds an element at a specified index
	 */
	public void testSpecifyAdd(){
		
		IntegerArrayList tester = new IntegerArrayList();
		
		tester.add(3,22);
		tester.add(2,27);
		tester.add(8,9);
		tester.add(1,15);
		tester.add(0,3);
		tester.add(19,2);
		
		// Tests
		assertEquals("Should Return 22", 22, tester.get(3));
		assertEquals("Should Return 7", 27, tester.get(2));
		assertEquals("Should Return 9", 9, tester.get(8));
		assertEquals("Should Return 15", 15, tester.get(1));
		assertEquals("Should Return 3", 3, tester.get(0));
		assertEquals("Should Return 2", 2, tester.get(19));
	}
	
	/*
	 * 	Tests the get method that returns the integer value at the specified index
	 */
	@Test
	public void testGet(){
		// populating my test IntegerArrayList to test get method
		IntegerArrayList tester = new IntegerArrayList();
		tester.add(343);
		tester.add(101); 
		tester.add(56); 
		tester.add(64); 
		tester.add(13); 

		assertEquals("Method Should return the Value 343",343, tester.get(0));
		
		assertEquals("Method Should return the Value 101",101, tester.get(1));
		
		assertEquals("Method Should return the Value 56",56, tester.get(2));
		
		assertEquals("Method Should return the Value 64",64, tester.get(3));
		
		assertEquals("Method Should return the Value 13 ",13, tester.get(4));
		
	}
	
	@Test
	/*
	 *  testing indexOf against values that don't exist in the list
	 */
	public void testIndexOf(){
		//fail("Not yet implemented");
		IntegerArrayList tester = new IntegerArrayList();
		tester.add(33); 
		tester.add(11); 
		
		assertEquals("The index 1 should be returned", 1, tester.indexOf(11));
   
		assertEquals("The value -1 should be returned", -1, tester.indexOf(300000));
	}
	
	
	
	@Test
	/*
	 * Testing to determine if the list is empty
	 */
	public void testIsEmpty(){
		IntegerArrayList tester = new IntegerArrayList();
		
		assertTrue("Should return True",tester.isEmpty());
		
		tester.add(8);
		
		assertFalse("Should return False",tester.isEmpty());
	}
	
	
	@Test
	/*
	 * testing remove method 
	 * the remove method returns the value at the index specified
	 */
	public void testRemove(){
		//fail("Not yet implemented");
		IntegerArrayList tester = new IntegerArrayList();
		
		tester.add(3);
		tester.add(7);
		tester.add(2);
		tester.add(8);
		assertEquals("The value returned should be 2", 2, tester.remove(2));
		
		assertEquals("The value returned should be 3", 3, tester.remove(0));	
	}

}
