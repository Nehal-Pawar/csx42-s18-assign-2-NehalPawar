package fourWayStreetLights.test;

import fourWayStreetLights.MyArrayList;
import fourWayStreetLights.util.Results;

public class MyArrayListTest {

	private String testCase ;
	String NewResult="";
	/**
	 * This method runs all the test cases test function 
	 * @param MyArrayList 
	 * @param Results 
	 */
	public void testMe(MyArrayList myArrayList, Results results) {
		test1(myArrayList, results);
		test2(myArrayList, results);
		test3(myArrayList, results);
		test4(myArrayList, results);
		test5(myArrayList, results);		
		test6(myArrayList, results);		
		test7(myArrayList, results);	
		test8(myArrayList, results);
		test9(myArrayList, results);
		test10(myArrayList, results);	
	}
	
	private void test1(MyArrayList myArrayList, Results results){
		testCase = "Add new element after 50 and check Increase in Array Size ";
		
		int array[] = myArrayList.getArray();
		int initialSize = array.length;
							
			myArrayList.insertSorted(121);//add value
			myArrayList.insertSorted(1212);//add value
			array = myArrayList.getArray();//new array
			if(array.length == (initialSize + (initialSize/2)))
				NewResult=results.CreateOutput(true,testCase ,"Array Size increased");
			else
				NewResult=results.CreateOutput(false,testCase ,"Array Size not increased");
			results.storeNewResult(NewResult);
	}
	private void test2(MyArrayList myArrayList, Results results){
		testCase = "Check the current number of values in array is less then 1/2 the size of array";
		
		int array[] = myArrayList.getArray();
		int initialSize = myArrayList.size();
					
			if(array.length/2 > initialSize)
				NewResult=results.CreateOutput(true,testCase ,"Number of elements is less than 1/2 Size");
			else
				NewResult=results.CreateOutput(false,testCase ,"Number of elements is greater than 1/2 Size");
			results.storeNewResult(NewResult);			
	}
	private void test3(MyArrayList myArrayList, Results results){
		testCase = "Check if the number 1 in the array exist by calling indexOf(1)";
		
		//int array[] = myArrayList.getArray();
		
			if(myArrayList.indexOf(1)!=(-1))
				NewResult=results.CreateOutput(true,testCase ,"Number exist in list");
			else
				NewResult=results.CreateOutput(false,testCase ,"Number does not exist");
			results.storeNewResult(NewResult);
	}
	private void test4(MyArrayList myArrayList, Results results){
		testCase = "Check if the element is inserted and deleted by checking lenght";
		
		int array[] = myArrayList.getArray();
		int initialSize = myArrayList.size();
			myArrayList.insertSorted(124);//add value
			myArrayList.insertSorted(125);//add value
			myArrayList.removeValue(125);
			int newSize = myArrayList.size();//new array
			if(newSize==initialSize+1)
				NewResult=results.CreateOutput(true,testCase ,"2 New Number added and 1 deleted");
			else
				NewResult=results.CreateOutput(false,testCase ,"new number not added and deleted");				
			results.storeNewResult(NewResult);			
	}
	private void test5(MyArrayList myArrayList, Results results){
		testCase = "Check if the number outside range does not gets added by checking length";
		
		int array[] = myArrayList.getArray();
		int initialSize = myArrayList.size();
			myArrayList.insertSorted(12411);//add value
	
			int NewSize = myArrayList.size();
			if(NewSize == initialSize)
				NewResult=results.CreateOutput(true,testCase ,"Number outside range not added");
			else
				NewResult=results.CreateOutput(false,testCase ,"Number outside range added");				
			results.storeNewResult(NewResult);			
	}
	private void test6(MyArrayList myArrayList, Results results){
		testCase = "Check if the number outside range gets added by checking occurrence a value";
		
		int array[] = myArrayList.getArray();
		int initialSize = myArrayList.size();
			myArrayList.insertSorted(12411);//add value
	
			//int NewSize = myArrayList.size();
			if(myArrayList.indexOf(12411)==(-1))
				NewResult=results.CreateOutput(true,testCase ,"Number outside range not added");
			else
				NewResult=results.CreateOutput(false,testCase ,"Number outside range added");
			results.storeNewResult(NewResult);
	}

	private void test7(MyArrayList myArrayList, Results results){
		testCase = "Check if the number exist after double addition to check deletion of all occurance";
		
		int array[] = myArrayList.getArray();
		int initialSize = myArrayList.size();
			myArrayList.insertSorted(12);//add value
			myArrayList.insertSorted(12);//add value
			myArrayList.removeValue(12);//add value

			if(myArrayList.indexOf(12)!=(-1))
				NewResult=results.CreateOutput(false,testCase ,"Number exist after deletion");
			else
				NewResult=results.CreateOutput(true,testCase ,"Number does not exist after deletion");
			results.storeNewResult(NewResult);
	}
	private void test8(MyArrayList myArrayList, Results results){
		testCase = "Check if the number add effects the sum";
		
		//int array[] = myArrayList.getArray();
		int initialSum = myArrayList.sum();
			myArrayList.insertSorted(12);//add value
			
			if(myArrayList.sum()==initialSum +12)
				NewResult=results.CreateOutput(true,testCase ,"Number added affects the sum");
			else
				NewResult=results.CreateOutput(false,testCase ,"Number added does not affect the sum");
			results.storeNewResult(NewResult);
	}
	private void test9(MyArrayList myArrayList, Results results){
		testCase = "Check if the array is sorted";
		boolean flag=false;
		int array[] = myArrayList.getArray();
		for(int index=0; index < array.length-1; index++){
			if(array[index] > array[index+1])
				flag=true;			
		}			
		if(flag)
			NewResult=results.CreateOutput(true,testCase ,"Numbers are sorted");
		else
			NewResult=results.CreateOutput(false,testCase ,"Number are not sorted");
			results.storeNewResult(NewResult);
	}
	private void test10(MyArrayList myArrayList, Results results){
		testCase = "Remove Multiple Occurrance of Element";
		myArrayList.removeValue(2);
			if(myArrayList.indexOf(2)!=(-1))
				NewResult=results.CreateOutput(false,testCase ,"Some numbers still exist in list");
			else
				NewResult=results.CreateOutput(true,testCase ,"Numbers do not exist");
			results.storeNewResult(NewResult);
	}
}