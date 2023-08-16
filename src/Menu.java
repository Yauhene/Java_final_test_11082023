import Assortment.Assortment;
import Toy.Toy;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void startPrompt() {
        System.out.println();
        System.out.println("***************** ГЛАВНОЕ МЕНЮ **********************");
        System.out.println();
        String str = "Выберите нужное действие, введя с клавиатуры соответствующую цифру:  " + "\n";
        str += "1 - Редактировать список игрушек (добавить/удалить)" + "\n";
        str += "2 - Показать список игрушек в консоли" + "\n";
        str += "3 - Создать список призов" + "\n";
        str += "4 - Запустить тираж" + "\n";
        str += "клавиша 'Enter' - выйти из программы" + "\n";
        str += "Ваш выбор: ";
        System.out.print(str);
    }
    public static void startMenu(ArrayList<Toy> arr) {
        boolean getOut = false;
        String choice = "start";
        Scanner scanner = new Scanner(System.in);
        while (!getOut) {
            startPrompt();
            choice = scanner.nextLine();
            if (choice.equals("")) {
                System.out.println("Выбрано: пустая строка");
            }
            switch (choice) {
                case ("1"):
                    Assortment.assortmentMenu();
                    break;
                case ("2"):
                    Assortment.printToysList();
                    break;
                case (""):
                    getOut = true;
                    System.out.println("getOut = true");
                    break;
                default:
                    System.out.println("Что-то пошло не так...");

            } // switch


        } // while
    }
}
