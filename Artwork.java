public class Artwork {
    private String title;
    private int year;
    // Composition
    private Artist artist;

    public Artwork(Artwork A) {
        this.title = A.title;
        this.year = A.year;
        this.artist = new Artist(A.getArtist());
    }

    public Artwork() {
        this.title = "Painting";
        this.year = 2017;
        this.artist = new Artist();
    }

    public Artwork(String title, int year, Artist artist) {
        this.title = title;
        this.year = year;
        this.artist = artist;
    }

    public Artist getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void print() {
        System.out.println("Title: " + this.title);
        System.out.println("Year: " + this.year);
        System.out.println("Artist: " + artist.getName());
    }
}
