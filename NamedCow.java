class NamedCow extends Cow
{
	//variable name
	//constructor 3 variables
	//get
    private String myName;    
     private String myType;     
     private String mySound;      


    public NamedCow(String type, String sound, String name)     {         
        myType = type;         
        mySound = sound; 
        myName =name;    
     } 



     //constructor
     public NamedCow()     {         
         myType = "cow";         
         mySound = "moo";  
         myName = "George";   
     }      

     //get constructor variables
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
     public String getName(){return myName;}
}