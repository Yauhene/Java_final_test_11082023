package Toy;

import java.util.ArrayList;

public class Toy {
    static int index = 0;
    public int id;
    public int frequency;
    public String toyType;
    public String note;
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
        Toy toy = new Toy(frequency, toyType, note);
        toysList.add(toy);
    }
    public void delete(String id) {
        toysList.remove(findById(id));
    }

    /**
     * Метод поиска индекса игрушки с заданным значением поля id в массиве toysList
     * @param id - заданный id
     * @return index - индекс игрушки в массиве toysList
     */
    public static int findById(String id) {
        int index = 0;
        for (int i = 0; i < toysList.size(); i++) {
            if (toysList.get(i).id == Integer.parseInt(id)) {
                index = i;
                break;
            }
        }
        return index;
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
