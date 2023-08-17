import Assortment.Assortment;
import Toy.Toy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<Toy> prizeList = new ArrayList<>();
        Assortment.fromFile("toys.txt");
        Assortment.toFile("toys.bak");
        Menu.startMenu(Toy.toysList);
        Assortment.toFile("toys.txt");
    }
}