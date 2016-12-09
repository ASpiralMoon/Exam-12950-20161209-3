package exam;

import java.util.Scanner;

/**
 * Created by ASpiralMoon on 2016/12/9.
 */
public class Exam3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入日期: ");
        while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println("你输入的日期为当年的第" + exam(s) + "天");
        }
    }

    public static int exam(String s) {

        int m = Integer.valueOf(s.substring(0, 4));
        int i = Integer.valueOf(s.substring(5, 7));
        int j = Integer.valueOf(s.substring(8, 10));
        int n = 0;
            switch (i) {
                case 1:
                    n = j;
                    break;
                case 2:
                    n = 31 + j;
                    break;
                case 3:
                    n = 59 + j;
                    break;
                case 4:
                    n = 90 + j;
                    break;
                case 5:
                    n = 120 + j;
                    break;
                case 6:
                    n = 151 + j;
                    break;
                case 7:
                    n = 181 + j;
                    break;
                case 8:
                    n = 212 + j;
                    break;
                case 9:
                    n = 243 + j;
                    break;
                case 10:
                    n = 273 + j;
                    break;
                case 11:
                    n = 304 + j;
                    break;
                case 12:
                    n = 334 + j;
            }
        if (m % 4 == 0 && i > 2) {
            n++;
        }
        return n;
    }


}
