package compositeAndDecorator;

public abstract class SongDecorator implements SongComponent{
    private SongComponent sg;

    SongDecorator(SongComponent sg) {
        this.sg = sg;
    }

    @Override
    public String decorate() {
        return sg.decorate();
    }
}
