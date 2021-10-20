package compositeAndDecorator;

public class SongVinyL extends SongDecorator {

    SongVinyL(SongComponent sg) {
        super(sg);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateVinyL();
    }

    public String decorateVinyL() {
        return "\nON vinyL";
    }
}
