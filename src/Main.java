
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Creep> creepsList = new ArrayList<>();
    static List<Bariers> bariersList = new ArrayList<>();

    public static void main(String[] args) {


        bariersList.add(new Wall(3));
        bariersList.add(new Wall(1));
        bariersList.add(new Wall(5));
//        bariersList.add(new TreadMill(50));
//        bariersList.add(new Wall(2));
//        bariersList.add(new TreadMill(100));

        creepsList.add(new Human(1, 60, "Вова"));
        creepsList.add(new Human(11, 55, "Сережа"));
        creepsList.add(new Human(2, 23, "Наташа"));
        creepsList.add(new Human(8, 52, "Маша"));
        creepsList.add(new Cat(50, 100, "Васька"));

        System.out.println(whoWin(bariersList, creepsList));

    }

    public static List whoWin(List<Bariers> ba, List<Creep> cre) {
        List<Integer> digits = new ArrayList<>();
        for (Bariers bariers : ba) {
            digits.clear();
//            for (int i = 0; i < cre.size(); i++) {
//                if (!cre.get(i).jumping(bariers.size)) {
//                    digits.add(i);
//                }
            for (Creep creep : cre) {
                
            }
            }
            for (int i = 0; i < digits.size(); i++) {
                System.out.println(cre.remove(digits.get(i)));
//                return cre;
            };
        }
        System.out.println("До финиша дошли :");
        return cre;
    }
}