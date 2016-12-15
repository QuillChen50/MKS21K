public class Sorts{
  
public static String name(){
    return "10.Chen.Jenny"; 
  }
 
public static void selectionSort(int[] data){  
    int bestValIndex;
    int bestVal;
    bestValIndex = 0;
    bestVal = data[0]
	for (int p = 0; p < data.length(); p++){ //loop that takes each number from the data
	    for (int i = 1; i < data.length() - 1; i++){ //loop comparing that # with those after it
	    if (data[i] < bestVal){
		bestVal = data[i];
	        bestValIndex = i;}
	    }
	    temp = data[p];
	    data[p] = bestVal;
	    data[bestValIndex] = temp;}
      
  }
    
    

public static void insertionSort(int[] data){
 
 int bestValIndex;
 int bestVal;
 bestValIndex = 0;
 bestVal = data[0]
       
	 
	for (int i = 0; i < data.length(); i++) {
		int tempi = data[i];
	for (int p = 1; p < data.length(); p++) { 
		if (data[p] < bestVal) {
		    bestValIndex = p;
	            int temp = data[p];
		    bestVal = temp;}}
	            data[bestValIndex] = tempi;
	            data[i] = bestVal;
                               }
                                            }
    
    
    
}
