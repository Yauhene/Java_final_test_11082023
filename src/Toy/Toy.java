package Toy;

import java.util.ArrayList;
import java.util.Scanner;

public class Toy {
    static int index = 0;
    int id;
    int frequency;
    String toyType;
    String note;
    public static ArrayList<Toy> toysList = new ArrayList<Toy>();
    public Toy(int frequency, String toyType, String note) {
        this.frequency = frequency;
        this.toyType = toyType;
        this.note = note;
        index++;
        this.id = index;
    }

    public void add() {
        int frequency = 0;
        String toyType = "";
        String note = "";

        Scanner scanner = new Scanner(System.in);
        Toy toy = new Toy(frequency, toyType, note);
        toysList.add(toy);
    }

    @Override
    public String toString() {
        String out = "id игрушки: " + this.id +
                ", вес: " + this.frequency +
                ", тип: " + this.toyType +
                ", примечание: " + this.note;
        return out;
    }
}
