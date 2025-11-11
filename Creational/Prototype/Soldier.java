package Creational.Prototype;

public class Soldier implements GameCharacter {
    private String name;
    private int age;
    private String regiment;
    private String rifle;
    private String nationality;
    public Soldier(Soldier target) {
        if(target != null){
            // These will be default for every initial object that will be cloned
            this.rifle = "AK47";
            this.nationality = "Indian";
            this.regiment = target.regiment;
            // These can be set via setters once the default clone is made
            this.name = null;
            this.age = 0;
            /*
            Suppose we need to initialize the constructor with heavy data(Suppose creating rifle),
            then creating new object for same thing everytime will be costly hence we can make a deep copy by
            copying the already present data in the field values, not initializing it again and again
            */
        }
    }
    public Soldier(String name, int age, String regiment, String rifle, String nationality) {
        this.name = name;
        this.age = age;
        this.regiment = regiment;
        this.rifle = rifle;
        this.nationality = nationality;
        System.out.println("Initializing soldier with heavy data");
    }


    @Override
    public GameCharacter clone(){
        return new Soldier(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public void showDetails() {
        System.out.println("Soldier: " + name + " | Regiment: " + regiment +
                " | Nationality: " + nationality + " | Rifle: " + rifle);
    }
}
