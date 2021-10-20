package compositeAndDecorator;

import java.util.ArrayList;

public class PlayList implements SongComponent {
    private String playlistName;
    private ArrayList<SongComponent> playlist = new ArrayList();

    PlayList(String name) {
        this.playlistName = name;
    }

    void add(SongComponent component) {
        playlist.add(component);
    }

    void remove(SongComponent component) {
        playlist.remove(component);
    }

    void play() {
        System.out.println(decorate());
    }

    private String getName() {
        return this.playlistName;
    }

    @Override
    public String decorate() {
        StringBuilder str = new StringBuilder();
        for (SongComponent component: playlist) {
            str.append("-----").append(getName()).append("-----\n").
                    append(component.decorate()).append("\n");
        }
        return str.toString();
    }
}
