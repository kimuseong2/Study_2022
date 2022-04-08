package Students.service;


// Service 기능 수행

import Students.Exception.KoreanOnlyException;
import Students.vo.StudentsVo;
import static Students.common.StudentsCommon.*;
import java.util.ArrayList;
import java.util.List;

public class StudentsServiceImpl implements StudentsService{
    int count;
        // 오버라이드
        // 더미 생성
        private List<StudentsVo> list = new ArrayList<>();
    {
        list.add(new StudentsVo(1,"최강한",90,80,75));
        list.add(new StudentsVo(2,"강힘찬",80,59,98));
        list.add(new StudentsVo(3,"김동안",70,95,59));
        list.add(new StudentsVo(4,"유빛나",54,79,99));
    }

    @Override
    public void add() {
        int no = nextInt("학번을 입력하세요");
        String name = nextLine("이름을 입력하세요");
        int kor = nextInt("국어점수를 입력해주세요");
        int eng = nextInt("국어점수를 입력해주세요");
        int mat = nextInt("국어점수를 입력해주세요");

        list.add(new StudentsVo(no,name,kor,eng,mat));
        printArray(list);

    }

    @Override
    public void list() {
        printArray(list);
    }

    @Override
    public void modify() throws KoreanOnlyException {
        list();
        int no = nextInt("수정하실 학번을 입력해주세요.");
        StudentsVo studentsVo = findBy(no);

        if (studentsVo == null) {
            System.out.println("학생이 존재 하지 않습니다.");
            return;
        }
        String name = nextLine("수정될 학생의 이름 >", true);
        studentsVo.setName(name);
        studentsVo.setKor(nextInt("국어점수를 수정해주세요."));
        studentsVo.setEng(nextInt("영어점수를 수정해주세요."));
        studentsVo.setMat(nextInt("수학점수를 수정해주세요."));

    }

    public void delete() {
        list();
        int no = nextInt("삭제할 학번을 입력해주세요. >");
        list.remove(findBy(no));
    }
    public void printTitle() {
        System.out.println("==================================================");
        System.out.println("  학번      이름   총점    평균   국어   영어   수학");
        System.out.println("==================================================");
    }

    public void printArray(List<StudentsVo> arr) {
        printTitle();
        for (int i = 0 ; i < arr.size(); i ++) {
            System.out.println(arr.get(i));
        }
    }

    public StudentsVo findBy(int no) {
        for (int i = 0 ; i < list.size() ; i++) {
            if (list.get(i).getNo() == no) {
                return list.get(i);
            }
        }
        return null;
    }
}
