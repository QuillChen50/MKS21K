public class Book{

private String author;
private String title;
private String ISBN;

//Constructor
public Book(){
author = "someone";
title = "sometitle";
ISBN = "1234";
}

public Book (String a, String t, String i){
author = a;
title = t;
ISBN = i;
}

//Getters and Setters
public void setAuthor (String a){
author = a;
}

public void setTitle (String t){
title = t;
}

public void setISBN (String i){
ISBN = i
}

public String getAuthor (){
return author;
}

public String getTitle (){
return title;
}

public String getISBM (){
return ISBN;
}

public String toString(){
return title + ", " + author + ", " + ISBN;
}

