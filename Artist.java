public class Artist {
    public String name;

    Artist(){
        this.name = "Default name";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Artist(String name) {
        this.name = name;
    }

    Artist(Artist A){
        this.name = A.name;
    }

    public void display(){
        System.out.println(this.name);
    }
}
