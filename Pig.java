class Pig implements Animal 
{     
     private String myType;     
     private String mySound;      
 
 	//constructor
     public Pig(String type, String sound){         
         myType = type;         
         mySound = sound;     
     }     

     public Pig()     {         
         myType = "pig";         
         mySound = "oink";     
     }    

     //get constructor variables
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 

     



}
