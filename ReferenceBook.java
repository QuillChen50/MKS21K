class ReferenceBook extends LibraryBook{

private String collection;

public ReferenceBook (String a, String t, String i, String c, String co){
    super(a, t, i, c);
setCollection(co);
}

//Getter and Setter
public void setCollection(String co){
Collection = co;
}

public String getCollection(){
return collection;
}

//methods
public void checkout (String patron, String due){
System.out.println("cannot check out a reference book");
]

public void returned(){
System.out.println("reference book could not have been checked out -- return impossible");
}

public String circulationStatus(){
return "non-circulating reference book"
}

public String toString(){
    //originally I completely forgot about super
    return super.toString() + collection;
}

}
