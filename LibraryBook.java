abstract Class LibraryBook extends Book implements Comparable<LibraryBook>{

public String callNumber;

public LibraryBook (String a, String t, String i, String c){
    /*replacing this with super; the entire point of the assignment
setAuthor(a);
setTitle(t);
setISBN(i);
    */
    super (a, t, i);
    //at first I was curious as to how having missing inputs that should have been required in the super constructor would still work?
    setCallNumber(c);
}

//Getter and Setter
public void setCallNumber(String c){
callNumber = c;
}
public String getCallNumber(){
return callNumber;
}

//methods
//was wondering whether must make these public
abstract void checkout (String patron, String due){
]

abstract void returned(){
}

abstract String circulationStatus(){
}

public int compareTo(LibraryBook b){
    //However, I realized that all of this could be replaced by a simple use of comparTo
    /*
if (this.callNumber.compareTo(b.callNumber) = 0){
return 0;
}
else if (this.callNumber.compareTo(b.callNumber) < 0){
return -1;
}

else {
return 1;
}
    */
    return callNumber.compareTo(b.callNumber);
}

public String toString(){
    //replacing part of my original code with super
return super.toString + circulationStatus() + callNumber;
}

}
