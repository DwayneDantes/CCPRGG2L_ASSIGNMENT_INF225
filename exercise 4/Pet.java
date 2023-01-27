public class Pet {
    
 
    String name;
    Person owner;

    
    //Constructor 
    public Pet(String n, Person ownerName){
    
        this.owner= ownerName;
        this.name=n;
    }
    
    public void showOwnerName(){
        System.out.println("My name is " + this.name+ " My owner's name is " + owner.name);
    }

}




