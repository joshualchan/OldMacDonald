class Chick implements Animal
{     
	 private String myType;     
     private String mySound;    


     public Chick(String type, String sound)     {         
         myType = type;         
         mySound = sound;     
     } 

     //constructor
     public Chick()     {         
         myType = "chick";         
         mySound = "cluck";     
     }      

//get constructor variables
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 


     }

