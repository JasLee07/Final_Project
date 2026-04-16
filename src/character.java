public class Character {

    public String name;
    public int age;
    public String currentRoom;


    public Character(String name, int age, String currentRoom){
        this.name = name;
        this.age = age;
        this.currentRoom = currentRoom;
    }

    @Override
    public String toString() {
        return this.name + " is " + this.age + " and can be found in: " + this.currentRoom;
    }
}
