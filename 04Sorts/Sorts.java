public class Sorts{
  
public static String name(){
    return "10.Chen.Jenny"; 
  }
 
public static void selectionSort(int[] data){  
    int bestValIndex;
    int bestVal;
    bestValIndex = 0;
    bestVal = data[data.length()]
	for (int p = 0; p < data.length(); p++){
	    for (int i = 1; i < data.length() - 1; i++){
	    if (data[i] < bestVal){
		bestVal = data[i];
	        bestValIndex = i;}
	    }
	    temp = data[p];
	    data[p] = bestVal;
	    data[bestValIndex] = temp;}
      
  }
    
    

public static void insertionSort(int[] data){    

    
	for (int p = 0; p < data.length(); p++){
	    for (int i = 1; i < data.length() - 1; i++){  
		if (data[i] > data[i + 1]) {
		    int temp = data[i];
		    data[i] = data[i+1];
		    data[i+1] = temp;     
                                            }
                                                       }
    
    
    
}
