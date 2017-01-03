import java.util.Iterator;

public class SuperArray implements Iterable<String>{
  private String[] data;
  private int size;


    //constructors

    //by default, there's 10 space
    public SuperArray(){
    size = 0;
    data = new String[10];
    }
    //if want to change capacity, use following. Be aware of negative capacity
    //I want to prevent setting a 0 or negative array since if 0, then just default
    public (int capac){
	if (capac <= 0){
	    throw new IllegalArgumentException();
	}
	size = capac;
	data = new String[capac];
    }

    //this can be used to prevent losing orginal value
    public String get(int index){
	return data[index];
    }

    public String set(int index, String element){
	String temp = get(index);
	data[index] = element;
	return orig;
    
    //Help to avoid messing with it
    public int size(){
	return size;
    }

    public void clear(){
    size = 0;
    }
    public boolean isEmpty(){
    return size() == 0;
    }
    

    
}
