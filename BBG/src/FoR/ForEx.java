package FoR;

import java.util.Scanner;

public class ForEx {
// 1  출력예) ********** (5행10열)
//            **********
//            **********
//            **********
//            **********
// 2   출력예) 1 1 1 1 1
//            2 2 2 2 2
//            3 3 3 3 3
//            4 4 4 4 4
//            5 5 5 5 5
// 3   출력예) 1 2 3 4 5
//            1 2 3 4 5
//            1 2 3 4 5
//            1 2 3 4 5
//            1 2 3 4 5
// 4   출력예) 2 3 4 5 6
//            3 4 5 6 7
//            4 5 6 7 8
//            5 6 7 8 9
//            6 7 8 9 10
// 5    출력예) 2 * 1 =  2          3 * 1 =  3          4 * 1 =  4
//            2 * 2 =  4          3 * 2 =  6          4 * 2 =  8
//            ....
//            2 * 9 = 18          3 * 9 = 27          4 * 9 = 36
//    문제) 행과 열의 소를 입력받아 아래와 같이 출력하는 프로그램
//    입력예) 3 4
//    출력예) 1 2 3 4
//            2 4 6 8
//            3 6 9 12

//    입력예) 5 3 (3 5 의 결과도 동일)
//    출력예) 5 * 1 = 5          4 * 1 = 4          3 * 1 = 3
//            ...
//            5 * 9 = 45         4 * 9 = 36        3 * 9 = 27
//    출력예) *
//            **
//            ***
//    입력예) 5
//    출력예) *
//            **
//            ***
//            ****
//            *****
    public static void main(String[] args) {
        System.out.println("===============1===============");
        for (int i = 0 ; i < 5 ; i++) {
            for (int j = 0 ; j <= 10 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("===============2===============");
        for (int i = 1 ; i <= 5 ; i++) {
            for (int j = 0; j < 5 ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("===============3===============");

        for (int i = 1 ; i <= 5 ; i++) {
            for (int j = 1; j <= 5 ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("================4==============");
        for (int i = 0 ; i < 5 ; i++) {
            for (int j = 2; j <= 6 ; j++) {
                System.out.print(j+i + " ");
            }
            System.out.println();
        }
        System.out.println("================5==============");

        for (int i = 2; i < 10 ; i++) {
            for (int j = 1 ; j < 5 ; j++) {
                System.out.printf("%d * %d = %2d\t", j, i, j*i);
            }
            System.out.println();
        }
//        System.out.println("================6==============");
        Scanner scanner = new Scanner(System.in);
//        System.out.println("행을 입력해주세요");
//        int row = scanner.nextInt();
//        System.out.println("열을 입력해주세요");
//        int col = scanner.nextInt();
//
//        for (int i = 1 ; i <= row ; i++) {
//            for (int j = 1 ; j <= col; j++) {
//                System.out.print(i * j + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("================7==============");
//        System.out.println("숫자를 입력해주세요");
//        int num1 = scanner.nextInt();
//        System.out.println("숫자를 입력해주세요");
//        int num2 = scanner.nextInt();
//        int tmp;
//        if(num1 < num2) {
//            tmp = num1;
//            num1 = num2;
//            num2 = tmp;
//        }
//        for (int i = 1; i <= 9 ; i++) {
//            for (int j = num2 ; j <= num1 ; j++) {
//                System.out.printf("%d * %d = %2d\t", j, i, j*i);
//            }
//            System.out.println();
//        }
        System.out.println("================8==============");
        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("================9==============");
        System.out.println("숫자를 입력해주세요. >");
        int no = scanner.nextInt();

        for (int i = 0 ; i< no ; i++) {
            for (int j = 0 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
