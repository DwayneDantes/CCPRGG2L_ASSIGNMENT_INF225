public class Car {
 
    String name;
    Myself owner;

    
    //Constructor 
    public Car(String n, Myself ownerName){
    
        this.owner= ownerName;
        this.name=n;
    }
    
    public void showOwnerName(){
        System.out.println("My name is  " + owner.name+ " My car  is " + this.name);
    }

}

