public class NotLives extends Creep{
    public NotLives(int jumpMaxHeight, int runMaxDistance, String name) {
        super(jumpMaxHeight, runMaxDistance, name);
    }

    @Override
    boolean running(int runDistance) {
        return true;
    }

    @Override
    boolean jumping(int jumpHeight) {
        return true;
    }
}
