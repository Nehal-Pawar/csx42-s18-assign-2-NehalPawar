package fourWayStreetLights;

import java.util.Arrays;

public class MyArrayList {

	private int numberArray[] = new int[50];
	int init = 0;
	int  Size=50;

	/**
	 * This is constructor to assign default value 
	 */
	public MyArrayList() {
		int j;
		
		for (j = 0; j<Size; j++) {
			numberArray[j] = -11111;
		}	
		Size=numberArray.length;
	}


	/**
	 * This method should resize the array on exceding capacity
	 * and call the sort. 
	 * @param value
	 */
	public void insertSorted(int value) {
		if(init>=Size){
		Size=Size+Size/2;
		int newArray[] = new int[Size];
		for (int j = 0; j<Size; j++)
			newArray[j] = -11111;
		for (int j = 0; j < numberArray.length; j++) 
			newArray[j] = numberArray[j];
		numberArray=newArray;
		}
		if(value>=0&&value<=10000){		
		InsSort(value);
		init++;
		}
	}

	/**
	 * This method should insert a new value 
	 * but keeps the data structure sorted in ascending order. 
	 * @param value
	 */

	public void InsSort(int value){
		for(int index=0;index<Size;index++){
			if(numberArray[index]==-11111){
				numberArray[index]=value;
				break;
			}
			if(value>numberArray[index])
				continue;
			else{		
				for(int i=init-1;i>=index;i--){
				numberArray[i+1]=numberArray[i];
				}
				numberArray[index]=value;
				break;
			}
		}
	}

	 /**
	 * This method return the private data member array
	 * @return
	 */

	public int[] getArray(){
		return numberArray;
	}
	
	 /**
	 * This method return the concatenated string to of array for display
	 * @return
	 */

	public String toString() {
		int index;
		String Concatenate="";
		for (index = 0; index<Size; index++) {
			if (numberArray[index] != -11111){
			Concatenate=Concatenate+numberArray[index] + " ";			
			}
		}
		return Concatenate;
	}

	 /**
	 * This method return the sum of the array integers 
	 * @return
	 */

	public int sum() {
		int index, sum = 0;
		for (index = 0; index<Size; index++) {
			if (numberArray[index] != -11111) {
				sum += numberArray[index];
			}
		}
		return sum;
	}

	/**
	 * This method should remove all occurences of a value
	 * @param value
	 */
	public void removeValue(int value){
		int indexof=indexOf(value);
		while(indexof!=(-1)){
		for (int index = indexof; index<Size-1; index++) {
			numberArray[index]=numberArray[index+1];			
		}		
		numberArray[Size-1]=-11111;
		Size--;
		indexof=indexOf(value);
		}
	}

	/**
	 * //This method should return the index of the first occurrence a value
	 * @param value
	 * @return
	 */
	public int indexOf(int value){
		for (int index = 0; index<numberArray.length; index++) {
			if (numberArray[index] == value)
			return index;		
		}
	return -1;
	}

	/**
	 * //This method should return the total number of values that 
	 * are stored in the array list.
	 * @param value
	 * @return
	 */

	public int size(){
		int index, count=0;
		for(index=0; index<Size; index++) {
			if(numberArray[index] != -11111)
				count =count+ 1;
		}
		return count;
	}
}