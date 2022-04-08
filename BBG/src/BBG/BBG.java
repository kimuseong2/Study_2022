package BBG;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BBG {
    public static void main(String[] args) {

        // 정답을 키보드로 받기 위한 스캐너 객체 생성
        Scanner scanner = new Scanner(System.in);
        // 랜덤한 숫자를  생성하기 위한 랜덤 객체 생성
        Random rd = new Random();


        // 랜덤한 숫자를 담을 크기가 3인 정수형 배열
        int baseNum[] = new int[3];
        // 입력한 정답을 담을 크기가 3인 정수형 배열
        int resNum[] = new int[3];

        String s = "";
        // 숫자는 맞지만 위치가 틀렸을때 카운트할 변수 생성
        int ball;
        // 숫자,위치 모두 맞았을때 카운트할 변수 생성
        int strike;
        // 도전 횟수를 카운트할 변수 생성
        int cnt = 0;

        // 중복없이 맞출 숫자를 생성 > 로또와 같은 과정
        for (int i = 0 ; i < baseNum.length ; i++) {
            baseNum[i] = rd.nextInt(10);
            for (int j = 0 ; j < i ; j++) {
                if (baseNum[i] == baseNum[j]) {
                    i--;
                    break;
                }
            }
        }

        // 시험용 정답을 미리 알려줌
        System.out.println(baseNum[0] + "" + baseNum[1] + "" + baseNum[2]);

        while (true) {
            // 한 번 시도 할 때마다 값을 0으로 초기화 시켜준다
            strike = 0;
            ball = 0;

            System.out.println("=================");
            System.out.println("맞출 세 자리 수를 입력 예)3 5 9");
            System.out.println("            >");
            // 세 자리의 숫자를 입력받아 저장한다.
            for (int k = 0 ; k < resNum.length ; k++) {
                System.out.println(k+1 +"번째 숫자");
                resNum[k] = scanner.nextInt();


                while (resNum[k] >= 10 ) {

                    System.out.println("한자리 숫자만 입력 해주세요");
                    resNum[k] = scanner.nextInt();
                }
                for (int i = 0 ; i < k ; i++) {
                    if (resNum[i] == resNum[k]) {
                        System.out.println("중복된 숫자입니다.다시 입력해주세요 (중복된 숫자" + resNum[i] + ")");
                        i--;
                        resNum[k] = scanner.nextInt();
                    }
                }


            }

            // 배열의 길이만큼 반복한다.
            for (int l = 0 ; l < baseNum.length ; l++) {
                // 배열의 길이만큼 반복한다.
                for (int m = 0 ; m < resNum.length ; m++) {
                    //정답의 l번째 값과 입력한 정답의 m번째 값이 같고, 위치 또한 같다면
                    if (baseNum[l]==resNum[m]&& l==m) {
                        // strike를 증가
                        strike++;
                    }
                    // 정답의 1번째 값과 입력한 정답의 m번째 값만 같다면..
                    else if (baseNum[l] == resNum[m]) {
                        ball++;
                    }
                }
            }
            System.out.println("=====================================");
            // 시도 횟수를 증가
            cnt++;
            //strike도 ball도 증가 된 값이 없다면 > 아무것도 맞추지 못함
            if (strike == 0 && ball == 0) {
                System.out.println("OUT입니다.");
                // 무한루프를 막기 위한 break;

            }
            // 세 숫자를 모두 맞춘 경우
            if (strike == 3) {
                System.out.println(cnt + "번 만에 도전 성공!  >" + resNum[0]+ ""+ resNum[1]+ "" + resNum[2]);

                break;
            }

            System.out.println(strike + "Strike | " + ball + "Ball" );
            System.out.println(resNum[0]+ ""+ resNum[1]+ "" + resNum[2]);
        }
    }
}
