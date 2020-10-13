package team.view;/*
 * 项目中提供了TSUtility.java类，可用来方便地实现键盘访问
 *
 * */

import java.util.*;

public class TSUtility {
    private static Scanner scanner = new Scanner(System.in);

    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.println("选择错误，请重新输入：");
            } else break;

        }
        return c;
    }

    /*该方法提示并等待，直到用户按回车键后返回*/
    public static void readReturn() {
        System.out.println("按回车键继续...");
        readKeyBoard(100, true);
    }

    /*该方法从键盘读取一个长度不超过2位的整数，并将其作为方法的返回值*/
    public static int readInt() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(2, false);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("数字输入错误，情重新输入：");
            }
        }
        return n;
    }

    /*从键盘读取'Y'或'N'，并将其作为方法的返回值*/
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.println("选择错误，请重新输入：");
            }
        }
        return c;
    }

    private static String readKeyBoard(int limit, boolean blankReturn) {
        String line = "";
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.length() == 0) {
                if (blankReturn) return line;
                else continue;
            }

            if (line.length() < 1 || line.length() > limit) {
                System.out.println("输入长度（不大于" + limit + "）错误，请重新输入：");
                continue;
            }
            break;

        }
        return line;
    }

}
