public class App {
    public static void main(String[] args) throws Exception {

        Number Me = new Number();

        // The name property cannot be accessed outside of the Person class.
        // Me.name;

        Me.setNumber(45436003);

        int myNumber = Me.getNumber();

        System.out.println("My credit card number is " + myNumber);
 //===================================================================================

        Son me = new Son();
 
 
        System.out.println("My surname is " + me.surname);
        
        
 
    }
}
