//Copied from my previous work over after I learned how to make directories inside repository
//My old file 03Barcode has all of the change history
//will come back to revise/edit

import java.util.*;

public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;
   private int _checkDigit;
   private ArrayList L;
   
   L = {'||:::', 
        ':::||', 
        '::|:|', 
        '::||:', 
        ':|::|', 
        ':|:|:', 
        ':||::', 
        '|:::|', 
        '|::|:', 
        '|:|::'}
        
  ArrayList<String> M = new ArrayList<String> (Array.asList(L));      
        
// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
public Barcode(){
  if (  (_zip.length() != 5) || 
        (allDigits(_zip) == false)  )
        {return false;}
 _zip = 12345;       
        }
public Barcode(String zip){
  if (  (_zip.length() != 5) || 
        (allDigits(_zip) == false)  )
        throw java.lang.IllegalArgumentException;
 _zip = zip;
        }
        
//checks if _zip is all digits
  public boolean allDigits (String str){
  if (str == "" || str.length == 0)
  {return false;}
  
  for (int i = 0; i < str.length() - 1; i++){
  if (!Character.isDigit(str.charAt(i)))
    {return false;}
    }
    return true;
                                        }
  
 //comparing 2 barcodes, especially to see if they are the same
  public int compareTo(Barcode other){
  return _zip.compareTo(other._zip);
  }
 
 //convert 5 digit zipcodes to barcodes
  public static java.lang.String toCode(java.lang.String zip){
  if (allDigits == false || zip.length() != 5)
  throw new java.lang.IllegalArgumentException();
  else{
  char myChar = 'a';
  int myInt = 0;
  String myResult = "";
  for (int i = 0; i < 5; i++){
  myChar = L.charAt(i);
  myInt = (int) myChar
  myResult.append(L.get(myInt));
  }
  return myResult;
  }
  
  //computes and returns the check sum for _zip
  private int checkSum(){
  String tempzip = _zip;
  int zipNum = Integer.parseInt(tempzip);//converts string zip to int
  return zipNum % 10;
  }
  
  
  //code - the barcode to convert into a zipcode
  public static java.lang.String toZip(java.lang.String code)
 
  //length of the barcode is not 32
  if (barcode.length() != 32){
  throw new java.lang.IllegalArgumentException("length of the barcode is not 32");
  }
  
  //the left and rigthmost charcters are not '|'
  if (code.charAt(0) != '|' || code.charAt(31) != '|'){
  throw new java.lang.IllegalArgumentException("the left and rigthmost charcters are not |");
  }
  
  //non-barcode characters are used
  int allbarchar = 0;
  while (i < 6) {
  for (code.substring(1 + (5*i), 5 + (5*i)) : L){
  allbarchar ++;}
  i++;}
  if (allbarchar != 6){
  throw new java.lang.IllegalArgumentException("non-barcode characters are used");
  
  
  //checksum is invalid
  String codeToZip = ""; 
  while (i < 6) {
  for (int j = 0; j < 10 , j++){
  if (code.substring(1 + (5*i), 5 + (5*i)).equals(L.charAt(j))){
  codeToZip = codeToZip + j;}}
  int converted = Integer.parseInt(codeToZip);
  if (converted % 10 != _checkDigit){
  throw new java.lang.IllegalArgumentException("checksum is invalid");
  }

//checking for invalid encoded int
//str.matches(".*\\d+.*"); 
//I found this from stackOverflow and its a boolean that returns true if contains digit
String regex1 = "[0-9]+"
String regex2 = "[a-zA-Z0-9 ]*"
  if (!(code.matches(regex2)) || !(codeToZip.matches(regex1))){
  throw new java.lang.IllegalArgumentException("invalid encoded int");
  }
  
_zip = codeToZip;
return codeToZip;
  
  }
