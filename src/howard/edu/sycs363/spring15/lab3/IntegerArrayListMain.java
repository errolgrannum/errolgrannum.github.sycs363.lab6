/**
 * 
 */
package howard.edu.sycs363.spring15.lab3;

/**
 * @author Errol Josiah Grannum
 * ID: @02714575
 *
 */
public class IntegerArrayListMain {

	/**
	 * Main Driver Method
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello, World");
		IntegerArrayList aList = new IntegerArrayList();
		System.out.println(aList.isEmpty());
		
		aList.add(10);
		aList.add(20);
		aList.add(3,13);
		aList.add(4);
		aList.add(2,27);
		aList.add(8,9);
		aList.add(1,15);
		aList.add(0,3);
		aList.add(19,2);
		int value = aList.get(0);
		
		
		int another_value = aList.get(23);
		
		System.out.println(aList.indexOf(2)); //-1
		
		System.out.println(aList.remove(8));
		
		System.out.println("Value of 0th element = " + value);	
		System.out.println(aList.size());
		System.out.println(aList.isEmpty());
		aList.print();

	}

}


