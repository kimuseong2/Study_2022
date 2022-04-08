package Students.vo;

public class StudentsVo {

    // 학생 번호
    private int no;

    // 학생 이름
    private String name;

    private int score[] = new int[3];



    public int[] getScore() {
        return score;
    }

    public void setScore(int[] score) {
        this.score = score;
    }

    public StudentsVo(int no, String name, int kor, int eng, int mat) {
        this.no = no;
        this.name = name;
        score[0] = kor;
        score[1] = eng;
        score[2] = mat;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return score[0];
    }

    public void setKor(int kor) {
        score[0] = kor;
    }

    public int getEng() {
        return score[1];
    }

    public void setEng(int eng) {
        score[1] = eng;
    }

    public int getMat() {
        return score[2];
    }

    public void setMat(int mat) {
        score[2] = mat;
    }

    public int getTotal() {
//        return score[0] + score[1] + score[2];
        int total = 0;
        for (int i : score) {
            total += i;
        }
        return total;
    }

    public double getAvg() {
        return (getTotal() * 100 / score.length) / 100d;
    }


    @Override
    public String toString() {
        String str =  String.format("%4d  %8s  %4d  %.2f",
                no, name, getTotal(), getAvg());
        for(int s : score) {
            str += String.format("  %4d", s);
        }
        return str;
    }
}
