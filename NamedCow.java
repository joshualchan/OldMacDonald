class NamedCow extends Cow
{
	//variable name
	//constructor 3 variables
	//get
	private String myName;

    public Cow(String type, String sound, String name)     {         
        myType = type;         
        mySound = sound; 
        myName = name;    
     } 

     //constructor
     public Cow()     {         
         myType = "cow";         
         mySound = "moo";     
         myName = "George";
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 

    public String getName(){return myName;} 


}