public class character {

    public String name;
    public String roomName;


    public character(String name, String roomName){
        this.name = name;
        this.roomName = roomName;
    }

    @Override
    public String toString() {
        return this.name + " can be found in: " + this.roomName;
    }
}
