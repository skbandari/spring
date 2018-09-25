package mediaplayer;

public class Track {

    public String artist;
    public String name;

    public Track(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public void play() {

        System.out.println("playing " + artist + " track -> " + name);
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' +
                '}';
    }
}
