package Lotto;

import java.util.Random;

public class LottoProgram {
    public static void main(String[] args) {
        // 로또 번호를 생성할 Random 객채 random 생성
        Random random = new Random();

        // 로또 번호를 담을 크기가 6인 정수형 배열 생성
        int lotto[] = new int[6];


        //배열의 크기만큼 i를 반복한다
        for (int i = 0 ; i < lotto.length ; i++) {
            // 1번째 배열에 1~45까지의 랜덤 수를 담는다.
            lotto[i] = random.nextInt(45) + 1;
            System.out.println("처음에 담긴 로또 값 :" + lotto[i]);
            // j를 0부터 i전까지 반복한다.
            for (int j = 0 ; j < i ; j++) {
                // 현재(i) 번째 들어간 랜덤 수와 이전(j)번째의 랜덤수와 같다면
                if (lotto[i] == lotto[j]) {
                    // i를 감소시킨다.
                    // > i를 감소시켜 i번째 값을 바꾼다.
                    i--;
                    // 이후 반복은 필요없으므로 j반복문을 나간다.
                    break;
                }
            }
        }
        System.out.println("로또 프로그램");
        // 배열 길이만큼 k를 반복한다.
        for (int k = 0 ; k < lotto.length ; k++) {
            System.out.println(lotto[k] + " ");
        }
    }
}
