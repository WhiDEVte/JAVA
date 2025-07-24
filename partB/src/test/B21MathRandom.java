package test;

import java.util.Arrays;

public class B21MathRandom {
    public static void main(String[] args) {
        int[] result = new int[6];
        int[] balls = new int[45];

        // 1. 1~45로 초기화
        for(int i = 0; i < 45; i++){
            balls[i] = i + 1;
        }

        System.out.println("---- 추첨 과정 ----");
        for(int i = 0; i < 6; i++){
            int range = balls.length;
            double rndNum = Math.random();
            int ballIndex = (int)(rndNum * range);

            //랜덤 인덱스로 공 뽑기 -> result 배열에 저장
            result[i] = balls[ballIndex];
            System.out.println((i + 1) + "번째 추첨: " + result[i]);

            // 선택된 인덱스 제외하고 새로운 배열 만들기
            balls = removeIndex(balls, ballIndex);
        }  

        System.out.println("\n==== 최종 추첨 번호 ====");
        System.out.println(Arrays.toString(result));
    }

    /*
     * 특정 인덱스를 제거한 새 배열 생성
     */
    private static int[] removeIndex(int[] original, int removeIdx) {
        int[] newArray = new int[original.length - 1];
        for (int i = 0, j = 0; i < original.length; i++) {
            if (i != removeIdx) {
                newArray[j++] = original[i];
            }
        }
        return newArray;
    }

    // 아래 메소드는 이번 버전에선 사용하지 않지만
    // 네 코드에 있던 mergeOfArray 예제 참고용으로 남겨둠
    private static int[] mergeOfArray(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }
}
