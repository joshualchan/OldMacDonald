public class Cow implements Animal//implements Animal 
{     
     //your code here
	 protected String myType;     
     protected String mySound;      


    public Cow(String type, String sound)     {         
        myType = type;         
        mySound = sound;     
     } 

     //constructor
     public Cow()     {         
         myType = "cow";         
         mySound = "moo";     
     }      

     //get constructor variables
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 

}
