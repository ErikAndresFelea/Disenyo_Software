package compositeAndDecorator;

public class SongMP3 extends SongDecorator {

    public SongMP3(SongComponent sg) {
        super(sg);
    }

    @Override
    public String decorate(){
        return super.decorate() + decorateMP3();
    }

    private String decorateMP3() {
        return "\nON MP3";
    }
}
