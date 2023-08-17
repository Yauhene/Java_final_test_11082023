import Assortment.Assortment;
import Toy.Toy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<Toy> prizeList = new ArrayList<>();
        Assortment.fromFile("toys.txt");
        Assortment.toFile("toys.bak");
//        Assortment.addToy();
        Menu.startMenu(Toy.toysList);

//        System.out.println();
//        System.out.println("Список призов создан: ");
//        ArrayList<Toy> prizesList = Crook.createListOfPrizes(10, "конструктор", "робот", "кукла");
//        System.out.println(prizesList);

//        printArr(selectedList);
        //for (int i = 0; i < toysList.size(); i++) {
            //System.out.println("i = " + i);

//            System.out.println("---- попробуем что-нибудь присвоить" );
//            volume = cGet.Get(crook);
//            System.out.println("volume = " + volume);
//            crook.printResArray();
      //  }
        Assortment.toFile("toys.txt");
//        printToysList();
    }
}