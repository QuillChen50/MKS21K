//Copied from my previous work over after I learned how to make directories inside repository

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
currentHolder = "";
dueDate = "";
}
  
public String circulation(){
  if (currentHolder == ""){
return currentHolder + dueDate + "book available on shelves";}
  else {
return currentHolder + dueDate + "book not available";

public String toString(){
return title + author + ISBN + circulation()
}
    
}
