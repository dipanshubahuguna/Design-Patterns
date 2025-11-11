package Creational.Prototype;

public class PrototypeTest {
    public static void main(String[] args){
        Soldier prototypeSoldier = new Soldier("Prototype",0,"Regiment","AK47","Indian");
        Soldier soldier1 = (Soldier)prototypeSoldier.clone();
        soldier1.setName("Dipanshu");
        soldier1.setAge(24);
        Soldier soldier2 = (Soldier)prototypeSoldier.clone();
        soldier2.setName("Doms");
        soldier2.setAge(29);
        
        soldier1.showDetails();
        soldier2.showDetails();
    }
}
