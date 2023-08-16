package Assortment;

import Toy.Toy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static Toy.Toy.toysList;

public class Assortment {

//    public static ArrayList<Toy> toysList = new ArrayList<>();

    /**
     * Метод добавления новой игрушки.
     * Запрашивает значения полей нового экземпляра Toy, создает экземпляр
     */
    public static void addToy() {
        boolean onceMore = true;
        String tempStr = "";

        int tFreq = 0;
        String tType = "";
        String tNote = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите тип игрушки (слово-описание, \"мишка\", \"мышка\"  и т.п.:  ");
        tType = scanner.nextLine();
        System.out.print("Введите примечание ( \"синий\", \"резиновый\" , \"без уха\" и т.п.:  ");
        tNote = scanner.nextLine();
        while (onceMore) {
            onceMore = false;
            System.out.print("Введите вероятность выпадания игрушки, число:  ");
            tempStr = scanner.nextLine();
            if (tempStr.length() <= 2 && tempStr.matches("[.0-9]+")) {
                tFreq = Integer.parseInt(tempStr);
                onceMore = false;
                break;
            } else {
                System.out.println("Введено неверное значение, попробуем еще раз.");
                onceMore = true;
            }
        }
        Toy t = new Toy(tFreq, tType, tNote);
        Toy.toysList.add(t);
        System.out.println("Завершаем Assortment.addToy()");
    }

    /**
     * Метод создания первоначального тестового списка игрушек
     */
    public static void startArray() {

        Toy toy1 = new Toy(1, "конструктор", "металлический");
        toysList.add(toy1);
        Toy toy2 = new Toy(2, "робот", "красный");
        toysList.add(toy2);
        Toy toy3 = new Toy(3, "кукла", "Маша");
        toysList.add(toy3);

    }

    public static void printToysList() {
        for (int i = 0; i < toysList.size(); i++) {
            System.out.println(toysList.get(i));
        }
    }

    public static void toFile(String fileName) throws Exception {
//        System.out.println("Пошли печатать в файл ================================");
        ArrayList<Toy> arr = Toy.toysList;
        System.out.println("arr.size() = " + arr.size());
        String tempStr = "";
        FileWriter writer = new FileWriter(fileName);
        try {
            for (int i = 0; i < arr.size(); i++) {
                tempStr = String.valueOf(arr.get(i).id) + ";" +
                        String.valueOf(arr.get(i).frequency) + ";" +
                        String.valueOf(arr.get(i).toyType) + ";" +
                        String.valueOf(arr.get(i).note);
//                System.out.println("tempStr = " + tempStr);
                writer.write(tempStr);
                writer.append('\n');
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void fromFile(String fileName) {
        String tempStr = "";
//        String tempStrArr[];
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String tStr = scanner.nextLine();
                String tempStrArr[] = tStr.split(";");
                Toy t = new Toy(Integer.parseInt(tempStrArr[1]), tempStrArr[2], tempStrArr[3]);
                Toy.toysList.add(t);
                System.out.println(t);
            }
        } catch(Exception e) {
                    e.printStackTrace();
        }


    }
    public static int Get(){
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Генерируем случайное число от 1 до 100

        if (randomNumber < 20) {
            return 1; // 20% вероятность выпадения числа 1
        } else if (randomNumber < 40) {
            return 2; // 20% вероятность выпадения числа 2
        } else {
            return 3; // 60% вероятность выпадения числа 3
        }
    }
    public static int doubleGet() {
        Random random = new Random();
        double randNum = random.nextDouble();

        if (randNum < 0.2) {
            return 1;
        } else if (randNum < 0.2) {
            return 2;
        } else {
            return 3;
        }
    }

    public static void accortmentPrompt() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("***************** МЕНЮ РЕДАКТИРОВАНИЯ СПИСКА ИГРУШЕК **********************");
        System.out.println();
        String str = "Выберите нужное действие, введя с клавиатуры соответствующую цифру:  " + "\n";
        str += "1 - Добавить игрушку" + "\n";
        str += "2 - Удалить игрушку" + "\n";
        str += "клавиша 'Enter' - выйти в главное меню" + "\n";
        str += "Ваш выбор:";
        System.out.print(str);
    }
    public static void assortmentMenu() {
        boolean getOut = false;
        String str = "";
        ArrayList<Toy> arr = Toy.toysList;
        accortmentPrompt();
        Scanner scanner = new Scanner(System.in);
        while (!getOut) {
            str = scanner.nextLine();
            switch (str) {
                case ("1"):
                    addToy();
                    getOut = true;
                    break;
                case ("2"):
                    System.out.print("Введите id удаляемой игрушки: ");
                    String strId = scanner.nextLine();
                    int foundIndex = Toy.findById(strId);
                    if (strId.matches("[0-9]+") && foundIndex > 0){
                        Toy.delete(String.format("%d",foundIndex));
                    }
                    break;
                case (""):
                    getOut = true;
                    break;

            } // switch

        } // while
    }
}