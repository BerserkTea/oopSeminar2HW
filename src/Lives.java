public class Lives extends Creep {

    public Lives(int jumpMaxHeight, int runMaxDistance, String name) {
        super(jumpMaxHeight, runMaxDistance, name);
    }
    /**
     * Метод оценивает осилит ли прыжок
     * @param jumpHeight передаем выссоту препятсвия
     * @return true/false
     */
    @Override
    boolean jumping(int jumpHeight) {
        if (jumpMaxHeight < jumpHeight) {
            System.out.println(this.getClass().getSimpleName() + " "  + name + " Непотянул прыжок, и выбывает из соревнования");
            return false;
        } else {
            System.out.println(this.getClass().getSimpleName() + " "  + name + " Прыгнул " + jumpHeight + " высоту стены");
            return true;
        }
    }
    /**
     * Метод оценивает осилит ли беговую дорожку
     * @param runDistance передаем длинну препятсвия
     * @return true/false
     */
    @Override
    boolean running(int runDistance) {
        if (runMaxDistance < runDistance) {
            System.out.println(this.getClass().getSimpleName() + " "  + name + " Непотянул беговую дорожку, и выбывает из соревнования");
            return false;
        } else {
            System.out.println(this.getClass().getSimpleName() + " " + name + " Пробежал " + runDistance + " по беговой дорожке");
            return true;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
