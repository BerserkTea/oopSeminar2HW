public class Lives extends Creep{

    public Lives(int jumpMaxHeight, int runMaxDistance, String name) {
        super(jumpMaxHeight, runMaxDistance, name);
    }

    @Override
    boolean jumping(int jumpHeight) {
        if (jumpMaxHeight<jumpHeight){
            System.out.println(name+"непотянул прыжок, убит");
            return false;
        }else {
            System.out.println(name + "Прыгнул" + jumpHeight);
            return true;
        }
        }

    @Override
    boolean running(int runDistance) {
        if(runMaxDistance<runDistance){
            System.out.println(name+"Непотянул беговую дорожку, убит");
            return false;
        }else {
            System.out.println(name + "Пробежал" + runDistance);
            return true;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
