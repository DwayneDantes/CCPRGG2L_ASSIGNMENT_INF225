public class App {
    public static void main(String[] args) {

        
        

        item DoransShield =new item("Doran's Shield",450,1,1,"It blocks 45 damage",true,"rare",14);
        DoransShield.saymyitem();
        DoransShield.saymystats();
        DoransShield.saymytrade();
        DoransShield.saymyrarity();
        DoransShield.AddDamage(5);
        System.out.println(DoransShield.showNameandRarityString());
        
        item DoransBlade = new item(" Doran's Blade",450,1,1,"It deals 9 damage and has 2.5% omnivamp.",false,"common",15);
        DoransBlade.saymyitem();
        DoransBlade.saymystats();
        DoransBlade.saymytrade();
        DoransBlade.saymyrarity();
        item Longsword = new item (" Longsword ",350,2,1,"Ït deals 15 damage but you take 10 more damage",true,"Very rare",16);
        Longsword.saymyitem();
        Longsword.saymystats();
        Longsword.saymytrade();
        Longsword.saymyrarity();
        
        Character Archer =new Character();
        Archer.name = "Elizer";
        Archer.attack();
    }
        
}
