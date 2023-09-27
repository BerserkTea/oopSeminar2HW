public abstract class Creep {
//    boolean jump;
    int jumpMaxHeight;
//    boolean run;

    int runMaxDistance;
    String name;

    public Creep(int jumpMaxHeight, int runMaxDistance, String name) {
        this.jumpMaxHeight = jumpMaxHeight;
        this.runMaxDistance = runMaxDistance;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract boolean jumping(int jumpHeight);
    abstract boolean running(int runDistance);


    public int getJumpMaxHeight() {
        return jumpMaxHeight;
    }

    public void setJumpMaxHeight(int jumpMaxHeight) {
        this.jumpMaxHeight = jumpMaxHeight;
    }

    public int getRunMaxDistance() {
        return runMaxDistance;
    }

    public void setRunMaxDistance(int runMaxDistance) {
        this.runMaxDistance = runMaxDistance;
    }
}
