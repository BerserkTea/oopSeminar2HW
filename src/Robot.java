public class Robot extends NotLives {
    public Robot(int jumpMaxHeight, int runMaxDistance, String name) {
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
            System.out.println(this.getClass().getSimpleName() + " " + name + " непотянул прыжок, и выбывает из соревнования");
            return false;
        } else {
            System.out.println(name + " Прыгнул " + jumpHeight + " высоту стены");
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
            System.out.println(this.getClass().getSimpleName() + " " + name + " Непотянул беговую дорожку, и выбывает из соревнования");
            return false;
        } else {
            System.out.println(name + " Пробежал " + runDistance + " по беговой дорожке");
            return true;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
