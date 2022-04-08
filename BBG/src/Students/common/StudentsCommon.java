package Students.common;

import Students.Exception.KoreanOnlyException;
import org.w3c.dom.ranges.RangeException;

import java.util.Scanner;

public class StudentsCommon {
    static Scanner scanner = new Scanner(System.in);

    public static int nextInt(String text) {
        return Integer.parseInt(nextLine(text));
    }
    public static int nextInt(String text, int from, int to) throws RangeException {
        int val = Integer.parseInt(nextLine(text));
        if(val < from || val > to);
        return val;
    }

    public static String nextLine(String text) {
        System.out.print(text);
        return scanner.nextLine();
    }
    public static String nextInt(String text, int from) {
        return text;
    }

    public static String nextLine(String text, boolean flag) throws KoreanOnlyException {
        System.out.print(text);
        String str = "";
        if(flag) {
            str = scanner.nextLine();
            for(int i = 0 ; i < str.length() ; i++) {
                if(str.charAt(i) < '가' || str.charAt(i) > '힣')
                    throw new KoreanOnlyException("한글로 구성된 이름을 입력하세요");
            }
        }
        return str;
    }
}
