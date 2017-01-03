class CirculatingBook extends LibraryBook{

public String currentHolder;
public String dueDate;

public CirculatingBook(String a, String t, String i, String c){
    /*Originally thought it would be like this but then realized I could use super
setAuthor(a);
setTitle(t);
setISBN(i);
callNumber = c;*/
currentHolder = "";
dueDate = "";
super(a,t,i,c)
    
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

