import java.util.*;


public class Driver{

public static void main(String[] args){
	int [] a = new int []{4,5,2,8,3};
	Sorts.selectionSort(a);
	//mistake here was forgetting that selectionsort was from another class
	//I did just selectionSort(a) at first
	System.out.println(Arrays.toString(a));
	//Mistake here was that I tried to use a to call toString instead of
	//from Array. Also a should be the parameter.
    }
}
