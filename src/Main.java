
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Creep> creepsList = new ArrayList<>();
        List<Bariers> bariersList = new ArrayList<>();

        bariersList.add(new Wall(3));
        bariersList.add(new Wall(1));
        bariersList.add(new TreadMill(50));
        bariersList.add(new Wall(5));
        bariersList.add(new Wall(2));
        bariersList.add(new TreadMill(76));

        creepsList.add(new Human(4, 60, "Вова"));
        creepsList.add(new Human(11, 55, "Сережа"));
        creepsList.add(new Human(2, 23, "Наташа"));
        creepsList.add(new Human(8, 52, "Маша"));
        creepsList.add(new Cat(9, 101, "Васька"));
        creepsList.add(new Cat(18, 83, "Рыжий"));
        creepsList.add(new Robot(1,500, "r2d2"));
        creepsList.add(new Robot(6,250, "Cyborg"));
        System.out.println(whoWin(bariersList, creepsList));

    }

    /**
     *
     * @param ba список препятствий
     * @param cre список существ
     * @return Массив победителей
     */
    public static List whoWin(List<Bariers> ba, List<Creep> cre) {
        for (Bariers bariers : ba) {
            ArrayList<Integer> digits = new ArrayList<>();
            if (bariers instanceof Wall){
                for (int i = 0; i < cre.size(); i++) {
                    if (!cre.get(i).jumping(bariers.size)) {
                        digits.add(i);
                    }
                }
            }else {
                for (int i = 0; i < cre.size(); i++) {
                    if (!cre.get(i).running(bariers.size)) {
                        digits.add(i);
                    }
                }
            }

            Collections.reverse(digits);
            for (int digit : digits) {
                cre.remove(digit);
            }
        }
        System.out.println("Поздравляем победителей!");
        System.out.println("До финиша дошли :");
        return cre;
    }
}