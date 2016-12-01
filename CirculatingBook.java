class CirculatingBook extends LibraryBook{

public String currentHolder;
public String dueDate;

public CirculatingBook(String a, String t, String i, String c){
setAuthor(a);
setTitle(t);
setISBN(i);
callNumber = c;
currentHolder = "";
dueDate = "";
}

public void checkout (String patron, String due){
currentHolder = patron;
dueDate = due;
}

public void returned(){


?

