import java.util.*;

public class Sorts{
  
    public static String name(){
	return "10.Chen.Jenny"; 
    }

    //How it works
    //Go through list length() -1 times, looking for the best value eah time
    //first loop goes through each number, second loop compares 
    public static void selectionSort(int[] data){
	String regex = "[0-9]+"; 
	int bestValIndex;
	bestValIndex = 0;
	for (int p = 0; p < data.length; p++){
	    bestValIndex = p;
	    //loop that takes each number from the data
	    for (int i = p +1 ; i < data.length; i++){ 
		//loop comparing that # with those after it
		if (data[i] < data[bestValIndex]){
		    bestValIndex = i;
		    // System.out.println("BVI: " + bestValIndex);
		    //debugged b/c was originally comparing data[i]
		    //to data[p] which prevented bestValIndex from continuously
		    //being changed
		}
	    }
	    int temp = data[p];
	    data[p] = data[bestValIndex];

	    data[bestValIndex] = temp;
	    //System.out.println(Arrays.toString(data));
	    //Just trying to see what was changing
	}

      
    }

    
       
    
	  public static void insertionSort(int[] data){
 
	int unSortedVal = 0;
	int unSortedIndex = 1;
  
	 for (int p = 1; p < data.length; p++){
	    unSortedIndex = p;
	    unSortedVal = data[p];
	    System.out.println("" + unSortedVal);
	    //loop that takes each number from the data
	    for (int i = 1; i < p; i++){
		if (data[p-i] > unSortedVal){
		    data[p-i+1] = data[p-i];
		    if (i == p -1){
			data[p-i+1] = unSortedVal;}
		System.out.println("" + data[p-i]);}
	        
		//this part was messing up my code by sorting the list to be
		//filled the rest with the largest value
		//else if (data[p-i] <= unSortedVal){
		//data[p-i+1] = unSortedVal;}
	    }
	 }
	  }
}
		
    
/*
	  public static void bubbleSort(int [] data){
	  boolean notswap = true;
	
	  for (int p = 0; i < data.length; p++) {
	  for (int i = 1; i < data.length - 1; i++) {
	  if ( data[i] >= data[i+1] )
	  int temp1 = data[i];
	  int temp2 = data[i+1];
	  data[i] = temp2;
	  data[i +1] = temp1;
	  notswap = false;
	  }
	  if (notswap == true){
	  return;}}
	  return;}
		
    */

    



