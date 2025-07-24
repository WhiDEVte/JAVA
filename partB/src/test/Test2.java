package test;

public class Test2 {

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
