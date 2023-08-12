package Assortment;

import Toy.Toy;

import java.util.ArrayList;
import java.util.Scanner;

public class Assortment {
//    static int articleNumber = 0;
//    int aNumber;

    public static ArrayList<Toy> toysList = new ArrayList<>();

public void addToy() {
    boolean onceMore = true;
    String tempStr = "";

    int tFreq = 0;
    String tType = "";
    String tNote = "";
    Scanner scanner = new Scanner(System.in);

        System.out.println("Введите тип игрушки (слово-описание, \"мишка\", \"мышка\"  и т.п.: ");
        tType = scanner.nextLine();
        System.out.println("Введите примечание ( \"синий\", \"резиновый\" , \"без уха\" и т.п.: ");
        tNote = scanner.nextLine();
    while (onceMore) {
        onceMore = false;
        System.out.println("Введите вероятность выпадания игрушки, число: ");
        tempStr = scanner.nextLine();
        if (tempStr.length() == 1 && tempStr.matches("[.0-9]+")) {
            tFreq = Integer.parseInt(tempStr);
        } else {
                System.out.println("Введено неверное значение, попробуем еще раз.");
                onceMore = true;
        }
    }
    Toy t = new Toy(tFreq,tType,tNote);
    toysList.add(t);
    }


    public static void startArray() {

    Toy toy1 = new Toy(1,"конструктор", "металлический");
    toysList.add(toy1);
    Toy toy2 = new Toy(2,"робот", "красный");
    toysList.add(toy2);
    Toy toy3 = new Toy(3,"кукла", "Маша");
    toysList.add(toy3);

    }
    public static void printToysList() {
        for (int i = 0; i < toysList.size(); i++) {
            System.out.println(toysList.get(i));
        }
    }


}
