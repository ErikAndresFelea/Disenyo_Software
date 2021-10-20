package compositeAndDecorator;

public class Song implements SongComponent {
    private String name;
    private String artist;

    Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    @Override
    public String decorate() {
        return "Escuchando..." + getName() + " BY " + getArtist();
    }

    private String getArtist() {
        return this.artist;
    }

    private String getName() {
        return this.name;
    }
}
