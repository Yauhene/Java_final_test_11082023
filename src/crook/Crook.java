package crook;

import Toy.Toy;

import java.util.ArrayList;
import java.util.Random;

public class Crook {
    public int strokeSteps = 3; // минимальное количество генераций в такте
    public int strokePos = 0; // состояние такта, от 0 до 2, три состояния
    public int[] resArray = {0, 0, 0};
    public int tempRes;

//    public Crook() {
//        this.resArray = resArray;
//        this.strokePos = strokePos;
//        this.strokeSteps = strokeSteps;
//    }

//    /**
//     * Метод проверки наличия в тактовой матрице resArray значения vol
//     * В случае отсутствия - внесение в тактовую матрицу
//     * @param vol
//     * @return
//     */
//    public boolean checkVol(int vol) {
//        System.out.println("........... Работаем в crook.checkVol ...............");
//        boolean res = false;
//        System.out.println("vol = " + vol);
//
//        if (resArray[vol-1] == vol)  {
//            System.out.println("resArray[vol-1] == vol");
//            res = true;
//        }
//        else {
//            res = false;
//            System.out.println("Значения нет в resArray");
//            if (this.strokePos == this.strokeSteps ) {
//                resArray[vol-1] = vol;
//                resArray = new int[]{0,0,0};
//                strokePos = 0;
//            }
//            else {
//                resArray[vol - 1] = vol;
//                strokePos++;
//            }
//            printResArray();
////            if (this.strokePos == this.strokeSteps) {
////
////            }
//        }
//
//        return res;
//    }
//    public void printResArray() {
//        for (int i = 0; i < resArray.length; i++) {
//            System.out.println("resArray[" + i +"] = " + resArray[i]);
//        }
//    }
    /**
     * Метод формирует список призов по заданным типам игрушек в соответствии с их весом (частотой выпадания)
     *
     * @param prizesCount длина списка призов
     * @param cat_1 первый тип призов
     * @param cat_2 второй тип призов
     * @param cat_3 третий тип призов
     * @return
     */
    public static ArrayList<Toy> createListOfPrizes(int prizesCount, String cat_1, String cat_2, String cat_3) {
        ArrayList<Toy> cat_1_list = new ArrayList<>();
        ArrayList<Toy> cat_2_list = new ArrayList<>();
        ArrayList<Toy> cat_3_list = new ArrayList<>();
        ArrayList<Toy> all_list = new ArrayList<>();
        int pos;
        // получаем количество игрушек данного типа исходя из длины общего призового списка и
        // веса игрушек данного типа
        cat_1_list = thisTypeArray(Toy.toysList, cat_1); // отбор игрушек по типу cat_1
        int cat_1_count = prizesCount * cat_1_list.get(0).frequency / 100;
//        System.out.println("cat_1_count = " + cat_1_count);
        Random random = new Random();
        for (int i = 0; i < cat_1_count; i++) {
            if (cat_1_list.size() > 1) {
                pos = random.nextInt(cat_1_list.size());
            }
            else {
                pos = 0;
            }
//            System.out.println("pos = " + pos);
//            all_list.add(cat_1_list.get(pos));
        }
//        System.out.println("Добавили \"" + cat_1 + "\" -------------------------------------");
//        printArr(all_list);
        cat_2_list = thisTypeArray(Toy.toysList, cat_2); // отбор игрушек по типу cat_2
//        System.out.println("Размер списка \"" + cat_2 + "\": " + cat_2_list.size());
        int cat_2_count = prizesCount * cat_2_list.get(0).frequency / 100;
        Random random2 = new Random();
        for (int i = 0; i < cat_2_count; i++) {
            if (cat_2_list.size() > 1) {
                pos = random2.nextInt(cat_2_list.size());
            }
            else {
                pos = 0;
            }
//            System.out.println("pos = " + pos);
//            all_list.add(cat_2_list.get(pos));
        }
//        System.out.println("Добавили \"" + cat_2 + "\" -------------------------------------");
//        printArr(all_list);

        cat_3_list = thisTypeArray(Toy.toysList, cat_3); // // отбор игрушек по типу cat_3
        int cat_3_count = prizesCount * cat_3_list.get(0).frequency / 100;
        for (int i = 0; i < cat_3_count; i++) {
            if (cat_3_list.size() > 1) {
                pos = random2.nextInt(cat_3_list.size());
            }
            else {
                pos = 0;
            }
//            System.out.println("pos = " + pos);
//            all_list.add(cat_3_list.get(pos));
        }
//        System.out.println("Добавили \"" + cat_3 + "\" -------------------------------------");
//        printArr(all_list);
        return all_list;
    }

    /**
     * Метод отфильтровывает нужный тип игрушек из общего ассортимента (списка игрушек) и возвращает
     * массив игрушек одного типа
     * @param cat
     * @return
     */
    public static ArrayList<Toy> thisTypeArray(ArrayList<Toy> arr, String cat) {
        ArrayList<Toy> toysThisType = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).toyType.equals(cat)) {
                toysThisType.add(arr.get(i));
            }
        }
        printArr(toysThisType);
        return toysThisType;
    }

    public static void printArr(ArrayList<Toy> arr) {
        for (Toy toy : arr) {
            System.out.println(toy);
        }
    }
}
