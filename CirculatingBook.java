class CirculatingBook extends LibraryBook{

    //maybe should make these private
 String currentHolder;
 String dueDate;

public CirculatingBook(String a, String t, String i, String c){
    // Originally thought it would be like this but then realized I could use super
    super(a, t, i, c);
currentHolder = "";
dueDate = "";
    
}

public void checkout (String patron, String due){
    setCurrentHolder(patron);
setDueDate(due);
}

    //now for some set methods

    public setDueDate(String date){
	dueDate = date;}
    public setCurrentHolder (String Holder){
	currentHolder = Holder;}

    //now as for get

    public String getDueDate(){
	return dueDate;
    }
    public String getCurrentHolder(){
	return currentHolder;}

    //since if returned, no more current holder or due date
public void returned(){
    setCurrentHolder("");
    setDueDate("");
}

public String circulationStatus(){
  if (currentHolder == ""){
return currentHolder + dueDate + "book available on shelves";}
  else {
      return currentHolder + dueDate + "book not available";}
}

public String toString(){
return title + author + ISBN + circulation()
}
    
}

/*

$ javac CirculatingBook.java
CirculatingBook.java:33: error: illegal start of expression
public String toString(){
^
CirculatingBook.java:33: error: ';' expected
public String toString(){
                      ^
CirculatingBook.java:34: error: ';' expected
return title + author + ISBN + circulation()
                                            ^
CirculatingBook.java:37: error: reached end of file while parsing
}
 ^
4 errors


 */

