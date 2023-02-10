public class Cashier {
    
    public void checkout(GroceryItem item){
        System.out.println("You have bought " + item.name);
    }

    public void showprice( GroceryItem item){
        System.out.println("The price is " + item.price);
    }



}
