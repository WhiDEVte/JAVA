package day09;

import java.util.*;

// 사용자 정보 및 게임 결과를 저장하는 클래스
class GameValue {
    String gamer;         // 참가자 이름
    int 시도횟수;          // 총 시도한 횟수
    boolean 성공여부;     // 성공 여부 (true: 성공, false: 실패)

    // 생성자: 이름, 시도횟수, 성공여부를 받아서 객체 생성
    public GameValue(String gamer, int 시도횟수, boolean 성공여부) {
        this.gamer = gamer;
        this.시도횟수 = 시도횟수;
        this.성공여부 = 성공여부;
    }

    // 결과 출력 메서드
    public void showResult() {
        System.out.println("\nGameValue 객체 확인");
        System.out.printf("gamer : %s, 시도횟수 : %d, 성공여부 : %b\n", gamer, 시도횟수, 성공여부);
    }
}

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // 사용자 입력을 위한 Scanner 객체
        Random rand = new Random();            // 랜덤 숫자 생성을 위한 Random 객체

        // 게임 시작 안내 메시지 출력
        System.out.println("[[[[[ 숫자게임을 시작합니다.]]]]]");
        System.out.println("- AI는 숫자를 결정했습니다. -");
        System.out.println("- 너 휴먼은 맞춰보세요.(숫자는 1부터 50 안에서 정하세요.) -");
        System.out.println("@@@ 시도 제한 횟수는 5입니다. @@@");

        // 반복해서 사용자 이름을 입력받아 게임 시작
        while (true) {
            System.out.print("\n참가자 닉네임 (종료:end) >>> ");
            String name = sc.nextLine();   // 참가자 이름 입력

            if (name.equals("end")) {      // "end" 입력 시 프로그램 종료
                System.out.println("::프로그램 종료::");
                break;
            }

            int answer = rand.nextInt(50) + 1; // 1~50 범위의 정답 숫자 생성
            int count = 0;                     // 시도 횟수 초기화
            boolean success = false;           // 성공 여부 초기화
            List<Integer> inputList = new ArrayList<>();  // 입력한 숫자 저장 리스트

            // 숫자 맞추기 시도 (최대 5번까지)
            do {
                System.out.printf("너가 생각한 숫자 입력 (남은 기회 : %d) >>> ", 5 - count);
                int guess = sc.nextInt();     // 숫자 입력
                inputList.add(guess);         // 입력 숫자 저장
                count++;                      // 시도 횟수 증가

                // 입력값과 정답 비교
                if (guess < answer) {
                    System.out.println("아닙니다. 더 큰 숫자입니다.");
                } else if (guess > answer) {
                    System.out.println("아닙니다. 더 작은 숫자입니다.");
                } else {
                    System.out.println("딩동댕!! 정답입니다!");
                    success = true;          // 정답 맞춘 경우 성공 처리
                    break;
                }
            } while (count < 5);              // 최대 5회까지 반복

            // 결과 출력
            System.out.println("√ 정답 : " + answer + " 시도 횟수 : " + count);
            System.out.println("√ 입력한 숫자 : " + inputList);
            if (success) {
                System.out.println("숫자 맞추기 성공!!");
            } else {
                System.out.println("실패!! 5번의 기회를 다 썼습니다. 게임을 다시 시작하세요.!!");
            }

            // GameValue 객체 생성 및 결과 출력
            GameValue gv = new GameValue(name, count, success);
            gv.showResult();

            sc.nextLine();  // 입력 버퍼 비우기 (nextInt 이후 nextLine을 위해 필요)
        }
        sc.close(); // 자원 정리
    }
}
