package howard.edu.sycs363.spring15.lab3;

public class IntegerArrayList {
	
	private int[] array; // initial array
	private int end; // the last used index of the array
	private int size; // the size of the array
	
	/**
	 * 1st Constructor
	 * called when the user of the IntegerArrayList doesn't specify an initial size for the array
	 * the default size is set to 20
	 * @param none
	 * @returns (nothing)
	 */
	public IntegerArrayList(){
		array = new int[20];
		size = 20;
		end = 0;
	}

	/**
	 * 2nd Constructor
	 * when the user of the IntegerArrayList specifies an initial size for the array
	 * @param int value
	 * @returns (nothing)
	 */
	public IntegerArrayList(int value){
		end = 0;
		array = new int[value];
		size = value;
	}

	/**
	 * Add Method
	 * Adds an integer value to the end of the list
	 * checks for end of list, if the last available index is filled, the size will double
	 * @param int value
	 * @returns void (nothing)
	 */
	public void add(int value){
		//check if index is equal to size-1
		if (end == size-1)
		{
			int[] largerArr = new int[array.length*2];
			System.arraycopy(array, 0, largerArr, 0, array.length);
			array = largerArr;
			size *= 2;
			
			end++;
			array[end] = value;
		}
		else {
			array[end] = value;
			end++;
		}
		
	}


	/**
	 * Add Method
	 * adds an element at a specified index
	 * checks if the index exists in the array, if not the list will resize
	 * @params int index, int value
	 * @returns void (nothing)
	 */
	public void add(int index, int value){
		if (index > size-1)
		{
			int[] largerArr = new int[end*2];
			System.arraycopy(array, 0, largerArr, 0, array.length);
			array = largerArr;
			size = ((Math.abs(size - index)/size) + 2) * size;
			array[index] = value;
			end = index;
		}
		else {
			array[index] = value;
		if (index > end)
				end = index;	
			}
		 if(index == end){
			end++;
		}
	}

	/**
	 * Get Method
	 * returns the integer value at the specified index
	 * checks if the index exists in the array, if index doesn't exists -1 is returned
	 * @params int index
	 * @return value at index, else -1
	 */

	public int get(int index){
		try {
			return array[index];
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println();
			System.err.println("IndexOutOfBoundsException: " + e.getMessage()+ " returning -1");
			System.out.println();
			return -1;
		}
		
	}

	/**
	 * IndexOf Method
	 * Return the index of the specified value in the list. if not present, -1 is returned
	 * checks if the index exists in the array, if not the list will resize
	 * @param int value to search for
	 * @return int index of the found value
	 */
	public int indexOf(int value){
		for (int i = 0; i < size; i++)
		{
			if (array[i] == value)
			{
				return i;
			}
		}
		return -1;
	}

	/**
	 * isEmpty Method
	 * checks whether the list is empty
	 * checks if the end is 0
	 * @params none
	 * @return true if list contains values
	 * 		   false if list is empty
	 */ 
	public boolean isEmpty(){
		return(end == 0);
	}


	/**
	 * Remove Method
	 * removes and returns the value from the specified index in the list
	 * @params int index of the value to be removed
	 * @returns int the value removed
	 */
	public int remove(int index){
		int removed_value = array[index];
		for (int i = index; i < size-1; i++){
			array[i] = array[i+1];
		}
		end--;
		return removed_value;
	}

	
	/**
	 * Custom  Methods
	 */

	/**
	 * Size Method
	 * params none
	 * returns size of the array
	 */
	public int size(){
		return size;
	}

	/**
	 * print Method
	 * @params none
	 * prints out each element in the list
	 */
	public void print(){
		System.out.print("[ ");
		for( int i = 0; i < end; i++){
			System.out.print(array[i]);
			System.out.print(",");
		}
		System.out.print(" ]");
	}



}
