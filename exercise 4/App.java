public class App {
    public static void main(String[] args) throws Exception {


        Person Friend =new Person("Cyrus",19);

        Myself Me = new Myself("Mark",19);

        Me.AddFriend(Friend);

        Pet Cat = new Pet("Shiro",Friend);

        Cat.showOwnerName();

        Car Porsche =new Car("Porsche",Me);
        Porsche.showOwnerName();
    }

   
}
