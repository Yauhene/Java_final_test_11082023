//package Get;
//
//import crook.Crook;
//
//import java.util.Random;
//
//public class cGet {
////    public static int callsTotal = 0;
////    public static int calls_1 = 0;
////    public static int calls_2 = 0;
////    public static int calls_3 = 0;
//    public int strokeSteps = 3; // минимальное количество генераций в такте
//    public int strokePos = 0; // состояние такта, от 0 до 2, три состояния
//    public int[] resArray = {0, 0, 0};
//    public static int Get(Crook crook) {
//        int genRes = 0;
//        int result = 0;
//        boolean getOut = false;
//        Random random = new Random();
//        result = random.nextInt(100) + 1;
////        System.out.println(" ==================== Приступаем к генерации: =====================");
//        while(!getOut) {
////            System.out.println("Еще попыточка..... +++++++++++++++++++++++++++++++++++++++++");
//            genRes = random.nextInt(100) + 1;
////            System.out.println("genRes = " + genRes);
//            if (genRes <= 20) {
//                result = 1;
//            } else if (genRes <= 40 & result > 20) {
//                result = 2;
//            }
//            else {
//                result = 3;
//            }
//            getOut = crook.checkVol(result);
//        }
//
//                return result;
//    }
//
//    public boolean checkArr(int[] arr, int vol) {
//        boolean res = false;
//        for (int i = 0; i < strokeSteps; i++) {
//            if (arr[i] == vol) {
//                res = true;
//                break;
//            }
//        }
//        return res;
//    }
//}
