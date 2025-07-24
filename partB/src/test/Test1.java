package test;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        StudentScore sana = new StudentScore();
        StudentScore momo = new StudentScore("김모모", 78, 100, 88);

        sana.updateScores(99, 90, 89);
        momo.setKor(99);
        momo.updateScores(99, 90, 89);

        System.out.println();
        System.out.println("sana 성적 : " + Arrays.toString(sana.getScores()) 
                           + " avg : " + sana.getAverage() + ",");
        // sana 성적 : [99, 90, 89] avg :92.66,A

        System.out.println("momo 성적 : " + Arrays.toString(momo.getScores()) 
                           + " avg : " + momo.getAverage() + ",");
        // momo 성적 : [99, 90, 89] avg :93.33,A
    }
}

class StudentScore {
    private String name;
    // 국어, 영어, 수학 점수를 저장하는 배열
    private int[] scores;

    // 상수 정의 (배열 인덱스)
    private static final int KOR = 0;
    private static final int ENG = 1;
    private static final int MATH = 2;

    // 기본 생성자
    public StudentScore() {
        this.scores = new int[3];  // 3개 과목
    }

    // 매개변수 생성자
    public StudentScore(String name, int kor, int eng, int math) {
        this.name = name;
        this.scores = new int[3];
        this.scores[KOR] = kor;
        this.scores[ENG] = eng;
        this.scores[MATH] = math;
    }

        // 이름 getter/setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 국어 점수 getter/setter
    public int getKor() {
        return scores[KOR];
    }

    public void setKor(int kor) {
        this.scores[KOR] = kor;
    }

    // 영어 점수 getter/setter
    public int getEng() {
        return scores[ENG];
    }

    public void setEng(int eng) {
        this.scores[ENG] = eng;
    }

    // 수학 점수 getter/setter
    public int getMath() {
        return scores[MATH];
    }

    public void setMath(int math) {
        this.scores[MATH] = math;
    }

    // 점수 배열 전체 getter
    public int[] getScores() {
        return Arrays.copyOf(scores, scores.length);  // 배열 복제
    }

        // 총점 계산
    public int getTotal() {
        int total = 0;
        for (int score : scores) {
            total += score;   // 5.
        }
        return total;
    }

    // 평균 계산
    public double getAverage() {  // 소수점 이하 2자리로 리턴하기
        return Math.floor((getTotal() / (double)scores.length) * 100) / 100;  // 6.
    }

    // 등급 계산 (평균 기준)
    public String getGrade() {
        int avg = (int)getAverage();   // 7.
        return switch (avg / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };
    }

    // 모든 점수 업데이트
    public void updateScores(int kor, int eng, int math) {
        this.scores[KOR] = kor;    // 8.
        this.scores[ENG] = eng;    // 9.
        this.scores[MATH] = math;  // 10.
    }

    // 최고 점수 찾기
    public int getMaxScore() {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {   // 11.
                max = scores[i];
            }
        }
        return max;
    }


    
    }

    


