abstract Class LibraryBook extends Book implements Comparable<LibraryBook>{

public String callNumber;

public LibraryBook (String a, String t, String i, String c){
setAuthor(a);
setTitle(t);
setISBN(i);
callNumber = c;
}

//Getter and Setter
public void setCallNumber(String c){
callNumber = c;
}
public String getCallNumber(){
return callNumber;
}

//methods
abstract void checkout (String patron, String due){
]

abstract void returned(){
}

abstract String circulationStatus(){
}

public int compareTo(LibraryBook b){
if (this.callNumber.compareTo(b.callNumber) = 0){
return 0;
}
else if (this.callNumber.compareTo(b.callNumber) < 0){
return -1;
}

else {
return 1;
}
}

public String toString(){
return title + author + ISBN + circulationStatus() + callNumber;
}

}
