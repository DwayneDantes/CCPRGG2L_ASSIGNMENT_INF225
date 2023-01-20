public class item {
    //Attributes 
    String name;
    int price;
    int weight;
    int quantity;
    String Description; 
    boolean Trade;
    String rarity;
    int damage;
    //Method
    public void saymyitem() {
        System.out.println(" I have a " + name);
    }
    
    public void saymystats() {
        System.out.println("It costs " + price + " It weighs " + weight + " I have " + quantity + " It is " + Description + " It is " + Trade);
    }
    
    public void saymytrade() {
    if (Trade) {
        System.out.println("It is tradeable");
    } else {
        System.out.println("It  cannot be traded");
    }
    
}
    public void saymyrarity(){
        System.out.println("The rarity is "+ rarity );
    }

   public void AddDamage(int additionalDamage){
   int newDamage =this.damage + additionalDamage;
    
   System.out.println("Damage increased from"+ damage + "to" + newDamage);
   this.damage =newDamage;
   }

   public String showNameandRarityString(){
    return this.name + "" +this.rarity; }

    // Constructor
    public item(String nme, int pr, int wgt, int qty, String Desc,boolean Tr,String r,int dmg) {
        name = nme;
        price = pr ;
        weight = wgt ;
        quantity = qty ;
        Description = Desc ;
        Trade = Tr ;
        rarity = r;
        damage = dmg;
    }
    

}
