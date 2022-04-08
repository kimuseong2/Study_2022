package Students.ex;

import Students.Exception.KoreanOnlyException;
import Students.service.StudentsService;
import Students.service.StudentsServiceImpl;
import org.w3c.dom.ranges.RangeException;

import static Students.common.StudentsCommon.nextInt;

public class Ex {
    public static void main(String[] args) {
        StudentsService service = new StudentsServiceImpl();
        while (true) {
            try {
                execute(service);
            }
            catch (NumberFormatException e) {
                System.out.println("정확한 숫자를 입력해주세요");
            }
            catch (RangeException | KoreanOnlyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
        static void execute(StudentsService service) throws KoreanOnlyException {
            int in = nextInt("1. 입력 | 2. 조회 | 3.수정 | 4.삭제");
            switch (in) {
                case 1 :
                    service.add();
                    break;
                case 2 :
                    service.list();
                    break;
                case 3 :
                    service.modify();
                    break;
                case 4:
                    service.delete();
            }
        }



    }
