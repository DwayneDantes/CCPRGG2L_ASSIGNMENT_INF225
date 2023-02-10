public class App {
    public static void main(String[] args) throws Exception {
      GroceryItem item1 = new GroceryItem();

      item1.name = "Tissue";

      item1.showItemName();

      //item in form of a toothbrush 
      GroceryItem item2 = new Toothbrush();
      item2.name = "Colgate";
      item2.showItemName();
      item2.price = 100.00;
      

      //item in form of a toothpaste
      GroceryItem item3 = new Toothpaste();
      item3.name = "Pepsodent";
      item3.showItemName();
      item3.price =120.00;

      //Cashier
      Cashier C1 = new Cashier();
      C1.checkout(item2);
      C1.showprice(item2);
      C1.checkout(item3);
      C1.showprice(item3);
    
      GroceryItem[] itemArray = new GroceryItem[2];
      itemArray [0] = item2;
      itemArray[1] = item3;

      //loop 
      for (int i =0;i< itemArray.length; i++) {
        itemArray[i].showItemName();
      }

    }
}
