import java.util.*;

public class Sorts{
  
    public static String name(){
	return "10.Chen.Jenny"; 
    }

    //How it works
    //Go through list length() -1 times, looking for the best value eah time
    //first loop goes through each number, second loop compares 
    public static void selectionSort(int[] data){  
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
 
	int bestValIndex;
	bestValIndex = 0;
  

	 for (int p = 0; p < data.length; p++){
	    bestValIndex = p;
	    //loop that takes each number from the data
	    for (int i = p +1 ; i < data.length; i++){ 
		//loop comparing that # with those after it for (int i = 0; i < data.length; i++) {
	  int tempi = data[i];
	  for (int p = 1; p < data.length; p++) { 
	  if (data[p] < bestVal) {
	  bestValIndex = p;
	  int temp = data[p];
	  bestVal = temp;}}
	  data[bestValIndex] = tempi;
	  data[i] = bestVal;
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

    

}

