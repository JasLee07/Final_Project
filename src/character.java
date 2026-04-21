public class Character {

    public String name;
    public int age;
    public String roomName;


    public Character(String name, int age, String roomName){
        this.name = name;
        this.age = age;
        this.roomName = roomName;
    }

    @Override
    public String toString() {
        return this.name + " is " + this.age + " and can be found in: " + this.roomName;
    }
}
