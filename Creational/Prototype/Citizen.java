package Creational.Prototype;

public class Citizen implements GameCharacter {
    private String name;
    private int age;
    private String nationality;
    public Citizen(Citizen target) {
        if(target != null){

            // These will be default for every initial object that will be cloned
            this.nationality = "Indian";

            // These can be set via setters once the default clone is made
            this.name = null;
            this.age = 0;
        }
    }
    public Citizen(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }


    @Override
    public GameCharacter clone(){
        return new Citizen(this);
    }
    @Override
    public void showDetails() {
        System.out.println("Citizen: " + name + " | Nationality: " + nationality);
    }
}
